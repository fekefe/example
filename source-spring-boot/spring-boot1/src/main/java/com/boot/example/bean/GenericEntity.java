package com.boot.example.bean;

import java.io.Serializable;

/**
 * @author DEPT RD4 gaoquan(gaoquan@dvt.dvt.com) on 2018/5/18
 */
public class GenericEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String value;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}
}
