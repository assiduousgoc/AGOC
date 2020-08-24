package com.ass.ass.gym.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSCityClient;
import com.ass.client.GMSUserClient;
import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.AddressDto;
import com.ass.smtfp.model.CommonDto;
import com.ass.smtfp.model.UserData;
import com.ass.smtfp.model.UsersDto;

@Controller
public class TrainerController {

	@Autowired
	private GMSUserClient gym_user_client;

	@Autowired
	private GMSCityClient city_client;

	@RequestMapping("/trainerList.htm")
	public String coursesList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		List<UsersDto> trainners = gym_user_client.get(user.getToken(), UserRole.TRAINER);
		model.addAttribute("trainerList", trainners);
		return "trainerList";
	}

	@RequestMapping("/addTrainer.htm")
	public String addTrainer(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("cities", city_client.get(user.getToken()));
		return "addTrainer";
	}

	@RequestMapping(value = "/saveTrainer.htm", method = RequestMethod.POST)
	public String saveCourse(Model model, HttpServletRequest req, @RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("mob") Long mob,
			@RequestParam("address_line1") String address_line1, @RequestParam("address_line2") String address_line2,
			@RequestParam("pincode") String pincode, @RequestParam("city") Integer city_id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		UsersDto dto = new UsersDto();
		dto.setBranchDto(user.getBranch());
		dto.setEmail(email);
		dto.setFirstName(first_name);
		dto.setLastName(last_name);
		dto.setMob(mob);
		dto.setPassword(password);
		dto.setRole(UserRole.TRAINER);
		AddressDto addressDto = new AddressDto();
		addressDto.setLine1(address_line1);
		addressDto.setLine2(address_line2);
		addressDto.setPincode(pincode);
		addressDto.setCityDto(new CommonDto(city_id, null, null));
		dto.setAddressDto(addressDto);
		try {
			UsersDto res = gym_user_client.save(user.getToken(), dto);
			model.addAttribute("trainner", res);
			return "redirect:/trainerList.htm";
		} catch (Exception e) {
			e.printStackTrace();

		}

		return "redirect:/addTrainer.htm";
	}

	@RequestMapping(value = "/trainner-detail.htm", method = RequestMethod.GET)
	public ModelAndView courseDetail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			UsersDto res = gym_user_client.get(user.getToken(), id);
			model.addAttribute("cities", city_client.get(user.getToken()));
			if (res != null)
				return new ModelAndView("trainerDetail", "user", res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/trainerList.htm");
	}

	@RequestMapping(value = "/update-trainner.htm", method = RequestMethod.POST)
	public String update(Model model, HttpServletRequest req, @RequestParam("id") Integer id,
			@RequestParam("address_id") Integer address_id, @RequestParam("first_name") String first_name,
			@RequestParam("last_name") String last_name, @RequestParam("email") String email,
			@RequestParam("password") String password, @RequestParam("mob") Long mob,
			@RequestParam("address_line1") String address_line1, @RequestParam("address_line2") String address_line2,
			@RequestParam("pincode") String pincode, @RequestParam("city") Integer city_id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		UsersDto dto = new UsersDto();
		dto.setId(id);
		dto.setBranchDto(user.getBranch());
		dto.setEmail(email);
		dto.setFirstName(first_name);
		dto.setLastName(last_name);
		dto.setMob(mob);
		dto.setPassword(password);
		dto.setRole(UserRole.TRAINER);
		AddressDto addressDto = new AddressDto();
		addressDto.setId(address_id);
		addressDto.setLine1(address_line1);
		addressDto.setLine2(address_line2);
		addressDto.setPincode(pincode);
		addressDto.setCityDto(new CommonDto(city_id, null, null));
		dto.setAddressDto(addressDto);
		try {
			UsersDto res = gym_user_client.update(user.getToken(), dto);
			model.addAttribute("trainner", res);
			return "redirect:/trainerList.htm";
		} catch (Exception e) {
			e.printStackTrace();

		}
		model.addAttribute("trainner", "");
		return "redirect:/trainner-detail.htm?id=" + id;
	}

	@RequestMapping(value = "/delete-trainer.htm", method = RequestMethod.GET)
	public ModelAndView delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gym_user_client.delete(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/trainerList.htm");
	}

}
