package com.bliss.monitoring.controller;

import java.util.List;

import org.jtransfo.JTransfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bliss.monitoring.dao.UrlDao;
import com.bliss.monitoring.dto.MachineDto;
import com.bliss.monitoring.dto.UrlDto;
import com.bliss.monitoring.model.Url;
import com.bliss.monitoring.service.PingService;

@RestController
public class PingController {

	@Autowired
	UrlDao urlDao;
	
	@Autowired
	JTransfo jTransfo;

	@Autowired
	PingService pingService;
	
	@RequestMapping(value = "/ping", method = RequestMethod.GET)
	public List<UrlDto> userAuthenticate()
	{
		List<Url> urls = urlDao.findAll();
		List<UrlDto> urlsDto = pingService.pingAndConvert(urls);
		
		
		return urlsDto;
	}
	
	@RequestMapping(value = "/newUrl", method = RequestMethod.POST)
	@CrossOrigin(origins = "*")
	public String addNewUrl(@RequestBody UrlDto urlDto)
	{
		Url url = (Url) jTransfo.convert(urlDto);
		if(null != url)
		{
			urlDao.save(url);
			return "OK";
		}
		
		return "KO";
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public MachineDto informationList()
	{
		MachineDto machine = new MachineDto(1, 8, true, "");

		return machine;
	}
	
	
}
