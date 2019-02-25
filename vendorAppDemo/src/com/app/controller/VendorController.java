package com.app.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Vendor;
import com.app.service.IVendorService;
import com.app.util.CommonUtil;

@Controller
public class VendorController {
	@Autowired
	private CommonUtil commonUtil;

	@Autowired
	private IVendorService service;

	@RequestMapping("/regVen")
	public String showReg1() {
		return "VendorRegister";

	}

	@RequestMapping(value = "/saveVen", method = RequestMethod.POST)
	public String insertVendor(@ModelAttribute("vendor") Vendor vn, ModelMap map, @RequestParam("fobj") CommonsMultipartFile cmf) {
		int vid = service.saveVendor(vn);
		String info = "save with" + vid;
		map.addAttribute("msg", info);
		commonUtil.sendEmail(vn.getVenEmail(), "Hello Vendor", "Your Id is" + vid, cmf);
		return "VendorRegister";

	}

	@RequestMapping("/getAllVendor")
	public String getAll(ModelMap map) {
		List<Vendor> list = service.getAllVendor();
		map.addAttribute("list", list);
		return "VendorData";

	}

	@RequestMapping("/deleteVan")
	public String deletVendor(@RequestParam("venId") int venId) {
		service.deleteVendor(venId);
		return "redirect:getAllVendor";

	}

	@RequestMapping("/editVan")
	public String showEdit(@RequestParam("venId") int venId, ModelMap map) {
		Vendor van = service.getVendorById(venId);
		map.addAttribute("van", van);
		return "VendorDataEdit";
	}

	@RequestMapping(value = "/updatVen", method = RequestMethod.POST)
	public String updatLoc(@ModelAttribute("vendor") Vendor van) {
		service.updateVendor(van);
		return "redirect:getAllVendor";
	}

	@RequestMapping("/vanExcel")
	public String doExcelExport(ModelMap map) {
		List<Vendor> vanList = service.getAllVendor();
		map.addAttribute("vanList", vanList);
		return "vanExcelView";

	}

	@RequestMapping("/vanPdf")
	public String doPdfExport(ModelMap map) {
		List<Vendor> vanList = service.getAllVendor();
		map.addAttribute("vanList", vanList);
		return "vanPdfView";

	}

}
