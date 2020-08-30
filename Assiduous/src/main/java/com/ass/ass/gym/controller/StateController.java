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

import com.ass.client.GMSCountryClient;
import com.ass.client.GMSStateClient;
import com.ass.smtfp.model.StateDto;
import com.ass.smtfp.model.UserData;

@Controller
public class StateController {

	@Autowired
	private GMSStateClient s_client;

	@Autowired
	private GMSCountryClient c_client;

	@RequestMapping(value = "/states.htm", method = RequestMethod.GET)
	public String get(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("states", s_client.get(user.getToken()));
		return "states";
	}

	@RequestMapping(value = "/state-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("countries", c_client.get(user.getToken()));
		return new ModelAndView("state-form", "state", new StateDto());
	}

	@RequestMapping(value = "/add-state.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute StateDto state, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			s_client.save(user.getToken(), state);
			return "redirect:/states.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/state-form.htm";
	}

	@RequestMapping(value = "/state-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			model.addAttribute("countries", c_client.get(user.getToken()));
			return new ModelAndView("state-detail", "state", s_client.get(user.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/states.htm");
	}

	@RequestMapping(value = "/update-state.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute StateDto state, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			s_client.update(user.getToken(), state);
			return "redirect:/states.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/state-details.htm?id=" + state.getId();
	}

	@RequestMapping(value = "/delete-state.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			s_client.delete(user.getToken(), id);
			return "redirect:/states.htm";
		} catch (Exception e) {
		}
		return "redirect:/states.htm";
	}
}
