package com.ass.ass.gym.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSCourseClient;
import com.ass.smtfp.model.CourseDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CourseController {

	@Autowired
	private GMSCourseClient gym_course_client;

	@RequestMapping("/courseList.htm")
	public String get(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		List<CourseDto> courseList = gym_course_client.get(user.getToken());
		model.addAttribute("coursesList", courseList);
		return "coursesList";
	}

	@RequestMapping("/addCourse.htm")
	public String add(Model model) {
		System.out.println("createCourses Page : ");
		model.addAttribute("createCourses", "");
		return "addCourse";
	}

	@RequestMapping(value = "/saveCourse.htm", method = RequestMethod.POST)
	public String save(Model model, HttpServletRequest req, @RequestParam("coursename") String coursename,
			@RequestParam("code") String code, @RequestParam(value = "status", defaultValue = "1") boolean status,
			@RequestParam(value = "description", required = false, defaultValue = "null") String description,
			@RequestPart(value = "courseImage", required = false) MultipartFile image) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		CourseDto dto = new CourseDto();
		dto.setName(coursename);
		dto.setCode(code);
		dto.setActive(true);
		dto.setDescription(description);
		try {
			gym_course_client.save(user.getToken(), dto);
			model.addAttribute("createCourses", "");
			return "redirect:/courseList.htm";
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "redirect:/addCourse.htm";
	}

	@RequestMapping(value = "/course-detail.htm", method = RequestMethod.GET)
	public ModelAndView detail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			CourseDto res = gym_course_client.get(user.getToken(), id);
			if (res != null)
				return new ModelAndView("courseDetail", "course", res);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/courseList.htm");
	}

	@RequestMapping(value = "/update.htm", method = RequestMethod.POST)
	public String update(Model model, HttpServletRequest req, @RequestParam("id") Integer id,
			@RequestParam("courseCode") String code, @RequestParam("coursename") String coursename,
			@RequestParam("courseDuration") String courseDuration, @RequestParam("coursePrice") Double coursePrice,
			@RequestParam(value = "description", required = false, defaultValue = "null") String description) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		CourseDto dto = new CourseDto();
		dto.setId(id);
		dto.setCode(code);
		dto.setDescription(description);
		dto.setName(coursename);
		try {
			gym_course_client.update(user.getToken(), dto);
			return "redirect:/courseList.htm";
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("createCourses", "");
		return "redirect:/course-detail.htm?id=" + id;
	}

	@RequestMapping(value = "/delete-course.htm", method = RequestMethod.GET)
	public ModelAndView delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gym_course_client.delete(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/courseList.htm");
	}

	@RequestMapping(value = "/active.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gym_course_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/courseList.htm");
	}
}
