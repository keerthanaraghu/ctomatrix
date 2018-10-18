package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "FIND_NO")
@XmlAccessorType(XmlAccessType.FIELD)

public class FindNos {
	
	@XmlElement (name = "ID")
	private Integer id;
	
	@XmlElement (name = "Description")
	private String description;

	public FindNos() {
		super();
	}

	public FindNos(Integer id, String description) {
		super();
		this.id = id;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	

}
