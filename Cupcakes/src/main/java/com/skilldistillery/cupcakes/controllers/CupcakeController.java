package com.skilldistillery.cupcakes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.skilldistillery.cupcakes.data.CupcakeDAO;
import com.skilldistillery.cupcakes.entities.Cupcake;

@Controller
public class CupcakeController {

	@Autowired
	private CupcakeDAO cupcakeDao;

	@RequestMapping(path = { "/", "home.do" })
	public String goHome(Model model) {
		model.addAttribute("cupcakeList", cupcakeDao.findAll());
		return "home";
	}

	@RequestMapping(path = { "getCupcake.do" })
	public String showCupcake(Model model, @RequestParam Integer cupcakeId) {
		Cupcake cupcake = cupcakeDao.findId(cupcakeId);

		if (cupcake == null) {
			return "error";
		}
		model.addAttribute("cupcake", cupcake);
		return "getCupcake";
	}

	@RequestMapping(path = { "create.do" })
	public String createCupcake(Model model, Cupcake cupcake) {
		Cupcake CreatedCupcake = cupcakeDao.create(cupcake);
		model.addAttribute("newCupcake", CreatedCupcake);
		return "createdCupcake";
	}

	@RequestMapping(path = { "createdCupcake.do" })
	public String createdCupcake() {
		return "create";
	}

	@RequestMapping(path = { "update.do" })
	public String update(Model model, Cupcake cupcake, @RequestParam int id) {
		Cupcake updated = cupcakeDao.update(id, cupcake);
		model.addAttribute("updated", updated);

		return "updatedCupcake";
	}

	@RequestMapping(path = { "delete.do" })
	public String delete(@RequestParam int id) {
		boolean deleted = cupcakeDao.deleteById(id);
		return "deletedCupcake";
	}

}
