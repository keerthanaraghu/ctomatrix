package com.assignment.xml.vo;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

/**
 * @author keerthana
 * this class represents the sales org fields
 */

@XmlRootElement(name = "SALES_ORGS")
@XmlAccessorType(XmlAccessType.FIELD)
public class SalesOrgs {
	
	@XmlElement (name = "SALES_ORG")
	private List<SalesOrg> salesOrg;

	public SalesOrgs(List<SalesOrg> salesOrg) {
		super();
		this.salesOrg = salesOrg;
	}

	public SalesOrgs() {
		super();
	}

	public List<SalesOrg> getSalesOrg() {
		return salesOrg;
	}

	public void setSalesOrg(List<SalesOrg> salesOrg) {
		this.salesOrg = salesOrg;
	}
	
	

}
