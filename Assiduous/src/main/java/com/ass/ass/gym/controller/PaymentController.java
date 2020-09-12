package com.ass.ass.gym.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

	@RequestMapping(value = "/payments.htm", method = RequestMethod.GET)
	public String pays(Model model, HttpServletRequest req,
			@RequestParam(value = "trainee_id", required = false, defaultValue = "0") Integer id) {
		try {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("payments",
				id > 0 ? p_client.getByTrainee(user.getToken(), id) : p_client.get(user.getToken()));
		}catch (Exception e) {
		e.printStackTrace();
		}
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

}
