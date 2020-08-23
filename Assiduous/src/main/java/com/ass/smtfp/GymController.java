package com.ass.smtfp;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSCourseClient;
import com.ass.smtfp.model.CourseDto;
import com.ass.smtfp.model.UserData;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

@Controller
public class GymController {

	@Autowired
	private GMSCourseClient gym_course_client;

	@RequestMapping("/gymdashboard.htm")
	public String gymdashboard(Model model) {
		System.out.println("gymdashboard Page : ");
		model.addAttribute("gymdashboard", "");
		return "gymdashboard";
	}

	@RequestMapping("/courseSchedule.htm")
	public String menuList(Model model) {
		System.out.println("courseSchedule Page : ");
		model.addAttribute("courseSchedule", "");
		return "courseSchedule";
	}

	@RequestMapping("/createSchedule.htm")
	public String createSchedule(Model model) {
		System.out.println("createSchedule Page : ");
		model.addAttribute("createSchedule", "");
		return "createSchedule";
	}

	

	@RequestMapping("/addCourse.htm")
	public String addCourse(Model model) {
		System.out.println("createCourses Page : ");
		model.addAttribute("createCourses", "");
		return "addCourse";
	}

	

	

	@RequestMapping("/saveTrainer.htm")
	public String saveTrainer(Model model, @RequestParam(value = "trainername") String trainername) {
		System.out.println("saveRoom Page : " + trainername);
		model.addAttribute("createCourses", "");
		return "redirect:/trainerList.htm";
	}

	@RequestMapping("/saveCustomer23.htm")
	public String saveCustomer(Model model, @RequestParam(value = "customerName") String customerName) {
		System.out.println("customerName Page : " + customerName);
		model.addAttribute("createCourses", "");
		return "redirect:/gymcustomerList.htm";
	}


	

	@RequestMapping("/trainerList.htm")
	public String trainerList(Model model) {
		System.out.println("trainerList Page : ");
		model.addAttribute("trainerList", "");
		return "trainerList";
	}

	@RequestMapping("/addTrainer.htm")
	public String addTrainer(Model model) {
		System.out.println("addTrainer Page : ");
		model.addAttribute("addTrainer", "");
		return "addTrainer";
	}

	@RequestMapping("/gymcustomerList.htm")
	public String customerList(Model model) {
		System.out.println("gymcustomerList Page : ");
		model.addAttribute("gymcustomerList", "");
		return "gymcustomerList";
	}

	@RequestMapping("/addGymCustomer.htm")
	public String addGymCustomer(Model model) {
		System.out.println("addGymCustomer Page : ");
		model.addAttribute("addGymCustomer", "");
		return "addGymCustomer";
	}

	@RequestMapping("/attendance.htm")
	public String attendance(Model model) {
		System.out.println("attendance Page : ");
		model.addAttribute("attendance", "");
		return "attendance";
	}

	@RequestMapping("/customersProfile.htm")
	public String customersProfile(Model model) {
		System.out.println("customersProfile Page : ");
		model.addAttribute("customersProfile", "");
		return "customersProfile";
	}

	@RequestMapping("/paymentList.htm")
	public String paymentList(Model model) {
		System.out.println("paymentList Page : ");
		model.addAttribute("paymentList", "");
		return "paymentList";
	}

	@RequestMapping("/couponList.htm")
	public String couponList(Model model) {
		System.out.println("couponList Page : ");
		model.addAttribute("couponList", "");
		return "couponList";
	}

	@RequestMapping("/generateCoupon.htm")
	public String generateCoupon(Model model) {
		System.out.println("generateCoupon Page : ");
		model.addAttribute("generateCoupon", "");
		return "generateCoupon";
	}

	@RequestMapping(value = { "/saveCoupon.htm" }, method = RequestMethod.POST)

	public ModelAndView saveCoupon(Model model, @RequestParam(value = "couponName") String couponName,
			@RequestParam(value = "sdate") String sdate, @RequestParam(value = "edate") String edate,
			@RequestParam(value = "description") String description, @RequestPart("file") MultipartFile file,
			HttpServletRequest request) throws JsonParseException, JsonMappingException, RuntimeException, IOException {

		System.out.println("Save Coupon  Page : " + couponName);
		model.addAttribute("generateCoupon", "");
		return new ModelAndView("redirect:couponList.htm");
		// return "redirect:/couponList.htm";
	}

	@RequestMapping("/gymSetting.htm")
	public String gymSetting(Model model) {
		System.out.println("gymSetting Page : ");
		model.addAttribute("gymSetting", "");
		return "gymSetting";
	}
	/*
	 * @RequestMapping("/invoiceList.htm") public String invoiceList(Model model) {
	 * System.out.println("invoiceList Page : "); model.addAttribute("invoiceList",
	 * ""); return "invoiceList"; }
	 * 
	 * @RequestMapping("/sales.htm") public String sales(Model model) {
	 * System.out.println("sales Page : "); model.addAttribute("sales", ""); return
	 * "sales"; }
	 * 
	 * @RequestMapping("/addProduct.htm") public String addProduct(Model model) {
	 * System.out.println("addProduct Page : "); model.addAttribute("addProduct",
	 * ""); return "addProduct"; }
	 * 
	 * @RequestMapping("/productGrid.htm") public String productGrid(Model model) {
	 * System.out.println("productGrid Page : "); model.addAttribute("productGrid",
	 * ""); return "productGrid"; }
	 * 
	 * @RequestMapping("/order.htm") public String order(Model model) {
	 * System.out.println("order Page : "); model.addAttribute("order", ""); return
	 * "order"; }
	 * 
	 * @RequestMapping("/logout.htm") public String logout(Model model) {
	 * System.out.println("order Page : "); model.addAttribute("order", ""); return
	 * "redirect:client-login.htm"; }
	 */
}
