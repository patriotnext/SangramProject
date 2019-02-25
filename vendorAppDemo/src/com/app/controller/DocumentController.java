package com.app.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.app.model.Document;
import com.app.service.IDocumentService;

@Controller
public class DocumentController {
	@Autowired
	private IDocumentService service;
	
	@RequestMapping("/regDoc")
	public String showPage(ModelMap map){
		List<Object[]> list=service.getFileIdName();
		map.addAttribute("list", list);
		return "Document";
	}
	@RequestMapping(value="/uploadDoc", method=RequestMethod.POST)
	public String uploadDoc(@RequestParam("fId") int fid, @RequestParam("fObj") CommonsMultipartFile cmf){
		
		if(cmf!=null){
			Document doc=new Document();
			doc.setfId(fid);
			doc.setfName(cmf.getOriginalFilename());
			doc.setFdata(cmf.getBytes());
			service.saveDocument(doc);
			
		}
		return "redirect:regDoc";
		
	}
	@RequestMapping("/downloadDoc")
	public void downloadDocument(@RequestParam("docId") int fId, HttpServletResponse res){
		Document doc=service.getDocumentById(fId);
		String fname=doc.getfName();
		byte[] fdata=doc.getFdata();
		res.addHeader("Content-Disposition","attachment; filename="+fname);
		
		try {
			FileCopyUtils.copy(fdata, res.getOutputStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	

}
