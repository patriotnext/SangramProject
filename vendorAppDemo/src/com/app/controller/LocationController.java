package com.app.controller;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.model.Location;
import com.app.service.ILocationService;
import com.app.util.LocationUtil;

@Controller
public class LocationController {
	
	@Autowired
	private ILocationService service;
	
	@Autowired
	private ServletContext sc;
	@Autowired
	private LocationUtil locUtil;
	
	@RequestMapping("/regLoc")
	public String ShowReg(){
		return "LocationRegister";
	}
	@RequestMapping(value="/saveLoc",method=RequestMethod.POST)
	public String insertLoc(@ModelAttribute("location") Location loc, ModelMap map){
		int locId=service.saveLocation(loc);
		String info="save with"+locId;
		map.addAttribute("msg", info);
		return "LocationRegister";
	}
	
	@RequestMapping("/getAllLoc")
	public String getAllData(ModelMap map,HttpServletRequest req){
		List<Location> list=service.getAllLocation();
	
		String sData[]={"A","B"};
		int iData[]={11,12};
		
		req.setAttribute("sData", sData);
		req.setAttribute("iData", iData);
		
		
		

		
	
		
		
		map.addAttribute("locs", list);// locs=key   value=list

return "LocationData";
	}
	
	@RequestMapping("/delectLoc")
	public String delLoc(@RequestParam("locId")int locId){
		service.deleteLocation(locId);
		return "redirect:getAllLoc";
	}
	
	@RequestMapping("/editLoc")
	public String showEdit(@RequestParam("locId") int locId, ModelMap map){
		Location loc=service.getLocationById(locId);
		map.addAttribute("loc", loc);// 1st loc is key  and 2nd loc is value
		return "LocationDataEdit";
		
	}
	@RequestMapping(value="/updateLoc", method=RequestMethod.POST)
	public String updatLoc(@ModelAttribute("location")Location loc){
		service.updateLocation(loc);
		return "redirect:getAllLoc";
		
	}
	@RequestMapping("/locExcel")
	public String doExcelExport(ModelMap map){
		List<Location> locList=service.getAllLocation();
		map.addAttribute("locList", locList);
		return "LocExcelView";
		
	}
	@RequestMapping("/locPdf")
	public String doPdfExport(ModelMap map){
		List<Location> locList=service.getAllLocation();
		map.addAttribute("locList", locList);
		return "LocPdfView";
	}
	
	//9. Chart creation (pie/bar)
	@RequestMapping("/locReport")
	public String generateCharts(){
		//path to sav image
		String path=sc.getRealPath("/");
		//data to create chart
		List<Object[]> data=service.getLocTypeAndCount();
		//call chart method
		locUtil.generatePieChart(path, data);
		locUtil.generateBarChart(path, data);
		//UI page to show Chart
		return "LocationReports";
		
	}
	
}




