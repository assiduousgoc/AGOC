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

import com.ass.client.GMSBankClient;
import com.ass.client.GMSCityClient;
import com.ass.client.GMSUserClient;
import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.AddressDto;
import com.ass.smtfp.model.BankDto;
import com.ass.smtfp.model.CommonDto;
import com.ass.smtfp.model.UserData;

@Controller
public class BankController {

	@Autowired
	private GMSCityClient city_client;

	@Autowired
	private GMSUserClient ser_client;

	@Autowired
	private GMSBankClient bank_client;

	@RequestMapping(value = "/bank.htm", method = RequestMethod.GET)
	public String bankList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("banks", bank_client.get(user.getToken()));
		model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		return "bank";
	}

	@RequestMapping(value = "/addBank.htm", method = RequestMethod.GET)
	public String addBank(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("city", city_client.get(user.getToken()));
		return "addBank";
	}

	@RequestMapping(value = "/saveBank.htm", method = RequestMethod.POST)
	public String duePayment(Model model, HttpServletRequest req, @RequestParam("name") String name,
			@RequestParam("branchName") String branchName, @RequestParam("AccNo") String AccNo,
			@RequestParam("ifsc") String ifsc, @RequestParam("accType") String accType,
			@RequestParam("panNo") String panNo, @RequestParam("tanNo") String tanNo,
			@RequestParam("address") String address, @RequestParam("city") Integer cityId,
			@RequestParam("pincode") String pincode) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		BankDto bank = new BankDto();
		try {
			AddressDto addressDto = new AddressDto();
			addressDto.setCityDto(new CommonDto(cityId));
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
			bank.setGymDto(user.getGym());
			try {
				BankDto bdto = bank_client.save(user.getToken(), bank);
				model.addAttribute("createBank", bdto);
				return "redirect:/bank.htm";
			} catch (Exception e) {
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
			model.addAttribute("city", city_client.get(user.getToken()));
			BankDto res = bank_client.get(user.getToken(), id);
			if (res != null)
				return new ModelAndView("bankDetail", "bank", res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/bank.htm");
	}

	@RequestMapping(value = "/update-bank.htm", method = RequestMethod.POST)
	public String update(Model model, HttpServletRequest req, @ModelAttribute BankDto bank) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			BankDto bdto = bank_client.update(user.getToken(), bank);
			model.addAttribute("updateBank", bdto);
			return "redirect:/bank.htm";
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
		/*try {
			bank_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return "resBank";
	}
	@RequestMapping(value = "/addResBank.htm", method = RequestMethod.GET)
	public String createBank(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		System.out.println("Create ");
		/*try {
			bank_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return "addResBank";
	}
}
