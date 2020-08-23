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
public class RoomController {

	@Autowired
	private GMSRoomClient gym_room_client;

	@RequestMapping("/roomList.htm")
	public String roomList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		List<RoomDto> rooms = gym_room_client.get(user.getToken());
		model.addAttribute("roomList", rooms);
		return "roomList";
	}

	@RequestMapping("/addRoom.htm")
	public ModelAndView addRoom(Model model) {
		return new ModelAndView("addRoom", "room", new RoomDto());
	}

	@RequestMapping("/saveRoom.htm")
	public String saveRoom(Model model, @RequestParam("name") String name, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		RoomDto dto = new RoomDto();
		try {
			dto.setName(name);
			dto.setBranchDto(user.getBranch());
			gym_room_client.save(user.getToken(), dto);
			return "redirect:/roomList.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/addRoom.htm";
	}

	@RequestMapping("/updateRoom.htm")
	public String updateRoom(Model model, @RequestParam("id") Integer id, @RequestParam("code") String code,
			@RequestParam("name") String name, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		RoomDto dto = new RoomDto();
		try {
			dto.setId(id);
			dto.setCode(code);
			dto.setName(name);
			dto.setBranchDto(user.getBranch());
			gym_room_client.update(user.getToken(), dto);
			return "redirect:/roomList.htm";
		} catch (Exception e) {
			// TODO: handle exception
		}
		return "redirect:/roomList.htm";
	}

	@RequestMapping(value = "/room-detail.htm", method = RequestMethod.GET)
	public ModelAndView roomDetail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			RoomDto res = gym_room_client.get(user.getToken(), id);
			if (res != null)
				return new ModelAndView("roomDetail", "room", res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/roomList.htm");
	}

	@RequestMapping(value = "/delete-room.htm", method = RequestMethod.GET)
	public ModelAndView delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gym_room_client.delete(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/roomList.htm");
	}

}
