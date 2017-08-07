package com.managebeans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/*
 * @ManageBean - has two available params, name and eager
 * normally beans are lazy instantiated - only when requested
 * to force bean to instantiated earlier set eager = true!!
 * 
 * Also we have to define scope for bean
 */
@ManagedBean(name = "firstBean")
@RequestScoped
public class FirstBean {
	private String msg = "first Manage Bean!";

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	} 	
	
}
