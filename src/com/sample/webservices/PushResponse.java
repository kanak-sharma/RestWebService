package com.sample.webservices;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pushResponse")
public class PushResponse implements Serializable {
	
	private static final long serialVersionUID = 8838669936197506603L;
	
	@XmlElement(required = true)
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

}