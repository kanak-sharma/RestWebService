package com.sample.webservices;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="pushRequest")
public class PushRequest implements Serializable {
	
	private static final long serialVersionUID = 8438669936197906603L;
	
	@XmlElement(required = true)
	private int firstInt;
	
	@XmlElement(required = true)
	private int secondInt;
	
	public PushRequest(int i1, int i2) {
        this.firstInt= i1;
        this.secondInt= i2;
    }
	
	public int getFirstInt() {
		return firstInt;
	}

	public int getSecondInt() {
		return secondInt;
	}
}