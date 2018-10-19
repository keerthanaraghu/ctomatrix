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
	private String optionId;
	
	@XmlElement (name = "PUBLISHED_DESCRIPTION")
	private String publishedDesc;
	
	@XmlElement (name = "DISPLAY_ON_WEB")
	private String displayOnWeb;
	
	@XmlElement (name = "START_DATE")
	private Date startDate;
	
	@XmlElement (name = "END_DATE")
	private Date endDate;
	
	@XmlElement (name = "SALES_ORGS")
	private List<SalesOrg> salesOrg;

	
	public Option() {
		super();
	}

	

	public Option(String optionId, String publishedDesc, String displayOnWeb, Date startDate, Date endDate,
			List<SalesOrg> salesOrg) {
		super();
		this.optionId = optionId;
		this.publishedDesc = publishedDesc;
		this.displayOnWeb = displayOnWeb;
		this.startDate = startDate;
		this.endDate = endDate;
		this.salesOrg = salesOrg;
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



	public List<SalesOrg> getSalesOrg() {
		return salesOrg;
	}



	public void setSalesOrg(List<SalesOrg> salesOrg) {
		this.salesOrg = salesOrg;
	}
	
	

}
