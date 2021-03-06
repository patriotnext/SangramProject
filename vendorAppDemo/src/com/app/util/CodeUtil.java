package com.app.util;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CodeUtil {
	private String getCommonStr(int len){
		return UUID.randomUUID().toString().replaceAll("-", "").substring(0, 8).toUpperCase();
		
	}
	private String getCommonStr(){
		return getCommonStr(6);
		
	}
	public String genToken(){
		return getCommonStr(8);
		
	}
	public String genPwd(){
		return getCommonStr();
		
	}
	

}
