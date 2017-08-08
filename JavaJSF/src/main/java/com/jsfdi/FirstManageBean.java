package com.jsfdi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "first")
@RequestScoped
public class FirstManageBean {
	
	String returnMsg(){
		return "I am text from first Bean and I am injected!";
	}
}
