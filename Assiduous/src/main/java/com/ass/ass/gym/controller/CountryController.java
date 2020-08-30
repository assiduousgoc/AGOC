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
import com.ass.smtfp.model.CountryDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CountryController {

	@Autowired
	private GMSCountryClient c_client;

	@RequestMapping(value = "/countries.htm", method = RequestMethod.GET)
	public String get(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("countries", c_client.get(user.getToken()));
		return "countries";
	}

	@RequestMapping(value = "/country-form.htm", method = RequestMethod.GET)
	public ModelAndView form() {
		return new ModelAndView("country-form", "country", new CountryDto());
	}

	@RequestMapping(value = "/add-country.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute CountryDto country, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			c_client.save(user.getToken(), country);
			return "redirect:/countries.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/country-form.htm";
	}

	@RequestMapping(value = "/country-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			return new ModelAndView("country-detail", "country", c_client.get(user.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/countries.htm");
	}

	@RequestMapping(value = "/update-country.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute CountryDto country, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			c_client.update(user.getToken(), country);
			return "redirect:/countries.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/country-details.htm?id=" + country.getId();
	}

	@RequestMapping(value = "/delete-country.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			c_client.delete(user.getToken(), id);
			return "redirect:/countries.htm";
		} catch (Exception e) {
		}
		return "redirect:/countries.htm";
	}

}
