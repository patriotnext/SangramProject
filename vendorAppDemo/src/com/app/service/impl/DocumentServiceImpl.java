package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dao.IDocumenDao;
import com.app.model.Document;
import com.app.service.IDocumentService;
@Service
public class DocumentServiceImpl implements IDocumentService {

	@Autowired
	private IDocumenDao dao;
	@Override
	public int saveDocument(Document doc) {
		return dao.saveDocument(doc);
	}
	@Override
	public List<Object[]> getFileIdName() {
		return dao.getFileIdName();
	}
	@Override
	public Document getDocumentById(int docId) {
		return dao.getDocumentById(docId);
	}

}
