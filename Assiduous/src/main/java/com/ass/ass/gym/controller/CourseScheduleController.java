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

import com.ass.client.GMSCourseClient;
import com.ass.client.GMSCourseScheduleClient;
import com.ass.client.GMSRoomClient;
import com.ass.client.GMSUserClient;
import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.CommonDto;
import com.ass.smtfp.model.CourseScheduleDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CourseScheduleController {

	@Autowired
	private GMSCourseScheduleClient gym_course_sc_client;

	@Autowired
	private GMSCourseClient course_client;

	@Autowired
	private GMSRoomClient room_client;

	@Autowired
	private GMSUserClient ser_client;

	@RequestMapping("/courseSchedule.htm")
	public String get(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		List<CourseScheduleDto> courseList = gym_course_sc_client.get(user.getToken());
		model.addAttribute("cs", courseList);
		return "courseSchedule";
	}

	@RequestMapping("/createSchedule.htm")
	public String add(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("courses", course_client.get(user.getToken()));
		model.addAttribute("rooms", room_client.get(user.getToken()));
		model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		return "createSchedule";
	}

	@RequestMapping(value = "/saveCourseSchedule.htm", method = RequestMethod.POST)
	public String save(Model model, HttpServletRequest req, @RequestParam("code") String code,
			@RequestParam(value = "day", required = false, defaultValue = "0") String day,
			@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("course") Integer course,
			@RequestParam("room") Integer room, @RequestParam("trainer") Integer trainer,
			@RequestParam(value = "description", required = false, defaultValue = "null") String description) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		CourseScheduleDto dto = new CourseScheduleDto();
		dto.setCode(code);
		dto.setDays(day);
		dto.setCourseDto(new CommonDto(course, null, null));
		dto.setDescription(description);
		dto.setFrom(from);
		dto.setRoomDto(new CommonDto(room, null, null));
		dto.setTo(to);
		dto.setActive(true);
		dto.setTrainerDto(new CommonDto(trainer, null, null));
		try {
			CourseScheduleDto res = gym_course_sc_client.save(user.getToken(), dto);
			return "redirect:/courseSchedule.htm";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/createSchedule.htm";
	}

	@RequestMapping(value = "/course-schedule-detail.htm", method = RequestMethod.GET)
	public ModelAndView details(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			model.addAttribute("courses", course_client.get(user.getToken()));
			model.addAttribute("rooms", room_client.get(user.getToken()));
			model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
			CourseScheduleDto res = gym_course_sc_client.get(user.getToken(), id);
			if (res != null)
				return new ModelAndView("courseScDetail", "course_sc", res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/courseSchedule.htm");
	}

	@RequestMapping(value = "/update-course-schedule.htm", method = RequestMethod.POST)
	public String updateCourse(Model model, HttpServletRequest req, @RequestParam("id") Integer id,
			@RequestParam("code") String code,
			@RequestParam(value = "day", required = false, defaultValue = "0") String day,
			@RequestParam("from") String from, @RequestParam("to") String to, @RequestParam("course") Integer course,
			@RequestParam("room") Integer room, @RequestParam("trainer") Integer trainer,
			@RequestParam(value = "description", required = false, defaultValue = "null") String description) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		CourseScheduleDto dto = new CourseScheduleDto();
		dto.setId(id);
		dto.setCode(code);
		dto.setDays(day);
		dto.setCourseDto(new CommonDto(course, null, null));
		dto.setDescription(description);
		dto.setFrom(from);
		dto.setRoomDto(new CommonDto(room, null, null));
		dto.setTo(to);
		dto.setTrainerDto(new CommonDto(trainer, null, null));
		try {
			CourseScheduleDto res = gym_course_sc_client.update(user.getToken(), dto);
			return "redirect:/courseSchedule.htm";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "redirect:/course-schedule-detail?id=" + id;
	}

	@RequestMapping(value = "/delete-course-schedule.htm", method = RequestMethod.GET)
	public ModelAndView delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gym_course_sc_client.delete(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/courseSchedule.htm");
	}

	@RequestMapping(value = "/active-course-schedule.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gym_course_sc_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/courseSchedule.htm");
	}
}
