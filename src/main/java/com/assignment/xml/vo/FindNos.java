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

public class FindNos {
	
	@XmlElement (name = "ID")
	private Integer id;
	
	@XmlElement (name = "Description")
	private String description;
	
	@XmlElement (name = "Options")
	private List<Option> options;

	public FindNos() {
		super();
	}

	public FindNos(Integer id, String description, List<Option> options) {
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

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	
	

}
