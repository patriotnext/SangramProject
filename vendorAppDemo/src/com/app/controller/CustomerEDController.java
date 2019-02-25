package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.model.CustomerED;
import com.app.model.Item;
import com.app.service.ICustomerEDService;
import com.app.util.CoDecUtil;
import com.app.util.CodeUtil;
import com.app.util.CommonUtil;

@Controller
public class CustomerEDController {
	@Autowired
	private ICustomerEDService service;
	@Autowired
	private CodeUtil codeUtil;
	@Autowired
	private CoDecUtil coDecUtil;
	@Autowired
	private CommonUtil commonUtil;
	
	//1.Show page
	@RequestMapping("/regCustED")
	public String showReg(){
		return "CustomerEDReg";
		
	}
	
	//2.save CustomerED
	@RequestMapping(value="/saveCusED", method=RequestMethod.POST)
	public String saveCusED(@ModelAttribute("customerED") CustomerED cusED, ModelMap map){
	
		//3.generate password and token
		String pwd=codeUtil.genPwd();
		String tkn=codeUtil.genToken();
		
		//4. do encode
		String encpwd=coDecUtil.doEncode(pwd);
		String enctkn=coDecUtil.doEncode(tkn);
		
		//5.send encode value to cusromer object
		cusED.setPassword(encpwd);
		cusED.setAccTock(enctkn);
		
		//6.save this customer object
		service.saveCustomerED(cusED);
		
		//7.send email
		
		String msg="your email also send";
		
		String text="Id is :"+cusED.getcId()+" User Name :"+cusED.getcName()+" Email "+cusED.getcEmail()+" Password :"+pwd+" Token :"+tkn;
		commonUtil.sendEmail(cusED.getcEmail(),"Registered as customer",text,null);
		map.addAttribute("msg", msg);
		return "CustomerEDReg";
		
	}
	
	@RequestMapping("/getAllCusEd")
	public String getAllCusEd(ModelMap map){
		List<Item> cus=service.getAllCustomerED(0);
		return null;
		
	}

}
