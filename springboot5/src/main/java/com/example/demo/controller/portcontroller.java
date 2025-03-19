package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.port;
import com.example.demo.service.portservice;


@Controller

public class portcontroller {
	@Autowired
	
	private portservice ser; 
	
	
	@GetMapping("/")
	public String index() {
		return "index";
		
	}
	@GetMapping("/thankyou")
    public String thankYouPage() {
        return "thankyou";
    }

	@PostMapping("/save")
	public String saveport(@ModelAttribute port b) { 
		ser.add(b);
		return "redirect:/thankyou";
		 
	}
}