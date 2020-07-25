package com.ass.smtfp;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AttendanceController
{
	
	
	@RequestMapping("/attendanceList.htm")
	public String attendanceList(Model model)
	{
		System.out.println("attendanceList Page : ");
		model.addAttribute("attendanceList", "");
		return "attendanceList";
	}
}
