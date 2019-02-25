package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Customer;
import com.app.service.ICustomerService;

@Controller
public class CustomerController {
	@Autowired
	private ICustomerService service;
	@RequestMapping("/regCus")
	public String showReg(){
		return "CustomerRegister";
		
	}
	@RequestMapping(value="/savecus",method=RequestMethod.POST)
	public String insertcus(@ModelAttribute("Customer") Customer cus, ModelMap map){
		int cusId=service.saveCustomer(cus);
		String info="save with"+cusId;
		map.addAttribute("msg", info);
		return "CustomerRegister";
	}
	
	@RequestMapping("/getAllCus")
	public String getAllData(ModelMap map){
		List<Customer> list=service.getAllCustomer();
		map.addAttribute("list", list);// cuss=key   value=list
		return "CustomerData";
	}
	
	@RequestMapping("/deletecus")
	public String delcus(@RequestParam("cusId")int cusId){
		service.deleteCustomer(cusId);
		return "redirect:getAllCus";
	}
	
	@RequestMapping("/editcus")
	public String showEdit(@RequestParam("cusId") int cusId, ModelMap map){
		Customer cus=service.getCustomerById(cusId);
		map.addAttribute("cus", cus);// 1st cus is key  and 2nd cus is value
		return "CustomerDataEdit";
		
	}
	@RequestMapping(value="/updatecus", method=RequestMethod.POST)
	public String updatcus(@ModelAttribute("Customer")Customer cus){
		service.updateCustomer(cus);
		return "redirect:getAllCus";
		
	}
	@RequestMapping("/cusExcel")
	public String doExcelExport(ModelMap map){
		List<Customer> cusList=service.getAllCustomer();
		map.addAttribute("cusList", cusList);
		return "cusExcelView";
	}
	@RequestMapping("/cusPdf")
	public String doPdfExport(ModelMap map){
		List<Customer> cusList=service.getAllCustomer();
		map.addAttribute("cusList", cusList);
		return "cusPdfView";
		
	}

}
