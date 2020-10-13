package com.ass.ass.restaurent.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ass.smtfp.model.UserData;
import com.ass.smtfp.restaurant.model.FoodTypeDto;

@Controller
public class CategoryController {

	@RequestMapping("/categoryList.htm")
	public String roomList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		return "categoryList";
	}

	@RequestMapping(value = "/creatCategory.htm", method = RequestMethod.GET)
	public ModelAndView createBank(Model model, HttpServletRequest req) {
		return new ModelAndView("creatCategory", "food-cat", new FoodTypeDto());
	}

	@RequestMapping(value = "/add-food-type.htm", method = RequestMethod.POST)
	public String save(@ModelAttribute FoodTypeDto food_cat, HttpServletRequest req) {

		return "redirect:categoryList.htm";
	}

	@RequestMapping(value = "/upload-image.htm", method = RequestMethod.POST)
	public String upload(@RequestPart("file") MultipartFile file, @RequestParam("id") Integer id,
			HttpServletRequest req) {

		return "redirect:categoryList.htm";
	}

}
