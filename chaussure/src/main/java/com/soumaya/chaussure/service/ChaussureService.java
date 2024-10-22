package com.soumaya.chaussure.service;

import java.util.List;

import com.soumaya.chaussure.entities.Chaussure;
import com.soumaya.chaussure.entities.LieuCreationChaussure;

public interface ChaussureService {
	
	Chaussure saveChaussure(Chaussure c);
	Chaussure updateChaussure(Chaussure c);
	void deleteChaussure(Chaussure c);
	void deleteChaussureById(Long id);
	Chaussure getChaussure(Long id);
	List<Chaussure> getAllChaussures();
	List<Chaussure> findByNomChaussure(String nom);
	List<Chaussure> findByNomChaussureContains(String nom);
	List<Chaussure> findByNomPrix (String nom, int prix);
	List<Chaussure> findByLieu (LieuCreationChaussure lieu);
	List<Chaussure> findByLieuIdLieu(Long id);
	List<Chaussure> findByOrderByNomChaussureAsc();
	List<Chaussure> trierChaussureNomsPrix();
	
	
}
