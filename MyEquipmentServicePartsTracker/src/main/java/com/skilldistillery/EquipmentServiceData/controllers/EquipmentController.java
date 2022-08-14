package com.skilldistillery.EquipmentServiceData.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	// request mapping is the name the JSP needs to invoke to get the controller method going
	// the return of the method is the JSP that you're going to bring up at the end of the function
	
	// This method presents the form to the user
	@RequestMapping(path={"createEquipment.do"})
	public String createEquipment(Model model) {
		
		// redirect requires more code
		return "createEquipment";
	}
	// This method builds the new equipment and adds it to the model, then returns the JSP showing the new equipment
	@RequestMapping(path= {"createEquipmentResult.do"})
	public String createEquipmentResult(EquipmentServiceReference esr, Model model) {
		EquipmentServiceReference newEquip = dao.create(esr);
		
		model.addAttribute("result", newEquip);
		
		//model.addAttribute("allEquipment", allEquipment);
		return "createEquipmentResult";
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
		List<EquipmentServiceReference> showAllEquipment = dao.findAllEquipment();
		model.addAttribute("result", showAllEquipment);
		return "showAllEquipment";
	}
	
	// ***********************************************
	// U: UPDATE
	// ***********************************************
	// Present the form
	@RequestMapping(path= {"updateEquipment.do"})
	public String updateEquipment(Integer id, Model model) {
		//EquipmentServiceReference equipById = dao.findById(esr.getId());
		return "updateEquipment";
	}
	// Present the updates
	@RequestMapping(path= {"updatedEquipment.do"})
	public String updatedEquipment(EquipmentServiceReference esr, Model model) {
		EquipmentServiceReference equipUpdated = dao.update(esr.getId(), esr);
		model.addAttribute("result", equipUpdated);
		return "updatedEquipment";
	}
	
	
	// ***********************************************
	// D: DESTROY
	// ***********************************************
	
	
	
}
