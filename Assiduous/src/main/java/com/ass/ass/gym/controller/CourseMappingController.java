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
import com.ass.client.GMSCourseClient;
import com.ass.client.GMSCourseMappingClient;
import com.ass.smtfp.model.CourseMappingDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CourseMappingController {

	@Autowired
	private GMSCourseClient course_client;

	@Autowired
	private GMSCourseMappingClient coursemapping_client;

	@Autowired
	private GMSBranchClient b_client;

	@RequestMapping(value = "/courseMapping.htm", method = RequestMethod.GET)
	public String courseMappingList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("cms", coursemapping_client.get(user.getToken()));
		return "courseMappingList";
	}

	@RequestMapping(value = "/addCourseMapping.htm", method = RequestMethod.GET)
	public ModelAndView addCourseMapping(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("branches", b_client.get(user.getToken()));
		model.addAttribute("courses", course_client.get(user.getToken()));
		return new ModelAndView("addCourseMapping", "cm", new CourseMappingDto());
	}

	@RequestMapping(value = "/save-cm.htm", method = RequestMethod.POST)
	public String saveCm(Model model, HttpServletRequest req, @ModelAttribute CourseMappingDto cm) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			CourseMappingDto createCourseMapping = coursemapping_client.save(user.getToken(), cm);
			model.addAttribute("createCourseMapping", createCourseMapping);
			return "redirect:/courseMapping.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addCourseMapping.htm";
		}
	}

	@RequestMapping(value = "/cm-detail.htm", method = RequestMethod.GET)
	public ModelAndView cmDetail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("branches", b_client.get(user.getToken()));
		model.addAttribute("courses", course_client.get(user.getToken()));
		return new ModelAndView("cm-detail", "cm", coursemapping_client.get(user.getToken(), id));
	}

	@RequestMapping(value = "/update-cm.htm", method = RequestMethod.POST)
	public String updateCm(Model model, HttpServletRequest req, @ModelAttribute CourseMappingDto cm) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			CourseMappingDto createCourseMapping = coursemapping_client.update(user.getToken(), cm);
			model.addAttribute("createCourseMapping", createCourseMapping);
			return "redirect:/courseMapping.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addCourseMapping.htm";
		}
	}

	@RequestMapping(value = "/delete-cm.htm", method = RequestMethod.GET)
	public String deleteCm(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		coursemapping_client.delete(user.getToken(), id);
		return "redirect:/courseMapping.htm";
	}
}
