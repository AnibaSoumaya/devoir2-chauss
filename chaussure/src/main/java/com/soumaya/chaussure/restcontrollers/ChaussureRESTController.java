package com.soumaya.chaussure.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumaya.chaussure.entities.Chaussure;
import com.soumaya.chaussure.service.ChaussureService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class ChaussureRESTController {
	
	@Autowired
	ChaussureService chaussureService;
	
	@RequestMapping(path="all",method = RequestMethod.GET)
	
	public List<Chaussure> getAllChaussures() 
	{
		return chaussureService.getAllChaussures();
	}
	
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	//@GetMapping("/getbyid/{id}")
	public Chaussure getChaussureById(@PathVariable("id") Long id) 
	{
		return chaussureService.getChaussure(id);
	}
	
	@RequestMapping(value="/addchauss",method = RequestMethod.POST)
	//@PostMapping("/addchauss")
	
	public Chaussure createChaussure(@RequestBody Chaussure Chaussure) 
	{
		return chaussureService.saveChaussure(Chaussure);
	}
	
	@RequestMapping(value="/updatechauss",method = RequestMethod.PUT)
	//@PutMapping("/updateChauss")
	public Chaussure updateChaussure(@RequestBody Chaussure Chaussure) 
	{
		return chaussureService.updateChaussure(Chaussure);
	}

	@RequestMapping(value="/delchauss/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/delchauss/{id}")
	
	public void deletechaussure(@PathVariable("id") Long id)
	{
		chaussureService.deleteChaussureById(id);
	}
	
	@RequestMapping(value="/chausslieu/{idLieu}",method = RequestMethod.GET)
	public List<Chaussure> getChaussuresByCatId(@PathVariable("idLieu") Long idLieu) 
	{
		return chaussureService.findByLieuIdLieu(idLieu);
	}
}
