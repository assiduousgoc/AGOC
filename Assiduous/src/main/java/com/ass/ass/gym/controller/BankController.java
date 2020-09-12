package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ass.client.GMSBranchClient;
import com.ass.client.GMSCourseClient;
import com.ass.client.GMSCourseScheduleClient;
import com.ass.client.GMSGymClient;
import com.ass.client.GMSLedgerClient;
import com.ass.client.GMSRoomClient;
import com.ass.client.GMSTraineeClient;
import com.ass.client.GMSUserClient;
import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.AddressDto;
import com.ass.smtfp.model.BankDto;
import com.ass.smtfp.model.CommonDto;
import com.ass.smtfp.model.GymDto;
import com.ass.smtfp.model.LedgerDto;
import com.ass.smtfp.model.PayDto;
import com.ass.smtfp.model.TraineeDto;
import com.ass.smtfp.model.UserData;

@Controller
public class BankController {
	
	@Autowired
	private GMSCourseScheduleClient gym_course_sc_client;

	@Autowired
	private GMSCourseClient course_client;

	@Autowired
	private GMSRoomClient room_client;

	@Autowired
	private GMSUserClient ser_client;
	
	@Autowired
	private GMSGymClient gym_client;
	
	@Autowired
	private GMSBranchClient b_client;
	
	@RequestMapping(value = "/bank.htm", method = RequestMethod.GET)
	public String bankList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		return "bank";
	}
	@RequestMapping(value = "/addBank.htm", method = RequestMethod.GET)
	public String addBank(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("gym", gym_client.get(user.getToken()));
		model.addAttribute("branches", b_client.get(user.getToken()));
		return "addBank";
	}
	@RequestMapping(value = "/saveBank.htm", method = RequestMethod.POST)
	public String duePayment(Model model, HttpServletRequest req,@RequestParam("name") String name
			,@RequestParam("branchName") String branchName,@RequestParam("AccNo") String AccNo,@RequestParam("ifsc") String ifsc,
			@RequestParam("accType") String accType,@RequestParam("panNo") String panNo,@RequestParam("tanNo") String tanNo,@RequestParam("address") String address
			,@RequestParam("Gym") String Gym,@RequestParam("status") boolean status) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		BankDto bank = new BankDto();
		System.out.println("nbank Name:"+name+" : branchName-->"+branchName+"Tan==>"+tanNo+" Status:->"+status);
	
		try {
			AddressDto addressDto = new AddressDto();
			CommonDto gymDto= new CommonDto();
			gymDto.setName(Gym);
			addressDto.setLine1(address);
			bank.setBankName(name);
			bank.setBankName(branchName);
			bank.setAccountNo(AccNo);
			bank.setPanNo(panNo);
			bank.setTanNo(tanNo);
			bank.setAccountType(accType);
			bank.setAddressDto(addressDto);
			bank.setIfscCode(ifsc);
			bank.setGymDto(gymDto);
			bank.setActive(status);
			
			return "redirect:/bank.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			
		}
		
		return "redirect:/dues.htm";
	}
}
