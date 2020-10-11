package com.ass.ass.restaurent.controller;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.ass.client.GMSRoomClient;
import com.ass.smtfp.model.CourseDto;
import com.ass.smtfp.model.RoomDto;
import com.ass.smtfp.model.UserData;

@Controller
public class ItemController {

	   private static final String UPLOAD_DIRECTORY ="/static/images";  
	   
	@Autowired
	private GMSRoomClient gym_room_client;

	@RequestMapping("/resItemList.htm")
	public String roomList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		//List<RoomDto> rooms = gym_room_client.get(user.getToken());
		//model.addAttribute("roomList", rooms);
		return "resItemList";
	}
	@RequestMapping(value = "/creatResItem.htm", method = RequestMethod.GET)
	public String createBank(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		System.out.println("Create ");
		/*try {
			bank_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}*/
		return "creatResItem";
	}
	@RequestMapping(value = "/saveResItem.htm", method = RequestMethod.POST)
	public String save(Model model, HttpServletRequest req,
			@RequestPart(value = "itemImage", required = false) MultipartFile file) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		ServletContext context = req.getSession().getServletContext();  
	    String path = context.getRealPath(UPLOAD_DIRECTORY);  
	    String filename = file.getOriginalFilename();  
		try {
			  byte barr[]=file.getBytes();  
	          
		        BufferedOutputStream bout=new BufferedOutputStream(  
		                 new FileOutputStream(path+"/"+filename));  
		        bout.write(barr);  
		        bout.flush();  
		        bout.close();  
		    System.out.println(path+"/"+filename);        
			System.out.println("-->"+file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("imageSuccess", path+"/"+filename);
		//new ModelAndView("creatResItem","filename",path+"/"+filename);  
		System.out.println("==>"+path+"/"+filename);
		return "redirect:/creatResItem.htm";
	}
}
