package com.bliss.monitoring.service;

import java.net.InetAddress;

import org.jtransfo.JTransfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/*L'annotation @Transactional permet de délimiter une transaction (entre le début et la fin de la méthode) et de définir le comportement transactionnel d'une méthode.

    propagation : précise le mode de propagation de la transaction grâce à une énumération de type Propagation. La valeur par défaut est Propagation.REQUIRED
    readonly : booléen qui précise de façon informative au système de gestion des transactions sous-jacent si la transaction est en lecture seule (true) ou si elle effectue des mises à jour (false)
    isolation : précise le niveau d'isolation de la transaction grâce à une énumération de type Isolation. La valeur par défaut est Isolation.DEFAULT
    timeout : entier qui précise le timeout de la transaction

*/
@Transactional
@Service //l'annotation @Service, cela permet d'utiliser l'auto détection. 
public class PingService {
	
	//variables d'instance	
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
