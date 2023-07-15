package com.skilldistillery.cupcakes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.cupcakes.data.CupcakeDAO;

@Controller
public class CupcakeController {
	
	@Autowired
	private CupcakeDAO cupcakeDao;

	@RequestMapping(path= {"/", "home.do"})
	public String goHome(Model model) {
		model.addAttribute("cupcakeList", cupcakeDao.findAll());
		return "home";
	}
}
