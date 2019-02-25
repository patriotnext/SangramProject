package com.app.dao;

import java.util.List;

import com.app.model.Document;

public interface IDocumenDao {
	public int saveDocument(Document doc);
	public List<Object[]> getFileIdName();
	
	public Document getDocumentById(int docId);

}
