package com.ass.smtfp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ass.client.GMSUserClient;
import com.ass.retaurant.client.CommonUserClient;
import com.ass.smtfp.dao.ContactDAO;
import com.ass.smtfp.enums.ModuleType;
import com.ass.smtfp.model.UserData;
import com.ass.smtfp.model.UserLoginDto;

@Controller
public class HomeController {

	@Autowired
	private GMSUserClient gym_user_client;

	@Autowired
	private CommonUserClient common_user_client;

	@Autowired
	ContactDAO contactDao;

	@RequestMapping("/dashboard.htm")
	public String home(@RequestParam(value = "services") String services,
			@RequestParam(value = "quat_fullname") String quat_fullname,
			@RequestParam(value = "password") String password, Model model, HttpServletRequest req) {

		if (services.equals("RMS")) {
			UserData user = common_user_client.login(new UserLoginDto(quat_fullname, password, ModuleType.RESTAURANT));
			if (user != null) {
				req.getSession().setAttribute("user", user);
				System.out.println(" User Role : " + user.getRole());
				return "restaurentdashboard";
			}
			return "redirect:client-login.htm";
		} else if (services.equals("HMS") && password.equals("Jmd@7556")) {
			return "hospitaldashboard";
		} else if (services.equals("GMS")) {
			UserData user = gym_user_client.login(new UserLoginDto(quat_fullname, password, ModuleType.GYM));
			if (user != null) {
				req.getSession().setAttribute("user", user);
				System.out.println(" User Role : " + user.getRole());
				return "gymdashboard";
			}
			return "redirect:client-login.htm";

		} else if (services.equals("AMS") && password.equals("Jmd@7556")) {
			return "attendancedashboard";
		} else if (services.equals("OM")) {
			final String redirectUrl = "redirect:http://www.onlinemarts.in/admin";
			return redirectUrl;
		} else if (services.equals("BS")) {
			final String redirectUrl = "redirect:http://www.onlinemarts.in/CA";
			return redirectUrl;
		} else {
			return "redirect:client-login.htm";
		}

	}

	@RequestMapping("/home.htm")
	public String home() {
		System.out.println("INSIDE HOME");
		// contactDao.getUser("9910487886", "").getName()
		return "home";
	}

	@RequestMapping("/page.htm")
	public String page(@RequestParam(value = "pageNo") String pageNo, Model model) {
		System.out.println("PageNo: " + pageNo);
		model.addAttribute("pageNo", pageNo);
		return "page";
	}

	@RequestMapping("/about-us.htm")
	public String aboutUs(Model model) {
		System.out.println("About Us : ");
		model.addAttribute("pageNo", "");
		return "aboutus";
	}

	@RequestMapping("/offer.htm")
	public String offer(Model model) {
		System.out.println("offer Page : ");
		model.addAttribute("pageNo", "");
		return "offer";
	}

	@RequestMapping("/contact-us.htm")
	public String contactUs(Model model) {
		System.out.println("contactUs Page : ");
		model.addAttribute("pageNo", "");
		return "contactUs";
	}

	@RequestMapping("/enquiry.htm")
	public String enquiry(Model model) {
		System.out.println("enquiry Page : ");
		model.addAttribute("pageNo", "");
		return "enquiry";
	}

	@RequestMapping("/client-login.htm")
	public String cLogin(Model model) {
		System.out.println("enquiry Page : ");
		model.addAttribute("pageNo", "");
		return "clientLogin";
	}
}
