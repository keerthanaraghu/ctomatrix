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

@XmlRootElement(name = "KMATS")
@XmlAccessorType(XmlAccessType.FIELD)

public class KMats {
	@XmlElement (name = "KMAT")
	private List<KMat> kmats;

	public KMats() {
		super();
	}

	public KMats(List<KMat> kmats) {
		super();
		this.kmats = kmats;
	}

	public List<KMat> getKmats() {
		return kmats;
	}

	public void setKmats(List<KMat> kmats) {
		this.kmats = kmats;
	}
	
	

}
