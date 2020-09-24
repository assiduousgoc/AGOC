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
import com.ass.client.GMSCrAccountClient;
import com.ass.client.GMSGymClient;
import com.ass.client.GMSLedgerClient;
import com.ass.client.GMSRoomClient;
import com.ass.client.GMSTraineeClient;
import com.ass.client.GMSUserClient;
import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.AddressDto;
import com.ass.smtfp.model.BankDto;
import com.ass.smtfp.model.CommonDto;
import com.ass.smtfp.model.CrAccountDto;
import com.ass.smtfp.model.GymDto;
import com.ass.smtfp.model.LedgerDto;
import com.ass.smtfp.model.PayDto;
import com.ass.smtfp.model.TraineeDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CrAccountController {
	
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
	private GMSCrAccountClient cr_client;
	
	@Autowired
	private GMSBranchClient b_client;
	
	@RequestMapping(value = "/crAccount.htm", method = RequestMethod.GET)
	public String crAccountList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("credits", cr_client.get(user.getToken()));
		//model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		return "crAccount";
	}
	@RequestMapping(value = "/addCrAccount.htm", method = RequestMethod.GET)
	public String addCrAccount(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("gym", gym_client.get(user.getToken()));
		model.addAttribute("branches", b_client.get(user.getToken()));
		return "addCrAccount";
	}
	@RequestMapping(value = "/saveCrAccount.htm", method = RequestMethod.POST)
	public String saveCrAccount(Model model, HttpServletRequest req,@RequestParam("accName") String accName
			,@RequestParam("crEmail") String crEmail,@RequestParam("crMNo") Long crMNo,@RequestParam("description") String description,@RequestParam("status") boolean status) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		CrAccountDto crAccount = new CrAccountDto();
		try {
			crAccount.setAcName(accName);
			crAccount.setEmail(crEmail);
			crAccount.setMob(crMNo);
			crAccount.setDescription(description);
			crAccount.setActive(status);
			try {
				CrAccountDto crAccounts= cr_client.save(user.getToken(), crAccount);
				model.addAttribute("createCr", crAccounts);
				return "crAccount.htm";
			}catch (Exception e) {
				e.printStackTrace();
				return "redirect:/addCrAccount.htm";
			}
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addCrAccount.htm";
			
		}
	}
	
	@RequestMapping(value = "/crAcc.htm", method = RequestMethod.GET)
	public String crAccList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		//model.addAttribute("credits", cr_client.get(user.getToken()));
		//model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		return "crAccRestaurent";
	}
}
