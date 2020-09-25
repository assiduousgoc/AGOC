package com.ass.ass.gym.controller;

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
public class POSSalesController {

	@Autowired
	private GMSRoomClient gym_room_client;

	@RequestMapping("/POSSales.htm")
	public String POSSales(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		//List<RoomDto> rooms = gym_room_client.get(user.getToken());
		//model.addAttribute("roomList", rooms);
		return "posSalesList";
	}


}
