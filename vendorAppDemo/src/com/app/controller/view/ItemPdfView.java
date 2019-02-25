package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Item;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class ItemPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter pdf, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		List<Item>itmList=(List<Item>) map.get("itmList");
		
		Paragraph p=new Paragraph("Welcome to Item Data");
		PdfPTable table=new PdfPTable(7);
		table.addCell("ID");
		table.addCell("CODE");
		table.addCell("NAME");
		table.addCell("COST");
		table.addCell("BARCODE");
		table.addCell("DISCOUNT");
		table.addCell("MFD");
		
		for(Item itm:itmList){
			table.addCell(""+itm.getItmId());
			table.addCell(itm.getItmCode());
			table.addCell(itm.getItmName());
			table.addCell(""+itm.getItmCost());
			table.addCell(itm.getBarcode());
			table.addCell(itm.getDiscount());
			table.addCell(itm.getMfd());
		}
		doc.add(p);
		doc.add(table);
		
		
	}

}
