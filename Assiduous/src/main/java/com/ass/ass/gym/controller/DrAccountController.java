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

import com.ass.client.GMSDrAccountClient;
import com.ass.smtfp.model.DrAccountDto;
import com.ass.smtfp.model.UserData;

@Controller
public class DrAccountController {

	@Autowired
	private GMSDrAccountClient dr_client;

	@RequestMapping(value = "/drAccount.htm", method = RequestMethod.GET)
	public String drAccountList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("debits", dr_client.get(user.getToken()));
		return "drAccount";
	}

	@RequestMapping(value = "/addDrAccount.htm", method = RequestMethod.GET)
	public ModelAndView addDrAccount(Model model, HttpServletRequest req) {
		return new ModelAndView("addDrAccount", "dr", new DrAccountDto());
	}

	@RequestMapping(value = "/save-dr.htm", method = RequestMethod.POST)
	public String saveDrAccount(Model model, HttpServletRequest req, @ModelAttribute DrAccountDto dr) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			DrAccountDto drAccounts = dr_client.save(user.getToken(), dr);
			model.addAttribute("createDr", drAccounts);
			return "redirect:/drAccount.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addDrAccount.htm";

		}
	}

	@RequestMapping(value = "/dr-details.htm", method = RequestMethod.GET)
	public ModelAndView drDetail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		return new ModelAndView("dr-detail", "dr", dr_client.get(user.getToken(), id));
	}

	@RequestMapping(value = "/update-dr.htm", method = RequestMethod.POST)
	public String updateCrAccount(Model model, HttpServletRequest req, @ModelAttribute DrAccountDto dr) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			DrAccountDto drAccounts = dr_client.update(user.getToken(), dr);
			model.addAttribute("updateCr", drAccounts);
			return "redirect:/drAccount.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addDrAccount.htm";

		}
	}

	@RequestMapping(value = "/delete-dr.htm", method = RequestMethod.GET)
	public String deleteDr(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		dr_client.delete(user.getToken(), id);
		return "redirect:/drAccount.htm";
	}
}
