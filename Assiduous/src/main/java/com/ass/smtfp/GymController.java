package com.ass.smtfp;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GymController
{
	
	
	@RequestMapping("/gymdashboard.htm")
	public String gymdashboard(Model model)
	{
		System.out.println("gymdashboard Page : ");
		
		model.addAttribute("gymdashboard", "");
		return "gymdashboard";
	}
	@RequestMapping("/courseSchedule.htm")
	public String menuList(Model model)
	{
		System.out.println("courseSchedule Page : ");
		model.addAttribute("courseSchedule", "");
		return "courseSchedule";
	}
	@RequestMapping("/createSchedule.htm")
	public String createSchedule(Model model)
	{
		System.out.println("createSchedule Page : ");
		model.addAttribute("createSchedule", "");
		return "createSchedule";
	}
	@RequestMapping("/courseList.htm")
	public String coursesList(Model model)
	{
		System.out.println("coursesList Page : ");
		model.addAttribute("coursesList", "");
		return "coursesList";
	}
	@RequestMapping("/addCourse.htm")
	public String addCourse(Model model)
	{
		System.out.println("createCourses Page : ");
		model.addAttribute("createCourses", "");
		return "addCourse";
	}
	@RequestMapping("/roomList.htm")
	public String roomList(Model model)
	{
		System.out.println("roomList Page : ");
		model.addAttribute("roomList", "");
		return "roomList";
	}
	@RequestMapping("/addRoom.htm")
	public String addRoom(Model model)
	{
		System.out.println("addRoom Page : ");
		model.addAttribute("addRoom", "");
		return "addRoom";
	}
	@RequestMapping("/trainerList.htm")
	public String trainerList(Model model)
	{
		System.out.println("trainerList Page : ");
		model.addAttribute("trainerList", "");
		return "trainerList";
	}
	@RequestMapping("/addTrainer.htm")
	public String addTrainer(Model model)
	{
		System.out.println("addTrainer Page : ");
		model.addAttribute("addTrainer", "");
		return "addTrainer";
	}
	@RequestMapping("/gymcustomerList.htm")
	public String customerList(Model model)
	{
		System.out.println("gymcustomerList Page : ");
		model.addAttribute("gymcustomerList", "");
		return "gymcustomerList";
	}
	@RequestMapping("/addGymCustomer.htm")
	public String addGymCustomer(Model model)
	{
		System.out.println("addGymCustomer Page : ");
		model.addAttribute("addGymCustomer", "");
		return "addGymCustomer";
	}
	@RequestMapping("/attendance.htm")
	public String attendance(Model model)
	{
		System.out.println("attendance Page : ");
		model.addAttribute("attendance", "");
		return "attendance";
	}
	@RequestMapping("/customersProfile.htm")
	public String customersProfile(Model model)
	{
		System.out.println("customersProfile Page : ");
		model.addAttribute("customersProfile", "");
		return "customersProfile";
	}
	@RequestMapping("/paymentList.htm")
	public String paymentList(Model model)
	{
		System.out.println("paymentList Page : ");
		model.addAttribute("paymentList", "");
		return "paymentList";
	}
	@RequestMapping("/couponList.htm")
	public String couponList(Model model)
	{
		System.out.println("couponList Page : ");
		model.addAttribute("couponList", "");
		return "couponList";
	}
	@RequestMapping("/generateCoupon.htm")
	public String generateCoupon(Model model)
	{
		System.out.println("generateCoupon Page : ");
		model.addAttribute("generateCoupon", "");
		return "generateCoupon";
	}
	@RequestMapping("/gymSetting.htm")
	public String gymSetting(Model model)
	{
		System.out.println("gymSetting Page : ");
		model.addAttribute("gymSetting", "");
		return "gymSetting";
	}
	/*
	@RequestMapping("/invoiceList.htm")
	public String invoiceList(Model model)
	{
		System.out.println("invoiceList Page : ");
		model.addAttribute("invoiceList", "");
		return "invoiceList";
	}
	@RequestMapping("/sales.htm")
	public String sales(Model model)
	{
		System.out.println("sales Page : ");
		model.addAttribute("sales", "");
		return "sales";
	}
	@RequestMapping("/addProduct.htm")
	public String addProduct(Model model)
	{
		System.out.println("addProduct Page : ");
		model.addAttribute("addProduct", "");
		return "addProduct";
	}
	@RequestMapping("/productGrid.htm")
	public String productGrid(Model model)
	{
		System.out.println("productGrid Page : ");
		model.addAttribute("productGrid", "");
		return "productGrid";
	}
	@RequestMapping("/order.htm")
	public String order(Model model)
	{
		System.out.println("order Page : ");
		model.addAttribute("order", "");
		return "order";
	}
	@RequestMapping("/logout.htm")
	public String logout(Model model)
	{
		System.out.println("order Page : ");
		model.addAttribute("order", "");
		return "redirect:client-login.htm";
	}*/
}
