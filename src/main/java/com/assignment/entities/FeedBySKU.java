package com.assignment.entities;

import java.util.Date;


/**
 * @author keerthana
 * this class represents the table structure of Feed_By_SKU table
 */
public class FeedBySKU {
	
	private String sku;
	private Integer optionGroupID;
	private String optionID;
	private String salesOrg;
	private String mpn;
	private String description;
	private String publishedDescr;
	private String dispyOnWeb;
	private Date startDate;
	private Date endDate;
	
	public String getSku() {
		return sku;
	}
	public void setSku(String sku) {
		this.sku = sku;
	}
	public Integer getOptionGroupID() {
		return optionGroupID;
	}
	public void setOptionGroupID(Integer optionGroupID) {
		this.optionGroupID = optionGroupID;
	}
	public String getOptionID() {
		return optionID;
	}
	public void setOptionID(String optionID) {
		this.optionID = optionID;
	}
	public String getSalesOrg() {
		return salesOrg;
	}
	public void setSalesOrg(String salesOrg) {
		this.salesOrg = salesOrg;
	}
	public String getMpn() {
		return mpn;
	}
	public void setMpn(String mpn) {
		this.mpn = mpn;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPublishedDescr() {
		return publishedDescr;
	}
	public void setPublishedDescr(String publishedDescr) {
		this.publishedDescr = publishedDescr;
	}
	public String getDispyOnWeb() {
		return dispyOnWeb;
	}
	public void setDispyOnWeb(String dispyOnWeb) {
		this.dispyOnWeb = dispyOnWeb;
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
