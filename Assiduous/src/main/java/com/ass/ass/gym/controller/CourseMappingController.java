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
import com.ass.client.GMSCourseMappingClient;
import com.ass.client.GMSCourseScheduleClient;
import com.ass.client.GMSGymClient;
import com.ass.client.GMSUserClient;
import com.ass.smtfp.enums.UserRole;
import com.ass.smtfp.model.BranchDto;
import com.ass.smtfp.model.CommonDto;
import com.ass.smtfp.model.CourseDto;
import com.ass.smtfp.model.CourseMappingDto;
import com.ass.smtfp.model.UserData;

@Controller
public class CourseMappingController {
	
	@Autowired
	private GMSCourseScheduleClient gym_course_sc_client;

	@Autowired
	private GMSCourseClient course_client;

	@Autowired
	private GMSCourseMappingClient coursemapping_client;

	@Autowired
	private GMSUserClient ser_client;
	
	@Autowired
	private GMSGymClient gym_client;
	
	@Autowired
	private GMSBranchClient b_client;
	
	@RequestMapping(value = "/courseMapping.htm", method = RequestMethod.GET)
	public String courseMappingList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		model.addAttribute("courseMappings", coursemapping_client.get(user.getToken()));
		System.out.println(""+user.getToken());
		
		return "courseMappingList";
	}
	@RequestMapping(value = "/addCourseMapping.htm", method = RequestMethod.GET)
	public String addCourseMapping(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("branches", b_client.get(user.getToken()));
		model.addAttribute("courses", course_client.get(user.getToken()));
		return "addCourseMapping";
	}
	@RequestMapping(value = "/saveCourseMapping.htm", method = RequestMethod.POST)
	public String duePayment(Model model, HttpServletRequest req,@RequestParam("courseName") Integer courseId
			,@RequestParam("branchName") Integer branchId,@RequestParam("price") Double price,@RequestParam("duration") String duration,
			@RequestParam("status") boolean status) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		CourseMappingDto courseMapping = new CourseMappingDto();
		/*System.out.println("courseId:"+courseId+" : branchName-->"+branchId+"price==>"+price+" Status:->"+status);
	*/
		try {
			BranchDto branchDto = new BranchDto();
			CourseDto courseDto= new CourseDto();
			CommonDto commonDtoBranch= new CommonDto();
			CommonDto commonDtocourse= new CommonDto();
			branchDto = b_client.get(user.getToken(), branchId);
			commonDtoBranch.setCode(branchDto.getCode());
			commonDtoBranch.setName(branchDto.getName());
			courseDto = course_client.get(user.getToken(), courseId);
			commonDtocourse.setCode(courseDto.getCode());
			commonDtocourse.setName(courseDto.getName());
			courseMapping.setDuration(duration);
			courseMapping.setPrice(price);
			courseMapping.setBranchDto(commonDtoBranch);
			courseMapping.setCourseDtp(commonDtocourse);
			try {
				CourseMappingDto createCourseMapping= coursemapping_client.save(user.getToken(), courseMapping);
				model.addAttribute("createCourseMapping", createCourseMapping);
				return "redirect:/courseMapping.htm";
			}catch (Exception e) {
				e.printStackTrace();
				return "redirect:/addCourseMapping.htm";
			}
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addCourseMapping.htm";
		}
	}
}
