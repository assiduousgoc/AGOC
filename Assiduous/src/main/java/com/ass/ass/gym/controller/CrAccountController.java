package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSCrAccountClient;
import com.ass.smtfp.model.CrAccountDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CrAccountController {

	@Autowired
	private GMSCrAccountClient cr_client;

	@RequestMapping(value = "/crAccount.htm", method = RequestMethod.GET)
	public String crAccountList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("credits", cr_client.get(user.getToken()));
		return "crAccount";
	}

	@RequestMapping(value = "/addCrAccount.htm", method = RequestMethod.GET)
	public ModelAndView addCrAccount(Model model, HttpServletRequest req) {
		return new ModelAndView("addCrAccount", "cr", new CrAccountDto());
	}

	@RequestMapping(value = "/save-cr.htm", method = RequestMethod.POST)
	public String saveCrAccount(Model model, HttpServletRequest req, @ModelAttribute CrAccountDto cr) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			CrAccountDto crAccounts = cr_client.save(user.getToken(), cr);
			model.addAttribute("createCr", crAccounts);
			return "redirect:/crAccount.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addCrAccount.htm";

		}
	}

	@RequestMapping(value = "/cr-details.htm", method = RequestMethod.GET)
	public ModelAndView crDetail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		return new ModelAndView("cr-detail", "cr", cr_client.get(user.getToken(), id));
	}

	@RequestMapping(value = "/update-cr.htm", method = RequestMethod.POST)
	public String updateCrAccount(Model model, HttpServletRequest req, @ModelAttribute CrAccountDto cr) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			CrAccountDto crAccounts = cr_client.update(user.getToken(), cr);
			model.addAttribute("updateCr", crAccounts);
			return "redirect:/crAccount.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addCrAccount.htm";

		}
	}

	@RequestMapping(value = "/delete-cr.htm", method = RequestMethod.GET)
	public String deleteAccount(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		cr_client.delete(user.getToken(), id);
		return "redirect:/crAccount.htm";
	}
	@RequestMapping(value = "/addResCr.htm", method = RequestMethod.GET)
	public String addResCr(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		/*cr_client.delete(user.getToken(), id);*/
		System.out.println("************ CR Account************");
		return "addResCr";
	}
}
