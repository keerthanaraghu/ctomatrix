package com.assignment.xml.vo;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;

/**
 * @author keerthana
 * this class represents the sales org fields
 */

@XmlRootElement(name = "SALES_ORG")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrg {
	
	@XmlElement(name = "ID")
	private Integer salesOrgID;
	
	@XmlElement(name = "EXTENTION_TYPE")
	private String extentionType;
	
	
	public SalesOrg() {
		super();
	}


	public SalesOrg(Integer salesOrgID, String extentionType) {
		super();
		this.salesOrgID = salesOrgID;
		this.extentionType = extentionType;
	}
	
	
	public Integer getSalesOrgID() {
		return salesOrgID;
	}
	public void setSalesOrgID(Integer salesOrgID) {
		this.salesOrgID = salesOrgID;
	}
	public String getExtentionType() {
		return extentionType;
	}
	public void setExtentionType(String extentionType) {
		this.extentionType = extentionType;
	}
	
	
}
