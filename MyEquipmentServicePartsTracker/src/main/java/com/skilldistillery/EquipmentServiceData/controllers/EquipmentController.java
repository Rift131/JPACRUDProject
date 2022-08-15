package com.skilldistillery.EquipmentServiceData.controllers;

import java.util.List;

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
	public String searchByKeyword(String input, Model model) {
		List<EquipmentServiceReference> matches = dao.findByKeyword(input);
		model.addAttribute("input", matches);
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
		model.addAttribute("result", dao.findById(id));
		return "updateEquipment";
	}
	// Present the updates
	@RequestMapping(path= {"updatedEquipment.do"})
	public String updatedEquipment(EquipmentServiceReference esr, Model model, Integer id, String equipName, String equipManf, String equipMdl, String equipSerNum, String engManf, String engMdl, String engSerNum, String engOilManf, String engOilType, String  engOilViscGrd, String  engOilFltrManf, String  engOilFltrPrtNum, String  engAirFltrManf, String  engAirFltrPrtNum, String  engFuelSpec, String  engFuelFltrManf, String  engFuelFltrPrtNum, Boolean engFuelOil, String engFuelOilManf, String engFuelOilSerNum, String equipConsName, String equipConsManf, String equipConsPrtNum, String equipConsName2, String equipConsManf2, String equipConsPrtNum2, String equipConsName3, String equipConsManf3, String equipConsPrtNum3, String equipNotes) {
		esr.setEquipName(equipName);
		esr.setEquipManf(equipManf);
		esr.setEquipSerNum(equipSerNum);
		esr.setEngManf(engManf);
		esr.setEngMdl(engMdl);
		esr.setEngSerNum(engSerNum);
		esr.setEngOilManf(engOilManf);
		esr.setEngOilType(engOilType);
		esr.setEngOilViscGrd(engOilViscGrd);
		esr.setEngOilFltrManf(engOilFltrManf);
		esr.setEngOilFltrPrtNum(engOilFltrPrtNum);
		esr.setEngAirFltrManf(engAirFltrManf);
		esr.setEngAirFltrPrtNum(engAirFltrPrtNum);
		esr.setEngFuelSpec(engFuelSpec);
		esr.setEngFuelFltrManf(engFuelFltrManf);
		esr.setEngFuelFltrPrtNum(engFuelFltrPrtNum);
		esr.setEngFuelOil(engFuelOil);
		esr.setEngFuelOilManf(engFuelOilManf);
		esr.setEngFuelOilName(engFuelOilSerNum);
		esr.setEngFuelOilSerNum(engFuelOilSerNum);
		esr.setEquipConsName(equipConsName);
		esr.setEquipConsManf(equipConsManf);
		esr.setEquipConsPrtNum(equipConsPrtNum);
		esr.setEquipConsName2(equipConsName2);
		esr.setEquipConsManf2(equipConsManf2);
		esr.setEquipConsPrtNum2(equipConsPrtNum2);
		esr.setEquipConsName3(equipConsName3);
		esr.setEquipConsManf3(equipConsManf3);
		esr.setEquipConsPrtNum3(equipConsPrtNum3);
		esr.setEquipNotes(equipNotes);
		
//		EquipmentServiceReference equipById = dao.update(id, esr);
		model.addAttribute("result", esr);
		//EquipmentServiceReference equipById = dao.update(id, esr);
		dao.update(id, esr);
//		// dao find by id
		return "updatedEquipment";
	}
	
	
	// ***********************************************
	// D: DESTROY
	// ***********************************************
	@RequestMapping(path= {"updateEquipment.do"})
//	public String updateEquipment(Integer id, Model model) {
//		model.addAttribute("result", dao.findById(id));
//		return "updateEquipment";
//	}
//}
