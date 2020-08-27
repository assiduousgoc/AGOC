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
import com.ass.client.GMSUserClient;
import com.ass.smtfp.model.UserData;
import com.ass.smtfp.model.UsersDto;

@Controller
public class UsersController {

	@Autowired
	private GMSBranchClient b_client;

	@Autowired
	private GMSCityClient c_client;

	@Autowired
	private GMSUserClient u_client;

	@RequestMapping(value = "/users.htm", method = RequestMethod.GET)
	public String branch(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("users", u_client.get(user.getToken()));
		return "users";
	}

	@RequestMapping(value = "/user-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		UserData user_data = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("cities", c_client.get(user_data.getToken()));
		model.addAttribute("branches", b_client.get(user_data.getToken()));
		return new ModelAndView("user-form", "user", new UsersDto());
	}

	@RequestMapping(value = "/add-user.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute UsersDto user, Model model, HttpServletRequest req) {
		UserData user_data = (UserData) req.getSession().getAttribute("user");
		try {
			u_client.save(user_data.getToken(), user);
			return "redirect:/users.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/user-form.htm";
	}

	@RequestMapping(value = "/user-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user_data = (UserData) req.getSession().getAttribute("user");
		try {
			model.addAttribute("cities", c_client.get(user_data.getToken()));
			model.addAttribute("branches", b_client.get(user_data.getToken()));
			return new ModelAndView("user-detail", "user", u_client.get(user_data.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/users.htm");
	}

	@RequestMapping(value = "/update-user.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute UsersDto user, Model model, HttpServletRequest req) {
		UserData user_data = (UserData) req.getSession().getAttribute("user");
		try {
			u_client.update(user_data.getToken(), user);
			return "redirect:/users.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/user-details.htm?id=" + user.getId();
	}

	@RequestMapping(value = "/delete-user.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user_data = (UserData) req.getSession().getAttribute("user");
		try {
			u_client.delete(user_data.getToken(), id);
			return "redirect:/users.htm";
		} catch (Exception e) {
		}
		return "redirect:/users.htm";
	}

}
