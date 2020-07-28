package com.ass.smtfp;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController
{
	@RequestMapping("/dashboard.htm")
	public String home(@RequestParam(value = "services") String services,@RequestParam(value = "quat_fullname") String quat_fullname,@RequestParam(value = "password") String password, Model model)
	{
		System.out.println("INSIDE Restaurent Dashboard"+services+": quat_fullname==>"+quat_fullname+": password==>"+password);
		if(services.equals("RMS") && password.equals("Jmd@7556")) {
			return "restaurentdashboard";
		}else if(services.equals("HMS")&& password.equals("Jmd@7556")) {
			return "hospitaldashboard";
		}else if(services.equals("GMS")&& password.equals("Jmd@7556")) {
			return "gymdashboard";
		}else if(services.equals("AMS")&& password.equals("Jmd@7556")) {
			return "attendancedashboard";
		}else if(services.equals("OM")) {
			final String redirectUrl = "redirect:http://www.onlinemarts.in/admin";
			return redirectUrl;
		}else if(services.equals("BS")) {
			final String redirectUrl = "redirect:http://www.onlinemarts.in/CA";
			return redirectUrl;
		}else {
		return "restaurentdashboard";
		}
		
	}
	@RequestMapping("/home.htm")
	public String home()
	{
		System.out.println("INSIDE HOME");
		return "home";
	}

	@RequestMapping("/page.htm")
	public String page(@RequestParam(value = "pageNo") String pageNo, Model model)
	{
		System.out.println("PageNo: " + pageNo);
		model.addAttribute("pageNo", pageNo);
		return "page";
	}
	@RequestMapping("/about-us.htm")
	public String aboutUs(Model model)
	{
		System.out.println("About Us : ");
		model.addAttribute("pageNo", "");
		return "aboutus";
	}
	@RequestMapping("/offer.htm")
	public String offer(Model model)
	{
		System.out.println("offer Page : ");
		model.addAttribute("pageNo", "");
		return "offer";
	}
	@RequestMapping("/contact-us.htm")
	public String contactUs(Model model)
	{
		System.out.println("contactUs Page : ");
		model.addAttribute("pageNo", "");
		return "contactUs";
	}
	@RequestMapping("/enquiry.htm")
	public String enquiry(Model model)
	{
		System.out.println("enquiry Page : ");
		model.addAttribute("pageNo", "");
		return "enquiry";
	}
	@RequestMapping("/client-login.htm")
	public String cLogin(Model model)
	{
		System.out.println("enquiry Page : ");
		model.addAttribute("pageNo", "");
		return "clientLogin";
	} 
}
