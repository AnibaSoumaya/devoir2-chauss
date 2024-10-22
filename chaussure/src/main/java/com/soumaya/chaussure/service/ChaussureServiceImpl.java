package com.soumaya.chaussure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.soumaya.chaussure.entities.Chaussure;
import com.soumaya.chaussure.entities.LieuCreationChaussure;
import com.soumaya.chaussure.repos.ChaussureRepository;

@Service
public class ChaussureServiceImpl implements ChaussureService{

	@Autowired
	ChaussureRepository chaussureRepository;
	@Override
	public Chaussure saveChaussure(Chaussure c) {
		return chaussureRepository.save(c);
	}

	@Override
	public Chaussure updateChaussure(Chaussure c) {
		return chaussureRepository.save(c);
	}
  
	@Override
	public void deleteChaussure(Chaussure c) {
		chaussureRepository.delete(c);
		
	}

	@Override
	public void deleteChaussureById(Long id) {
		chaussureRepository.deleteById(id);
		
	}

	@Override
	public Chaussure getChaussure(Long id) {
		return chaussureRepository.findById(id).get();
	}

	@Override
	public List<Chaussure> getAllChaussures() {
		return chaussureRepository.findAll();
	}

	@Override
	public List<Chaussure> findByNomChaussure(String nom) {
		return chaussureRepository.findByNomChaussure(nom);
	}

	@Override
	public List<Chaussure> findByNomChaussureContains(String nom) {
		return chaussureRepository.findByNomChaussureContains(nom);
	}

	@Override
	public List<Chaussure> findByNomPrix(String nom, int prix) {
		return chaussureRepository.findByNomPrix(nom, prix);
	}
	

	@Override
	public List<Chaussure> findByLieu(LieuCreationChaussure lieu) {
		return chaussureRepository.findByLieu(lieu);
	}

	@Override
	public List<Chaussure> findByLieuIdLieu(Long id) {
		return chaussureRepository.findByLieuIdLieu(id);
	}

	@Override
	public List<Chaussure> findByOrderByNomChaussureAsc() {
		return chaussureRepository.findByOrderByNomChaussureAsc();
	}

	@Override
	public List<Chaussure> trierChaussureNomsPrix() {
		return chaussureRepository.trierChaussureNomsPrix();
	}
	
	
	
	

}
