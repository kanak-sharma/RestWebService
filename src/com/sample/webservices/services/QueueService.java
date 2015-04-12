package com.sample.webservices.services;

import java.util.List;

/**  
 * The Interface QueueService.  
 */ 
public interface QueueService {
	/**  
	 * Gets a list of all the elements ever added to the queue from a database  
	 *  
	 * @return the list of all the Elements i.e. List<Integer>  
	 */  
	public List<Integer> getElements() ;
	
}
