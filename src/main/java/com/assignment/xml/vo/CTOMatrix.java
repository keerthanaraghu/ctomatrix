package com.assignment.xml.vo;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;


/**
 * @author keerthana
 * this class represents the CTO Matrix
 */

@XmlRootElement(name = "CTO_MATRIX")
@XmlAccessorType(XmlAccessType.FIELD)

public class CTOMatrix {
	
	@XmlElement (name = "KMATS")
	private KMats kmats;

	public CTOMatrix() {
		super();
	}

	public CTOMatrix(KMats kmats) {
		super();
		this.kmats = kmats;
	}

	public KMats getKmats() {
		return kmats;
	}

	public void setKmats(KMats kmats) {
		this.kmats = kmats;
	}

	

}
