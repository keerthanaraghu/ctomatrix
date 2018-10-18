package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "Options")
@XmlAccessorType(XmlAccessType.FIELD)

public class Option {
	
	@XmlElement (name = "ID")
	private String optionId;
	
	@XmlElement (name = "PUBLISHED_DESCRIPTION")
	private String publishedDesc;
	
	@XmlElement (name = "DISPLAY_ON_WEB")
	private String displayOnWeb;
	
	@XmlElement (name = "START_DATE")
	private Date startDate;
	
	@XmlElement (name = "END_DATE")
	private Date endDate;

	
	public Option() {
		super();
	}

	public Option(String optionId, String publishedDesc, String displayOnWeb, Date startDate, Date endDate) {
		super();
		this.optionId = optionId;
		this.publishedDesc = publishedDesc;
		this.displayOnWeb = displayOnWeb;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public String getOptionId() {
		return optionId;
	}

	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}

	public String getPublishedDesc() {
		return publishedDesc;
	}

	public void setPublishedDesc(String publishedDesc) {
		this.publishedDesc = publishedDesc;
	}

	public String getDisplayOnWeb() {
		return displayOnWeb;
	}

	public void setDisplayOnWeb(String displayOnWeb) {
		this.displayOnWeb = displayOnWeb;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	

}
