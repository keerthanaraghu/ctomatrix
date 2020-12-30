package com.assignment.entities;

import java.util.Date;


/**
 * @author keerthana
 * this class represents the table structure of Feed_By_SKU table
 * 
 * 
 * mysql> select * from gpt.feedbysku;
 *  Empty set (0.01 sec)

	mysql> desc gpt.feedbysku;
	+-----------------------+--------------+------+-----+---------+-------+
	| Field                 | Type         | Null | Key | Default | Extra |
	+-----------------------+--------------+------+-----+---------+-------+
	| sku                   | varchar(50)  | NO   | PRI | NULL    |       |
	| optiongroupid         | int(11)      | NO   | PRI | NULL    |       |
	| optionvalueid         | int(11)      | NO   | PRI | NULL    |       |
	| salesorg              | int(11)      | NO   | PRI | NULL    |       |
	| mpn                   | varchar(50)  | YES  |     | NULL    |       |
	| description           | varchar(500) | YES  |     | NULL    |       |
	| published_description | varchar(500) | YES  |     | NULL    |       |
	| displayOnWeb          | varchar(1)   | YES  |     | NULL    |       |
	| start_date            | date         | YES  |     | NULL    |       |
	| end_date              | date         | YES  |     | NULL    |       |
	+-----------------------+--------------+------+-----+---------+-------+
 * 
 */
public class FeedBySKU {
	
	private String sku;
	private Integer optionGroupID;
	private Integer optionID;
	private Integer salesOrg;
	private String mpn;
	private String description;
	private String publishedDescr;
	private String dispyOnWeb;
	private String startDate;
	private String endDate;
	
	
	
	public FeedBySKU() {
		super();
	}
	public FeedBySKU(String sku, Integer optionGroupID, Integer optionID, Integer salesOrg, String mpn,
			String description, String publishedDescr, String dispyOnWeb, String startDate, String endDate) {
		super();
		this.sku = sku;
		this.optionGroupID = optionGroupID;
		this.optionID = optionID;
		this.salesOrg = salesOrg;
		this.mpn = mpn;
		this.description = description;
		this.publishedDescr = publishedDescr;
		this.dispyOnWeb = dispyOnWeb;
		this.startDate = startDate;
		this.endDate = endDate;
	}
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
	public Integer getOptionID() {
		return optionID;
	}
	public void setOptionID(Integer optionID) {
		this.optionID = optionID;
	}
	public Integer getSalesOrg() {
		return salesOrg;
	}
	public void setSalesOrg(Integer salesOrg) {
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
	
	
	
	
	
	

}
