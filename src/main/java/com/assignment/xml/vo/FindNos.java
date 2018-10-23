package com.assignment.xml.vo;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;

/**
 * @author keerthana
 * this class represents the FindNo fields
 */

@XmlRootElement(name = "FIND_NOS")
@XmlAccessorType(XmlAccessType.FIELD)
public class FindNos {
	
	@XmlElement (name = "FIND_NO")
	private List<FindNo> findNos;

	public FindNos(List<FindNo> findNos) {
		super();
		this.findNos = findNos;
	}

	public FindNos() {
		super();
	}

	public List<FindNo> getFindNos() {
		return findNos;
	}

	public void setFindNos(List<FindNo> findNos) {
		this.findNos = findNos;
	}
	
	
}
