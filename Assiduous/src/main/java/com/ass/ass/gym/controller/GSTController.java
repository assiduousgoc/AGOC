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

import com.ass.client.GMSGSTClient;
import com.ass.smtfp.model.GstDto;
import com.ass.smtfp.model.UserData;

@Controller
public class GSTController {

	@Autowired
	private GMSGSTClient gst_client;

	@RequestMapping(value = "/gstList.htm", method = RequestMethod.GET)
	public String gstList(Model model, HttpServletRequest req) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		model.addAttribute("gsts", gst_client.get(user.getToken()));
		return "gstList";
	}

	@RequestMapping(value = "/addGST.htm", method = RequestMethod.GET)
	public ModelAndView addGst(Model model, HttpServletRequest req) {
		return new ModelAndView("addGST", "gst", new GstDto());
	}

	@RequestMapping(value = "/save-gst.htm", method = RequestMethod.POST)
	public String saveGst(Model model, HttpServletRequest req, @ModelAttribute GstDto gst) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gst.setGymDto(user.getGym());
			GstDto gsts = gst_client.save(user.getToken(), gst);
			model.addAttribute("createGst", gsts);
			return "redirect:/gstList.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addGST.htm";
		}
	}

	@RequestMapping(value = "/gst-detail.htm", method = RequestMethod.GET)
	public ModelAndView gstDetail(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		return new ModelAndView("gst-detail", "gst", gst_client.get(user.getToken(), id));
	}

	@RequestMapping(value = "/update-gst.htm", method = RequestMethod.POST)
	public String updateGst(Model model, HttpServletRequest req, @ModelAttribute GstDto gst) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gst.setGymDto(user.getGym());
			GstDto gsts = gst_client.update(user.getToken(), gst);
			model.addAttribute("updateGst", gsts);
			return "redirect:/gstList.htm";
		} catch (Exception e) {
			model.addAttribute("Error", "Error");
			return "redirect:/addGST.htm";
		}
	}

	@RequestMapping(value = "/delete-gst.htm", method = RequestMethod.GET)
	public String delete(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		gst_client.delete(user.getToken(), id);
		return "redirect:/gstList.htm";
	}

	@RequestMapping(value = "/active-gst.htm", method = RequestMethod.GET)
	public ModelAndView active(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gst_client.active(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/gstList.htm");
	}

	@RequestMapping(value = "/deactive-gst.htm", method = RequestMethod.GET)
	public ModelAndView inactive(Model model, HttpServletRequest req, @RequestParam("id") Integer id) {
		UserData user = (UserData) req.getSession().getAttribute("user");
		try {
			gst_client.deactive(user.getToken(), id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/gstList.htm");
	}

}
