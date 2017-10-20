package com.bliss.monitoring.service;

import java.net.InetAddress;

import org.jtransfo.JTransfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class PingService {
	
	@Autowired
	JTransfo jTransfo;
	
	public static boolean ping(String url) {
		boolean status = false;
		int timeout = 1000;
		  try {
		      InetAddress address = InetAddress.getByName(url);
		        if (address.isReachable(timeout)) 
		        {
		        	status = true;
		        }
		        else 
		        {
		        	status= false;
		        }
		      
		    } catch (Exception e) 
		  	{
		    	status= false;
		    }
		  
		return status;
	}
	
//	public List<UrlDto> pingAndConvert(List<Url> u){
//		List<UrlDto> urlList = new ArrayList<UrlDto>();
//		for(int i=0; i < u.size(); i++) {
//			urlList.add(jTransfo.convertTo(u.get(i), UrlDto.class));
//			urlList.get(i).setStatus(ping(u.get(i).getValue()));
//		}
//		return urlList;
//	}
	
	

}
