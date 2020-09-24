package com.ass.ass.gym.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSBankClient;
import com.ass.client.GMSBranchClient;
import com.ass.client.GMSCityClient;
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
import com.ass.smtfp.model.BranchDto;
import com.ass.smtfp.model.CityDto;
import com.ass.smtfp.model.CommonDto;
import com.ass.smtfp.model.CourseDto;
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
	private GMSCityClient city_client;

	@Autowired
	private GMSUserClient ser_client;
	
	@Autowired
	private GMSGymClient gym_client;
	
	@Autowired
	private GMSBranchClient b_client;
	
	@Autowired
	private GMSBankClient bank_client;
	
	@RequestMapping(value = "/bank.htm", method = RequestMethod.GET)
	public String bankList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("banks", bank_client.get(user.getToken()));
		model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		//System.out.println("==>"+user.getToken());
		return "bank";
	}
	@RequestMapping(value = "/addBank.htm", method = RequestMethod.GET)
	public String addBank(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("city", city_client.get(user.getToken()));
		model.addAttribute("gym", gym_client.get(user.getToken()));
		
		return "addBank";
	}
	@RequestMapping(value = "/saveBank.htm", method = RequestMethod.POST)
	public String duePayment(Model model, HttpServletRequest req,@RequestParam("name") String name
			,@RequestParam("branchName") String branchName,@RequestParam("AccNo") String AccNo,@RequestParam("ifsc") String ifsc,
			@RequestParam("accType") String accType,@RequestParam("panNo") String panNo,@RequestParam("tanNo") String tanNo,@RequestParam("address") String address
			,@RequestParam("Gym") Integer gymId,@RequestParam("city") Integer cityId,@RequestParam("pincode") String pincode,@RequestParam("status") boolean status) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		BankDto bank = new BankDto();
		System.out.println("nbank Name:"+name+" : branchName-->"+branchName+"Tan==>"+tanNo+" Status:->"+status);
	
		try {
			AddressDto addressDto = new AddressDto();
			CommonDto gymDto= new CommonDto();
			CommonDto cityDto= new CommonDto();
			GymDto gym= gym_client.get("Qavby8kIPZbEIM39TUIaU3heKL32hn1N4k8TSVDAfOobIk8vUfIqzd7BcE+uOh9NUO3+01AMshaD/3KF88HL2Q==",2);
			CityDto city= city_client.get(user.getToken(), cityId);
			gymDto.setName(gym.getName());
			gymDto.setCode(gym.getCode());
			cityDto.setName(city.getName());
			cityDto.setCode(city.getCode());
			addressDto.setCityDto(cityDto);
			addressDto.setLine1(address);
			addressDto.setPincode(pincode);
			bank.setBankName(name);
			bank.setBranchName(branchName);
			bank.setAccountNo(AccNo);
			bank.setPanNo(panNo);
			bank.setTanNo(tanNo);
			bank.setAccountType(accType);
			bank.setAddressDto(addressDto);
			bank.setIfscCode(ifsc);
			bank.setGymDto(gymDto);
			bank.setActive(status);
			try {
			BankDto bdto= bank_client.save(user.getToken(), bank);
			model.addAttribute("createBank", bdto);
			return "redirect:/bank.htm";
			}catch (Exception e) {
				e.printStackTrace();
				return "redirect:/addBank.htm";
			}
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addBank.htm";
		}
	}
	

	@RequestMapping(value = "/bank-details.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			BankDto res = bank_client.get(user.getToken(), id);
			if (res != null)
				return new ModelAndView("bankDetail", "bank", res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/bank.htm");
	}

	@RequestMapping(value = "/update-bank.htm", method = RequestMethod.POST)
	public String update(Model model, HttpServletRequest req, @RequestParam("id") Integer id,@RequestParam("name") String name
			,@RequestParam("branchName") String branchName,@RequestParam("AccNo") String AccNo,@RequestParam("ifsc") String ifsc,
			@RequestParam("accType") String accType,@RequestParam("panNo") String panNo,@RequestParam("tanNo") String tanNo,@RequestParam("address") String address
			,@RequestParam("Gym") Integer gymId,@RequestParam("city") Integer cityId,@RequestParam("pincode") String pincode,
			@RequestParam("status") boolean status,
			@RequestParam(value = "description", required = false, defaultValue = "null") String description) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		
		BankDto bank = new BankDto();
		
		try {
			AddressDto addressDto = new AddressDto();
			CommonDto gymDto= new CommonDto();
			CommonDto cityDto= new CommonDto();
			GymDto gym= gym_client.get("Qavby8kIPZbEIM39TUIaU3heKL32hn1N4k8TSVDAfOobIk8vUfIqzd7BcE+uOh9NUO3+01AMshaD/3KF88HL2Q==",2);
			CityDto city= city_client.get(user.getToken(), cityId);
			gymDto.setName(gym.getName());
			gymDto.setCode(gym.getCode());
			cityDto.setName(city.getName());
			cityDto.setCode(city.getCode());
			addressDto.setCityDto(cityDto);
			addressDto.setLine1(address);
			addressDto.setPincode(pincode);
			bank.setId(id);
			bank.setBankName(name);
			bank.setBranchName(branchName);
			bank.setAccountNo(AccNo);
			bank.setPanNo(panNo);
			bank.setTanNo(tanNo);
			bank.setAccountType(accType);
			bank.setAddressDto(addressDto);
			bank.setIfscCode(ifsc);
			bank.setGymDto(gymDto);
			bank.setActive(status);
			try {
			BankDto bdto= bank_client.update(user.getToken(), bank);
			model.addAttribute("updateBank", bdto);
			return "redirect:/bank.htm";
			}catch (Exception e) {
				e.printStackTrace();
				return "redirect:/detail-bank.htm";
			}
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/detail-bank.htm";
		}
	}

	@RequestMapping(value = "/delete-bank.htm", method = RequestMethod.GET)
	public ModelAndView delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			bank_client.delete(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/bank.htm");
	}

	@RequestMapping(value = "/active-bank.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			bank_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/bank.htm");
	}
	@RequestMapping(value = "/deactive-bank.htm", method = RequestMethod.GET)
	public ModelAndView deActive(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			bank_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/bank.htm");
	}
	
	@RequestMapping(value = "/resBank.htm", method = RequestMethod.GET)
	public String resBank(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		//model.addAttribute("banks", bank_client.get(user.getToken()));
		//model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		//System.out.println("==>"+user.getToken());
		return "resBank";
	}
}
