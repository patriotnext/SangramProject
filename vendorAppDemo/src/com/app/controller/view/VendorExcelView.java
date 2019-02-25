package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Vendor;

public class VendorExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook book, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		res.addHeader("Content-Disposition", "attachment; filename=vendor.xls");
		List<Vendor> vanList=(List<Vendor>) map.get("vanList");
		HSSFSheet sheet=book.createSheet("VANDORS");
		
		setHead(sheet);
		
		setBody(sheet, vanList);
	}

	private void setHead(HSSFSheet sheet) {

		HSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("NAME");
		row.createCell(2).setCellValue("CODE");
		row.createCell(3).setCellValue("TYPE");
		row.createCell(4).setCellValue("EMAIL");
		row.createCell(5).setCellValue("MOBILE.NO");
		row.createCell(6).setCellValue("ADDRESS");
	}

	private void setBody(HSSFSheet sheet, List<Vendor> vanList) {

		int rowNum=1;
		for(Vendor van:vanList){
			HSSFRow row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(van.getVenId());
			row.createCell(1).setCellValue(van.getVenName());
			row.createCell(2).setCellValue(van.getVenCode());
			row.createCell(3).setCellValue(van.getVenType());
			row.createCell(4).setCellValue(van.getVenEmail());
			row.createCell(5).setCellValue(van.getVenContact());
			row.createCell(6).setCellValue(van.getVenAddr());
		}
	}

}
