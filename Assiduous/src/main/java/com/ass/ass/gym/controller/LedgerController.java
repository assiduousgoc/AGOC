package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LedgerController {

	@RequestMapping(value = "/ledger.htm", method = RequestMethod.GET)
	public String gym(Model model, HttpServletRequest req) {
		
		return "ledger";
	}
}
