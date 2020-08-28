package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSLedgerClient;
import com.ass.client.GMSPaymentClient;
import com.ass.client.GMSTraineeClient;
import com.ass.smtfp.model.PayDto;
import com.ass.smtfp.model.UserData;

@Controller
public class PaymentController {

	@Autowired
	private GMSTraineeClient t_client;

	@Autowired
	private GMSPaymentClient p_client;
	
	@Autowired
	private GMSLedgerClient l_client;
	



	@RequestMapping(value = "/payments.htm", method = RequestMethod.GET)
	public String pays(Model model, HttpServletRequest req,
			@RequestParam(value = "trainee_id", required = false, defaultValue = "0") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("payments",
				id >= 0 ? p_client.getByTrainee(user.getToken(), id) : p_client.get(user.getToken()));
		return "payments";
	}

	@RequestMapping(value = "/payment-form.htm", method = RequestMethod.GET)
	public ModelAndView form(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("trainees", t_client.get(user.getToken()));
		return new ModelAndView("payment-form", "payment", new PayDto());
	}

	@RequestMapping(value = "/pay.htm", method = RequestMethod.POST)
	public String pay(@ModelAttribute PayDto payment, Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			p_client.pay(user.getToken(), payment);
			return "redirect:/payments.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		model.addAttribute("Error", "Error");
		return "redirect:/payment-form.htm";
	}

	@RequestMapping(value = "/payment-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			return new ModelAndView("payment-detail", "payment", p_client.get(user.getToken(), id));
		} catch (Exception e) {
		}
		return new ModelAndView("redirect:/payments.htm");
	}

	@RequestMapping(value = "/delete-payment.htm")
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			p_client.delete(user.getToken(), id);
			return "redirect:/payments.htm";
		} catch (Exception e) {
		}
		return "redirect:/payments.htm";
	}
	@RequestMapping(value = "/ledgers.htm")
	public String ledgers(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		System.out.println(""+user.getToken()+" ledger Size : "+l_client.get(user.getToken()).size());
		try {
			model.addAttribute("ledgers",l_client.get(user.getToken()));
			return "ledgers";
		} catch (Exception e) {
		}
		return "ledgers";
	}
	@RequestMapping(value = "/invoice.htm")
	public String ledgersInvoice(Model model, HttpServletRequest req,@RequestParam("invoice") String invoice) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		System.out.println("in Voice"+user.getToken()+":Invoice --->"+invoice);
		try {
			model.addAttribute("invoice",l_client.get(user.getToken()));
			return "invoice";
		} catch (Exception e) {
		}
		return "invoice";
	}
	@RequestMapping(value = "/dues.htm")
	public String dues(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		return "redirect:/duesList.htm";
	}
	@RequestMapping(value = "/duesList.htm")
	public String duesList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		System.out.println(""+user.getToken());
		try {
			model.addAttribute("dues",t_client.getDues(user.getToken()));
			return "duesList";
		} catch (Exception e) {
		}
		return "duesList";
	}
}
