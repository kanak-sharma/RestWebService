package com.sample.webservices.services;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Service;

/**  
 * The Class QueueServiceImpl.  
 */  

@Service
public class QueueServiceImpl {
	/**  
	 * Gets a list of all the elements ever added to the queue from a database
	 *  
	 * @return the list of all the Elements i.e. List<Integer>   
	 */  
	public List<Integer> getElements() { 
		/* hard coded the List of Elements ever added in the queue - in reality this data would be retrieved from a database */  
		LinkedList<Integer> queue = new LinkedList<Integer>(); 
		queue.add(12);
		queue.add(3);
		queue.add(21);
		queue.add(33);
		return queue;  
	}  
}
