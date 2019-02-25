package com.app.controller.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.app.model.Vendor;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;

public class VendorPdfView extends AbstractPdfView {

	@Override
	protected void buildPdfDocument(Map<String, Object> map, Document doc, PdfWriter pdf, HttpServletRequest req,
			HttpServletResponse res) throws Exception {
		List<Vendor> vanList = (List<Vendor>) map.get("vanList");

		Paragraph p = new Paragraph("Welcome to Vendor Data");
		PdfPTable table = new PdfPTable(7);
		table.addCell("ID");
		table.addCell("NAME");
		table.addCell("CODE");
		table.addCell("TYPE");
		table.addCell("EMAIL");
		table.addCell("MOB.NO");
		table.addCell("ADDRSS");

		for (Vendor van : vanList) {
			table.addCell("" + van.getVenId());
			table.addCell(van.getVenName());
			table.addCell(van.getVenCode());
			table.addCell(van.getVenType());
			table.addCell(van.getVenEmail());
			table.addCell(van.getVenContact());
			table.addCell(van.getVenAddr());
		}
		doc.add(p);
		doc.add(table);

	}

}
