package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.web.servlet.view.document.AbstractExcelView;

import com.app.model.Item;

public class ItemExcelView extends AbstractExcelView{

	@Override
	protected void buildExcelDocument(Map<String, Object> map, HSSFWorkbook book, HttpServletRequest rq,
			HttpServletResponse res) throws Exception {
		res.addHeader("Content-Disposition", "attachment; filename=Item.xls");
		List<Item>itmList=(List<Item>) map.get("itmList");
		HSSFSheet sheet=book.createSheet("ITEM");
		
		setHead(sheet);
		
		setBody(sheet,itmList);
	}

	private void setHead(HSSFSheet sheet) {

		HSSFRow row=sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("CODE");
		row.createCell(2).setCellValue("NAME");
		row.createCell(3).setCellValue("COST");
		row.createCell(4).setCellValue("BARCODE");
		row.createCell(5).setCellValue("DISCOUNT");
		row.createCell(6).setCellValue("MFD");
	}

	private void setBody(HSSFSheet sheet, List<Item> itmList) {

		int rowNum=1;
		for(Item itm: itmList){
			HSSFRow row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(itm.getItmId());
			row.createCell(0).setCellValue(itm.getItmCode());
			row.createCell(0).setCellValue(itm.getItmName());
			row.createCell(0).setCellValue(itm.getItmCost());
			row.createCell(0).setCellValue(itm.getBarcode());
			row.createCell(0).setCellValue(itm.getDiscount());
			row.createCell(0).setCellValue(itm.getMfd());
		}
	}

}
