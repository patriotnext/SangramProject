package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Customer;

public class CustomerExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook book, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		res.addHeader("Content-Disposition", "filename;Customer.xls");
					List<Customer> cusList=(List<Customer>) map.get("cusList");
					HSSFSheet sheet=book.createSheet("CUSTOMER");
					
					setHead(sheet);
					
					setBody(sheet, cusList);
	}

	private void setHead(HSSFSheet sheet) {

		HSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("CODE");
		row.createCell(2).setCellValue("NAME");
		row.createCell(3).setCellValue("CNTR.TIME");
		row.createCell(4).setCellValue("PERCENT");
		row.createCell(5).setCellValue("MODE");
		row.createCell(6).setCellValue("EMAIL");
		row.createCell(7).setCellValue("TYPE");
		row.createCell(8).setCellValue("ADDRESS");
		row.createCell(9).setCellValue("DESCRIPTION");
	}

	private void setBody(HSSFSheet sheet, List<Customer> cusList) {

		int rowNum=1;
		for(Customer cus:cusList){
			HSSFRow row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(cus.getCusId());
			row.createCell(1).setCellValue(cus.getCusCode());
			row.createCell(2).setCellValue(cus.getCusName());
			row.createCell(3).setCellValue(cus.getCntTime());
			row.createCell(4).setCellValue(cus.getPercent());
			row.createCell(5).setCellValue(cus.getCusMode());
			row.createCell(6).setCellValue(cus.getCusMail());
			row.createCell(7).setCellValue(cus.getCusType());
			row.createCell(8).setCellValue(cus.getCustAddr());
			row.createCell(9).setCellValue(cus.getCusDesc());
			
		}
	}

}
