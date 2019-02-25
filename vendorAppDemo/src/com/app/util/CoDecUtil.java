package com.app.util;

import org.springframework.stereotype.Component;

import com.sun.org.apache.xml.internal.security.exceptions.Base64DecodingException;
import com.sun.org.apache.xml.internal.security.utils.Base64;
@Component
public class CoDecUtil {
	public String doEncode(String nrml){
		return new String(Base64.encode(nrml.getBytes()));
		
	}
	public String doDecode(String enc) throws Base64DecodingException{
		return new String(Base64.decode(enc.getBytes()));
		
	}
	

}
