package com.soumaya.chaussure.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumaya.chaussure.entities.LieuCreationChaussure;
import com.soumaya.chaussure.repos.LieuCreationChaussureRepository;

@RestController
@RequestMapping("/api/lieu")
@CrossOrigin("http://localhost:4200/")
public class LieuCreationChaussureRESTController {

	@Autowired
	LieuCreationChaussureRepository lieuCreationChaussureRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public List<LieuCreationChaussure> getAllLieu()
	{
		return lieuCreationChaussureRepository.findAll();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public LieuCreationChaussure getLieuById(@PathVariable("id") Long id) {
	return lieuCreationChaussureRepository.findById(id).get();
	}
}
