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

import com.ass.client.GMSCityClient;
import com.ass.client.GMSStateClient;
import com.ass.smtfp.model.CityDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CityController {

	@Autowired
	private GMSCityClient c_client;

	@Autowired
	private GMSStateClient s_client;

	@RequestMapping(value = "/cities.htm", method = RequestMethod.GET)
	public String gym(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("cities", c_client.get(user.getToken()));
		return "cities";
	}

	@RequestMapping(value = "/city-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("states", s_client.get(user.getToken()));
		return new ModelAndView("city-form", "city", new CityDto());
	}

	@RequestMapping(value = "/add-city.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute CityDto city, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			c_client.save(user.getToken(), city);
			return "redirect:/cities.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/city-form.htm";
	}

	@RequestMapping(value = "/city-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			model.addAttribute("states", s_client.get(user.getToken()));
			return new ModelAndView("city-detail", "city", c_client.get(user.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/cities.htm");
	}

	@RequestMapping(value = "/update-city.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute CityDto city, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			c_client.update(user.getToken(), city);
			return "redirect:/cities.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/city-details.htm?id=" + city.getId();
	}

	@RequestMapping(value = "/delete-city.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			c_client.delete(user.getToken(), id);
			return "redirect:/cities.htm";
		} catch (Exception e) {
		}
		return "redirect:/cities.htm";
	}
}
