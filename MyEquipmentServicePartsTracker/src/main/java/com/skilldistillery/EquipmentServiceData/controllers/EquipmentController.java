package com.skilldistillery.EquipmentServiceData.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skilldistillery.EquipmentServiceData.data.EquipmentDAO;
import com.skilldistillery.EquipmentServiceData.entities.EquipmentServiceReference;

@Controller
public class EquipmentController {
	@Autowired
	private EquipmentDAO dao;
	
	
	@RequestMapping(path={"/", "home.do"})
	public String home(Model model) {
		//model.addAttribute("DELETEME", dao.findById(1)); // DEBUG LATER
		return "index";
	}
	
	// ***********************************************
	// C: CREATE
	// ***********************************************
//	
//	@RequestMapping(path= {"createEquipment.jsp"})
//	public String createEquipment(Model model) {
//		return "createEquipment";
//	}
	
	@RequestMapping(path={"createEquipmentResult.jsp"})
	public EquipmentServiceReference createEquipment(EquipmentServiceReference esr, Model model) {
		EquipmentServiceReference newEquip = dao.create(esr);
		// "result" refers to the associated jsp's nameing convention for the information it's given 
		model.addAttribute("result", newEquip);
		return newEquip;
	}
	
	// ***********************************************
	// R: RETRIEVE
	// ***********************************************
	
	@RequestMapping(path={"searchById.do"})
	public String searchById(Integer eid, Model model) {
		EquipmentServiceReference equipById = dao.findById(eid);
		// "result" refers to the associated jsp's nameing convention for the information it's given 
		model.addAttribute("result", equipById);
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
	
	// ***********************************************
	// U: UPDATE
	// ***********************************************
	
	
	
	
	// ***********************************************
	// D: DESTROY
	// ***********************************************
	
	
	
}
