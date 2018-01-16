package com.example.demo;

import java.io.Serializable;

public class Players implements Serializable{
	private String name;
	private String position;
	
	
	public Players(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	public Players() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	


}
