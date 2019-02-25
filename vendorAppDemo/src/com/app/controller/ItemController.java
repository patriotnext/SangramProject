package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Item;
import com.app.model.Location;
import com.app.service.IItemService;

@Controller
public class ItemController {
	@Autowired
	private IItemService service;
	
	@RequestMapping("/regItm" )
	public String showReg(){
		return "ItemRegister";
		
	}
	
	@RequestMapping(value="/saveItm",method=RequestMethod.POST)
	public String insertItm(@ModelAttribute("item") Item itm, ModelMap map){
		int itmId=service.saveItem(itm);
		String info="save with"+itmId;
		map.addAttribute("msg", info);
		return "ItemRegister";
	}
	
	@RequestMapping("/getAllItm")
	public String getAllData(ModelMap map){
		List<Item> list=service.getAllItem();
		map.addAttribute("list", list);
		return "ItemData";
	}
	
	@RequestMapping("/deleteitm")
	public String delItm(@RequestParam("itmId")int itmId){
		service.deleteItem(itmId);
		return "redirect:getAllItm";
	}
	
	@RequestMapping("/edititm")
	public String showEdit(@RequestParam("itmId") int itmId, ModelMap map){
		Item itm=service.getItemById(itmId);
		map.addAttribute("itm", itm);
		return "ItemDataEdit";
		
	}
	@RequestMapping(value="/updateItm", method=RequestMethod.POST)
	public String updatItm(@ModelAttribute("itme")Item itm){
		service.updateItem(itm);
		return "redirect:getAllItm";
		
	}
	@RequestMapping("/itmExcel")
	public String doExcelExport(ModelMap map){
		List<Item>itmList=service.getAllItem();
		map.addAttribute("itmList", itmList);
		return "itmExcelView";
		
	}
	@RequestMapping("/itmPdf")
	public String doPdfExport(ModelMap map){
		List<Item>itmList=service.getAllItem();
		map.addAttribute("itmList", itmList);
		return "itmPdfView";
		
	}

}
