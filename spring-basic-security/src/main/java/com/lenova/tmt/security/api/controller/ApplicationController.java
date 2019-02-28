package com.lenova.tmt.security.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lenova.tmt.security.api.dao.DetailsRepo;
import com.lenova.tmt.security.api.model.Details;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {
	
	
	/*
	 * @Autowired DetailsRepo repo;
	 */
	
	  @GetMapping("/getMsg") 
	  public String greeting() { 
		  return "display.jsp"; }
	 
	
	
	/*
	 * @RequestMapping("/login") public String addDetails(Details details) {
	 * repo.save(details); return "login2.jsp"; }
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	/*
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(Model model, String error, String logout) {
		if (error != null)
			model.addAttribute("errorMsg", "Your username and password are invalid.");

		if (logout != null)
			model.addAttribute("msg", "You have been logged out successfully.");

		return "login";
	}
	*/

}
