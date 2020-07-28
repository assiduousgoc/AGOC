package com.ass.smtfp;

/*
 * Copyright 2020 Assiduous, All Rights Reserved.
 */

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HospitalController
{
	@RequestMapping("/hospitaldashboard.htm")
	public String home()
	{
		System.out.println("INSIDE hospital Dashboard");
		return "hospitaldashboard";
	}
}
