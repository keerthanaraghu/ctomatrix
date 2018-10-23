package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;


/**
 * @author keerthana
 * this class represents the KMAT fields
 */

@XmlRootElement(name = "KMAT")
@XmlAccessorType(XmlAccessType.FIELD)

public class KMat {

	@XmlElement (name = "ID")
	private String id;
	
	@XmlElement (name = "MPN")
	private String mpn;
	
	@XmlElement (name = "FIND_NOS")
	private FindNos findNos;


	public KMat(String id, String mpn, FindNos findNos) {
		super();
		this.id = id;
		this.mpn = mpn;
		this.findNos = findNos;
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

	public FindNos getFindNos() {
		return findNos;
	}

	public void setFindNos(FindNos findNos) {
		this.findNos = findNos;
	}
	
	
	
}
