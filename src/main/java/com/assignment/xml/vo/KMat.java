package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement(name = "KMAT")
@XmlAccessorType(XmlAccessType.FIELD)

public class KMat {

	@XmlElement (name = "ID")
	private String id;
	
	@XmlElement (name = "MPN")
	private String mpn;

	public KMat(String id, String mpn) {
		super();
		this.id = id;
		this.mpn = mpn;
	}

	public KMat() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMpn() {
		return mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}
	
	
}
