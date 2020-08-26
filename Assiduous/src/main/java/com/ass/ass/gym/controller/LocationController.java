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

import com.ass.client.GMSLocationClient;
import com.ass.smtfp.model.LocationDto;
import com.ass.smtfp.model.UserData;

@Controller
public class LocationController {

	@Autowired
	private GMSLocationClient l_client;

	@RequestMapping(value = "/locations.htm", method = RequestMethod.GET)
	public String gym(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("locations", l_client.get(user.getToken()));
		return "locations";
	}

	@RequestMapping(value = "/location-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		return new ModelAndView("location-form", "location", new LocationDto());
	}

	@RequestMapping(value = "/add-location.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute LocationDto location, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			l_client.save(user.getToken(), location);
			return "redirect:/locations.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/location-form.htm";
	}

	@RequestMapping(value = "/location-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			return new ModelAndView("location-detail", "location", l_client.get(user.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/locations.htm");
	}

	@RequestMapping(value = "/update-location.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute LocationDto location, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			l_client.update(user.getToken(), location);
			return "redirect:/locations.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/location-details.htm?id=" + location.getId();
	}

	@RequestMapping(value = "/delete-location.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			l_client.delete(user.getToken(), id);
			return "redirect:/locations.htm";
		} catch (Exception e) {
		}
		return "redirect:/locations.htm";
	}

	@RequestMapping(value = "/active-location.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			l_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/locations.htm");
	}
	
	@RequestMapping(value = "/deactive-location.htm", method = RequestMethod.GET)
	public ModelAndView inactive(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			l_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/locations.htm");
	}
}
