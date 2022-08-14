package com.skilldistillery.EquipmentServiceData.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.EquipmentServiceData.data.EquipmentDAO;

@Controller
public class EquipmentController {
	@Autowired
	private EquipmentDAO dao;
	
	
	@RequestMapping(path={"/", "home.do"})
	public String home(Model model) {
		//model.addAttribute("DELETEME", dao.findById(1)); // DEBUG LATER
		return "index";
	}
	@RequestMapping(path={"searchById.do"})
	public String searchById(Model model) {
		return "searchById";
	}
	@RequestMapping(path={"searchByKeyword.do"})
	public String searchByKeyword(Model model) {
		return "searchByKeyword";
	}
	@RequestMapping(path={"showAllEquipment.do"})
	public String showAllEquipment(Model model) {
		return "showAllEquipment";
	}
	
}
