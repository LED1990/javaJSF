package com.pagenavigation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "nav")
@RequestScoped
public class NavigationBean {
	
	public String toNewPage(){
		return "newPage";
	}
}
