package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ass.client.GMSLedgerClient;
import com.ass.client.GMSPaymentClient;
import com.ass.smtfp.model.LedgerDto;
import com.ass.smtfp.model.PayDto;
import com.ass.smtfp.model.UserData;

@Controller
public class DuesController {

	@Autowired
	private GMSLedgerClient l_client;
	
	@Autowired
	private GMSPaymentClient p_client;
	
	@RequestMapping(value = "/due.htm", method = RequestMethod.GET)
	public String gym(Model model, HttpServletRequest req) {
		
		return "due";
	}
	@RequestMapping(value = "/duePayment.htm", method = RequestMethod.GET)
	public String duePayment(Model model, HttpServletRequest req,@RequestParam("traineeId") Integer traineeId
			,@RequestParam("amount") String amount) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		LedgerDto ledger= l_client.get(user.getToken(), traineeId);
		PayDto payment = new PayDto();
		//payment.setAccountNo(ledger.getAccountNo());
		//payment.setAccountName(ledger.getAccountName());
		payment.setAccountNo(amount);
		payment.setTrainee_id(traineeId);
		try {
			p_client.pay(user.getToken(), payment);
			return "redirect:/dues.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			
		}
		
		return "redirect:/dues.htm";
	}
}
