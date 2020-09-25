package com.ass.smtfp;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RestaurentController
{
	@RequestMapping("/restaurentdashboard.htm")
	public String restaurentdashboard(Model model)
	{
		System.out.println("menu Page : ");
		model.addAttribute("menu", "");
		return "restaurentdashboard";
	}
	@RequestMapping("/menuList.htm")
	public String menuList(Model model)
	{
		System.out.println("menu Page : ");
		model.addAttribute("menu", "");
		return "menuList";
	}
	@RequestMapping("/customerList.htm")
	public String customerList(Model model)
	{
		System.out.println("customerList Page : ");
		model.addAttribute("customerList", "");
		return "customerList";
	}
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
	}
}
