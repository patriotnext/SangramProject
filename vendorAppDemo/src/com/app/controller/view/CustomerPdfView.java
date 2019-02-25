package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Customer;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class CustomerPdfView extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter pdf, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		
		List<Customer>cusList=(List<Customer>) map.get("cusList");
		
		Paragraph p=new Paragraph("Welcome to Customer Data");
		
		PdfPTable table=new PdfPTable(10);
		table.addCell("ID");
		table.addCell("CODE");
		table.addCell("NAME");
		table.addCell("CNT.TIME");
		table.addCell("PERCENT");
		table.addCell("MODE");
		table.addCell("EMAIL");
		table.addCell("TYPE");
		table.addCell("ADDRESS");
		table.addCell("DESCRIPTION");
		
		for(Customer cus:cusList){
			table.addCell(""+cus.getCusId());
			table.addCell(cus.getCusCode());
			table.addCell(cus.getCusName());
			table.addCell(""+cus.getCntTime());
			table.addCell(""+cus.getPercent());
			table.addCell(cus.getCusMode());
			table.addCell(cus.getCusMail());
			table.addCell(cus.getCusType());
			table.addCell(cus.getCustAddr());
			table.addCell(cus.getCusDesc());
			
			doc.add(p);
			doc.add(table);
		}
	}

}
