package com.jsfdi;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "second")
@RequestScoped
public class SecondManageBean {
	/*
	 * to perform DI in JSF I can use annotation below. 
	 * in value property pass name of injected managed bean
	 */
	@ManagedProperty(value = "#{first}")
	private FirstManageBean fm;
		
	public String returnMsg(){
		return "I am text in second ManageBean";
	}
	
	public String getMsgFromFirstBean(){
		return fm.returnMsg();
	}

	public FirstManageBean getFm() {
		return fm;
	}

	public void setFm(FirstManageBean fm) {
		this.fm = fm;
	}	
	
}
