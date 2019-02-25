package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IDocumenDao;
import com.app.model.Document;
@Repository
public class DocumentDaoImpl implements IDocumenDao {

	@Autowired
	private HibernateTemplate ht;
	@Override
	public int saveDocument(Document doc) {
		return (Integer) ht.save(doc);
	}
	@Override
	public List<Object[]> getFileIdName() {

		String hql="select fId, fName from com.app.model.Document";
		List<Object[]>list=ht.find(hql);
		
		return list;
	}
	@Override
	public Document getDocumentById(int docId) {
		return ht.get(Document.class, docId);
	}

}
