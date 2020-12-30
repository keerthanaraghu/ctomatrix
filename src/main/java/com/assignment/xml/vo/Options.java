package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

/**
 * @author keerthana 
 * This class represents the option fields
 */
@XmlRootElement(name = "Options")
@XmlAccessorType(XmlAccessType.FIELD)

public class Options {
	
	@XmlElement (name = "Option")
	private List<Option> options;

	public Options(List<Option> options) {
		super();
		this.options = options;
	}

	public Options() {
		super();
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}
	
	

}
