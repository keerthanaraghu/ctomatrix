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
@XmlRootElement(name = "Option")
@XmlAccessorType(XmlAccessType.FIELD)

public class Option {
	
	@XmlElement (name = "ID")
	private Integer optionId;
	
	@XmlElement (name = "PUBLISHED_DESCRIPTION")
	private String publishedDesc;
	
	@XmlElement (name = "DISPLAY_ON_WEB")
	private String displayOnWeb;
	
	@XmlElement (name = "START_DATE")
	private String startDate;
	
	@XmlElement (name = "END_DATE")
	private String endDate;
	
	@XmlElement (name = "SALES_ORGS")
	private SalesOrgs salesOrg;

	
	public Option() {
		super();
	}

	

	public Option(Integer optionId, String publishedDesc, String displayOnWeb, String startDate, String endDate,
			SalesOrgs salesOrg) {
		super();
		this.optionId = optionId;
		this.publishedDesc = publishedDesc;
		this.displayOnWeb = displayOnWeb;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salesOrg = salesOrg;
	}



	public Integer getOptionId() {
		return optionId;
	}

	public void setOptionId(Integer optionId) {
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

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}



	public SalesOrgs getSalesOrg() {
		return salesOrg;
	}



	public void setSalesOrg(SalesOrgs salesOrg) {
		this.salesOrg = salesOrg;
	}
	
	

}
