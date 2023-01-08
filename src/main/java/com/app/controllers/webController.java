package com.app.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class webController {

	@GetMapping("/index")
	public String web (@RequestParam(name="name",required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name",name);
		return "index.html";
	}
}
