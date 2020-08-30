package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ass.client.GMSGymClient;
import com.ass.client.GMSLedgerClient;
import com.ass.client.GMSTraineeClient;
import com.ass.smtfp.model.GymDto;
import com.ass.smtfp.model.LedgerDto;
import com.ass.smtfp.model.TraineeDto;
import com.ass.smtfp.model.UserData;

@Controller
public class InvoiceController {
	
	@Autowired
	private GMSLedgerClient l_client;
	
	@Autowired
	private GMSGymClient g_client;
	
	@Autowired
	private GMSTraineeClient t_client;
	
	@RequestMapping(value = "/invoice.htm", method = RequestMethod.GET)
	public String duePayment(Model model, HttpServletRequest req,@RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		LedgerDto ledger= l_client.get(user.getToken(), id);
		TraineeDto trainee = t_client.get(user.getToken(), id);
		//GymDto gym= g_client.get(user.getToken(), user.getId());
		model.addAttribute("invoice",req.getParameter("invoice"));
		model.addAttribute("ledger",ledger);
		model.addAttribute("tax",ledger.getAmount()*25/100);
		model.addAttribute("totalAmount",(ledger.getAmount()+ledger.getAmount()*25/100));
		model.addAttribute("trainee",trainee);
		model.addAttribute("user",user);
		return "invoice";
	}
}
