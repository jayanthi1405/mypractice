package com.lenova.tmt.security.api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyAppController {
	
	
	//url:http://localhost:8080/home?id=1&name=sd&technology=java
	
	@RequestMapping("home")
	public ModelAndView home(ModelDetails details) {
		ModelAndView mv=new ModelAndView();
		mv.addObject("obj", details);
		mv.setViewName("home1");
		return mv;
		
	}
	
	
	
	/*
	 * @RequestMapping("home") public ModelAndView home(@RequestParam("name") String
	 * myname) { ModelAndView mv=new ModelAndView(); mv.addObject("name", myname);
	 * mv.setViewName("home1"); return mv;
	 * 
	 * }
	 */

	
	
	
	/*
	 * @RequestMapping("home") public String home(HttpServletRequest req) {
	 * HttpSession session=req.getSession(); String name=req.getParameter("name");
	 * //System.out.println("heloooo"+name); session.setAttribute("name",name);
	 * return "home";
	 * 
	 * }
	 */
	

}
