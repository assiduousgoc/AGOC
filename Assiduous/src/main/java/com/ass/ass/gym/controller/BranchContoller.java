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

import com.ass.client.GMSBranchClient;
import com.ass.client.GMSCityClient;
import com.ass.client.GMSGymClient;
import com.ass.client.GMSLocationClient;
import com.ass.smtfp.model.BranchDto;
import com.ass.smtfp.model.UserData;

@Controller
public class BranchContoller {

	@Autowired
	private GMSLocationClient l_client;

	@Autowired
	private GMSCityClient c_client;

	@Autowired
	private GMSGymClient g_client;

	@Autowired
	private GMSBranchClient b_client;

	@RequestMapping(value = "/branches.htm", method = RequestMethod.GET)
	public String get(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("branches", b_client.get(user.getToken()));
		return "branches";
	}

	@RequestMapping(value = "/branch-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("locations", l_client.get(user.getToken()));
		model.addAttribute("cities", c_client.get(user.getToken()));
		model.addAttribute("gyms", g_client.get(user.getToken()));
		return new ModelAndView("branch-form", "branch", new BranchDto());
	}

	@RequestMapping(value = "/add-branch.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute BranchDto branch, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			b_client.save(user.getToken(), branch);
			return "redirect:/branches.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/branch-form.htm";
	}

	@RequestMapping(value = "/branch-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			model.addAttribute("locations", l_client.get(user.getToken()));
			model.addAttribute("cities", c_client.get(user.getToken()));
			model.addAttribute("gyms", g_client.get(user.getToken()));
			return new ModelAndView("branch-detail", "branch", b_client.get(user.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/branches.htm");
	}

	@RequestMapping(value = "/update-branch.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute BranchDto branch, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			b_client.update(user.getToken(), branch);
			return "redirect:/branches.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/branch-details.htm?id=" + branch.getId();
	}

	@RequestMapping(value = "/delete-branch.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			b_client.delete(user.getToken(), id);
			return "redirect:/branches.htm";
		} catch (Exception e) {
		}
		return "redirect:/branches.htm";
	}

	@RequestMapping(value = "/active-branch.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			b_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/branches.htm");
	}

	@RequestMapping(value = "/deactive-branch.htm", method = RequestMethod.GET)
	public ModelAndView inactive(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			b_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/branches.htm");
	}
}
