package com.ass.ass.restaurent.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSRoomClient;
import com.ass.smtfp.model.RoomDto;
import com.ass.smtfp.model.UserData;

@Controller
public class ReportController {

	@Autowired
	private GMSRoomClient gym_room_client;

	@RequestMapping("/resReport.htm")
	public String roomList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		//List<RoomDto> rooms = gym_room_client.get(user.getToken());
		//model.addAttribute("roomList", rooms);
		return "resReport";
	}
	@RequestMapping(value = "/reportTransaction.htm", method = RequestMethod.GET)
	public String reportTransaction(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		System.out.println("Create ");
		try {
			//bank_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "reportTransaction";
	}
	@RequestMapping(value = "/transactionDetails.htm", method = RequestMethod.GET)
	public String transactionDetails(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		System.out.println("Transaction Details ");
		try {
			//bank_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "transactionDetails";
	}

}
