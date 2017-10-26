package com.bliss.monitoring.controller;

import org.jtransfo.JTransfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bliss.monitoring.dao.MachineDao;
import com.bliss.monitoring.dto.MachineDto;
import com.bliss.monitoring.model.Machine;
import com.bliss.monitoring.service.PingService;

@RestController
public class PingController {

	@Autowired
	MachineDao machineDao;
	
	@Autowired
	JTransfo jTransfo;

	@Autowired
	PingService pingService;
	

	
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	@CrossOrigin(origins = "*")
	public String addNewUrl(@RequestBody MachineDto machineDto)
	{
		Machine machine = (Machine) jTransfo.convert(machineDto);
		if(null != machine)
		{	
			String url = machine.getUrlMachine();
			Machine m = machineDao.findByUrlMachine(url);
			if(m != null) {
				machine.setIdMachine(m.getIdMachine());
				machine.setIdSalle(m.getIdSalle());
			}
			else {
				machine.setIdSalle(1);
			}
			
			machineDao.save(machine);
			return "OK";
		}
		
		return "KO";
		
	}
	
	@RequestMapping(value = "/check1", method = RequestMethod.POST)
	@CrossOrigin(origins = "*")
	public String check()
	{
		MachineDto m = new MachineDto();
		Machine machine = (Machine) jTransfo.convert(m);
		if(null != machine)
		{
			machineDao.save(machine);
			return "OK";
		}
		
		return "KO";
		
	}
	
	@RequestMapping(value = "/info", method = RequestMethod.GET)
	public MachineDto informationList()
	{
		MachineDto machine = new MachineDto();

		return machine;
	}
	
	
}
