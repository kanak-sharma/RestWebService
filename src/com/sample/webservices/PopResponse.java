package com.sample.webservices;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="popResponse")
public class PopResponse implements Serializable {
	
	private static final long serialVersionUID = 8438669936197906603L;
	
	@XmlElement(required = true)
	private List<Integer> elements;

	public void setElements(List<Integer> elements) {
		this.elements = elements;
	}

	public List<Integer> getElements() {
		return elements;
	}

}
