package com.ass.ass.gym.controller;

import java.text.SimpleDateFormat;

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
import com.ass.client.GMSCourseClient;
import com.ass.client.GMSTraineeClient;
import com.ass.smtfp.model.TraineeDto;
import com.ass.smtfp.model.UserData;

@Controller
public class TraineeController {
	
	@Autowired
	private GMSCourseClient cs_client;
	
	@Autowired
	private GMSBranchClient b_client;
	
	@Autowired
	private GMSCityClient c_client;
	
	@Autowired
	private GMSTraineeClient t_client;
	

	@RequestMapping(value = "/trainees.htm", method = RequestMethod.GET)
	public String gym(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("trainees", t_client.get(user.getToken()));
		return "trainees";
	}
	
	@RequestMapping(value = "/trainee-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("courses", cs_client.get(user.getToken()));
		model.addAttribute("branches", b_client.get(user.getToken()));
		model.addAttribute("cities", c_client.get(user.getToken()));
		return new ModelAndView("trainee-form", "trainee", new TraineeDto());
	}
	
	@RequestMapping(value = "/add-trainee.htm", method = RequestMethod.POST)
	public String add(@ModelAttribute TraineeDto trainee, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			t_client.save(user.getToken(), trainee);
			return "redirect:/trainees.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/trainee-form.htm";
	}

	@RequestMapping(value = "/trainee-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			model.addAttribute("courses", cs_client.get(user.getToken()));
			model.addAttribute("branches", b_client.get(user.getToken()));
			model.addAttribute("cities", c_client.get(user.getToken()));
			TraineeDto dto = t_client.get(user.getToken(), id);
			model.addAttribute("formatted_doj", new SimpleDateFormat("dd/MM/yyyy").format(dto.getDoj()));
			model.addAttribute("formatted_due", new SimpleDateFormat("dd/MM/yyyy").format(dto.getDueDate()));
			dto.setDoj(null);
			dto.setDueDate(null);
			return new ModelAndView("trainee-detail", "trainee", dto);
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/trainees.htm");
	}

	@RequestMapping(value = "/update-trainee.htm", method = RequestMethod.POST)
	public String update(@ModelAttribute TraineeDto trainee, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			t_client.update(user.getToken(), trainee);
			return "redirect:/trainees.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/trainee-details.htm?id=" + trainee.getId();
	}

	@RequestMapping(value = "/delete-trainee.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			t_client.delete(user.getToken(), id);
			return "redirect:/trainees.htm";
		} catch (Exception e) {
		}
		return "redirect:/trainees.htm";
	}

	@RequestMapping(value = "/active-trainee.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			t_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/trainees.htm");
	}
	
	@RequestMapping(value = "/deactive-trainee.htm", method = RequestMethod.GET)
	public ModelAndView inactive(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			t_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/trainees.htm");
	}
}
