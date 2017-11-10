package com.bliss.monitoring.controller;

import java.util.List;

import org.jtransfo.JTransfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bliss.monitoring.dao.HistoriqueDao;
import com.bliss.monitoring.dao.MachineDao;
import com.bliss.monitoring.dto.MachineDto;
import com.bliss.monitoring.dto.MachineSalleDto;
import com.bliss.monitoring.model.Historique;
import com.bliss.monitoring.model.Machine;
import com.bliss.monitoring.service.PingService;

@RestController
public class PingController {

	@Autowired
	MachineDao machineDao;
	
	@Autowired
	HistoriqueDao historiqueDao;
	
	@Autowired
	JTransfo jTransfo;

	@Autowired
	PingService pingService;
	

	
	@RequestMapping(value = "/check", method = RequestMethod.POST)
	@CrossOrigin(origins = "*")
	public String addNewUrl(@RequestBody MachineDto machineDto)
	{
		Machine machineRetour = machineDao.findByIdMachine(machineDto.getIdMachine());
			if(machineRetour!= null){
				machineDto.setIdSalle(machineRetour.getIdSalle());
			}
			
		
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
			if(!machineDto.isEtat()){
			Historique h = new Historique();
			h.setIdMachine(machine.getIdMachine());
			h.setMessage(machine.getMessage());
			h.setDate(machine.getDateDernierRecut());
			h.setNomMachine(machine.getNomMachine());
			historiqueDao.save(h);
			}
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
	
	@RequestMapping(value = "/token{login}", method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public MachineDto informationList(@PathVariable String login)
	{
		MachineDto machine = new MachineDto();

		return machine;
	}
	
	@RequestMapping(value = "/updateSalle", method = RequestMethod.POST)
	@CrossOrigin(origins = "*")
	public String updateSalle(@RequestBody MachineSalleDto machineSalle)
	{
		
		for(int i=0; i<machineSalle.getIdMachine().size();i++){
			Machine m = machineDao.findByIdMachine(machineSalle.getIdMachine().get(i));
			m.setIdSalle(machineSalle.getIdSalle());
			machineDao.save(m);
		}
		return "ok";
		
	}
	@RequestMapping(value = "/updateSalle2", method = RequestMethod.POST)	
	@CrossOrigin(origins = "*")
	public Machine updateSalle(@RequestBody MachineDto machine)
	{

		Machine m = machineDao.findByIdMachine(machine.getIdMachine());
		m.setIdSalle(machine.getIdSalle());
		machineDao.save(m);
		return m;
		
	}
	
	@RequestMapping(value = "/getMachinesBySalle", method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public List<Machine> getMachinesBySalle(@RequestParam int idSalle)
	{
		return machineDao.findByIdSalle(idSalle);
	}
	
	
}
