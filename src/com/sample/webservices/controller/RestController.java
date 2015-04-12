package com.sample.webservices.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import com.sample.webservices.PopResponse;
import com.sample.webservices.PushRequest;
import com.sample.webservices.PushResponse;
import com.sample.webservices.services.QueueService;

//Implementing REST Web Services using Spring

@Controller
@RequestMapping("/sample/rest")
public class RestController {

	@Autowired  
	private QueueService queueService; 
	
	/**
	 * Method which returns the status of the request to the caller as a String. The two parameters will be added to a JMS queue.
	 */
	@RequestMapping(value = "/pushRequest", method = RequestMethod.GET)
	public @ResponseBody PushResponse push(@RequestPayload PushRequest request) { 
		PushResponse pushResponse = new PushResponse();
		LinkedList<Integer> queue = new LinkedList<Integer>(); 
		try{
			queue.add(new Integer(request.getFirstInt())); 
			queue.add(new Integer(request.getSecondInt()));
			System.out.println("Queue: " + queue); 
			pushResponse.setStatus("SUCCESS");
			return pushResponse;
		} catch(Exception ex){
			System.out.println("Exception occur while pushing the integers on the Queue: " + ex.getMessage()); 
			pushResponse.setStatus("FAIL");
			return pushResponse;
		}
	} 


	/**
	 * Method which returns a list of all the elements ever added to the queue in the order added as a JSON structure. 
	 */
	@RequestMapping(value = "/popRequest", method = RequestMethod.GET, headers = {"Content-type=application/json"})
	public @ResponseBody PopResponse list() { 
		PopResponse popResponse = new PopResponse();
		List<Integer> elements = queueService.getElements();
		System.out.println("All the elements added to the queue -> " + elements);
		popResponse.setElements(elements);
		return popResponse;
	} 

	public void setQueueService(QueueService queueService) {  
		this.queueService = queueService;  
	}

}

