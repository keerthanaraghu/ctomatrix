package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

/**
 * @author keerthana
 * this class represents the FindNo fields
 */

@XmlRootElement(name = "FIND_NO")
@XmlAccessorType(XmlAccessType.FIELD)

public class FindNo {
	
	@XmlElement (name = "ID")
	private Integer id;
	
	@XmlElement (name = "Description")
	private String description;
	
	@XmlElement (name = "Options")
	private Options options;

	public FindNo() {
		super();
	}

	public FindNo(Integer id, String description, Options options) {
		super();
		this.id = id;
		this.description = description;
		this.options = options;
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

	public Options getOptions() {
		return options;
	}

	public void setOptions(Options options) {
		this.options = options;
	}
	
	
	

}
