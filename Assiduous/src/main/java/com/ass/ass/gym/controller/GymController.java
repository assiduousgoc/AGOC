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
import com.ass.client.GMSGymClient;
import com.ass.client.GMSLocationClient;
import com.ass.smtfp.model.GymDto;
import com.ass.smtfp.model.UserData;

@Controller
public class GymController {

	@Autowired
	private GMSLocationClient l_client;

	@Autowired
	private GMSCityClient c_client;

	@Autowired
	private GMSGymClient g_client;

	@RequestMapping(value = "/gyms.htm", method = RequestMethod.GET)
	public String get(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("gyms", g_client.get(user.getToken()));
		return "gyms";
	}

	@RequestMapping(value = "/gym-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("locations", l_client.get(user.getToken()));
		model.addAttribute("cities", c_client.get(user.getToken()));
		return new ModelAndView("gym-form", "gym", new GymDto());
	}

	@RequestMapping(value = "/add-gym.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute GymDto gym, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			g_client.save(user.getToken(), gym);
			return "redirect:/gyms.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/gym-form.htm";
	}

	@RequestMapping(value = "/gym-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			model.addAttribute("locations", l_client.get(user.getToken()));
			model.addAttribute("cities", c_client.get(user.getToken()));
			return new ModelAndView("gym-detail", "gym", g_client.get(user.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/gyms.htm");
	}

	@RequestMapping(value = "/update-gym.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute GymDto gym, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			g_client.update(user.getToken(), gym);
			return "redirect:/gyms.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/gym-details.htm?id=" + gym.getId();
	}

	@RequestMapping(value = "/delete-gym.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			g_client.delete(user.getToken(), id);
			return "redirect:/gyms.htm";
		} catch (Exception e) {
		}
		return "redirect:/gyms.htm";
	}

	@RequestMapping(value = "/active-gym.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			g_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/gyms.htm");
	}

	@RequestMapping(value = "/deactive-gym.htm", method = RequestMethod.GET)
	public ModelAndView inactive(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			g_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/gyms.htm");
	}
}
