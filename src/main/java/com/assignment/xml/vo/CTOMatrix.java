package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "CTO_MATRIX")
@XmlAccessorType(XmlAccessType.FIELD)

public class CTOMatrix {
	
	@XmlElement (name = "KMATS")
	private List<KMat> kmats;
	
	@XmlElement (name = "FIND_NOS")
	private List<FindNos> findNos;
	
	@XmlElement (name = "Options")
	private Option options;
	
	@XmlElement (name = "SALES_ORGS")
	private List<SalesOrg> salesOrgs;

	public CTOMatrix() {
		super();
	}

	public CTOMatrix(List<KMat> kmats, List<FindNos> findNos, Option options, List<SalesOrg> salesOrgs) {
		super();
		this.kmats = kmats;
		this.findNos = findNos;
		this.options = options;
		this.salesOrgs = salesOrgs;
	}

	public List<KMat> getKmats() {
		return kmats;
	}

	public void setKmats(List<KMat> kmats) {
		this.kmats = kmats;
	}

	public List<FindNos> getFindNos() {
		return findNos;
	}

	public void setFindNos(List<FindNos> findNos) {
		this.findNos = findNos;
	}

	public Option getOptions() {
		return options;
	}

	public void setOptions(Option options) {
		this.options = options;
	}

	public List<SalesOrg> getSalesOrgs() {
		return salesOrgs;
	}

	public void setSalesOrgs(List<SalesOrg> salesOrgs) {
		this.salesOrgs = salesOrgs;
	}
	
	

}
