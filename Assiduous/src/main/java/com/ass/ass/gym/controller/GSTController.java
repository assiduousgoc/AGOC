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
import com.ass.smtfp.model.CrAccountDto;
import com.ass.smtfp.model.GstDto;
import com.ass.smtfp.model.GymDto;
import com.ass.smtfp.model.LedgerDto;
import com.ass.smtfp.model.PayDto;
import com.ass.smtfp.model.TraineeDto;
import com.ass.smtfp.model.UserData;

@Controller
public class GSTController {
	
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
	
	@RequestMapping(value = "/gstList.htm", method = RequestMethod.GET)
	public String gstList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		//model.addAttribute("trainers", ser_client.get(user.getToken(), UserRole.TRAINER));
		return "gstList";
	}
	@RequestMapping(value = "/addGST.htm", method = RequestMethod.GET)
	public String addCrAccount(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("gyms", gym_client.get(user.getToken()));
		model.addAttribute("branches", b_client.get(user.getToken()));
		return "addGST";
	}
	@RequestMapping(value = "/saveGST.htm", method = RequestMethod.POST)
	public String saveCrAccount(Model model, HttpServletRequest req,@RequestParam("gstNo") String gstNo
			,@RequestParam("gymName") Integer gymId,@RequestParam("remark") String remark,@RequestParam("status") boolean status) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		GstDto gst = new GstDto();
		System.out.println(" gstNo:"+gstNo+" : gymId-->"+gymId+"remark==>"+remark+" Status:->"+status);
	
		try {
			GymDto gym = new GymDto();
			CommonDto common = new CommonDto();
			gym = gym_client.get(user.getToken(), gymId);
			common.setName(gym.getName());
			common.setCode(gym.getCode());
			gst.setGstNo(gstNo);
			gst.setActive(status);
			gst.setRemark(remark);
			gst.setGymDto(common);
			
			return "gstList";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			
		}
		
		return "gstList";
	}
}
