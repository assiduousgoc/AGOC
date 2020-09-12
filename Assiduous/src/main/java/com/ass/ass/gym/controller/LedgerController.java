package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ass.client.GMSLedgerClient;
import com.ass.client.GMSTraineeClient;
import com.ass.smtfp.model.UserData;

@Controller
public class LedgerController {

	@Autowired
	private GMSLedgerClient l_client;

	@Autowired
	private GMSTraineeClient t_client;

	@RequestMapping(value = "/ledgers.htm", method = RequestMethod.GET)
	public String gym(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("ledgers", l_client.get(user.getToken()));
		req.setAttribute("invoice", req.getParameter("invoice")); 
		return "ledgers";
	}

	@RequestMapping(value = "/dues.htm")
	public String dues(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("dues", t_client.getDues(user.getToken()));
		return "dues";
	}
}
