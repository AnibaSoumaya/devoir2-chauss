package com.soumaya.chaussure;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.soumaya.chaussure.entities.Chaussure;
import com.soumaya.chaussure.entities.LieuCreationChaussure;
import com.soumaya.chaussure.repos.ChaussureRepository;

@SpringBootTest
class ChaussureApplicationTests {
	@Autowired
	private ChaussureRepository chaussureRepository;
	@Test
	public void testCreateChaussure() {
	Chaussure chauss = new Chaussure("frip",25,42,"Blanc");
	chaussureRepository.save(chauss);
	}
	
	@Test
	public void testFindChaussure()
	{
	Chaussure c = chaussureRepository.findById(1L).get();
	System.out.println(c);
	}
	
	@Test
	public void testUpdateChaussure()
	{
	Chaussure c = chaussureRepository.findById(1L).get();
	c.setPrixChaussure(299);
	chaussureRepository.save(c);
	}
	
	@Test
	public void testDeleteChaussure()
	{
	chaussureRepository.deleteById(3L);;
	}
	
	@Test
	public void testListerTousChaussures()
	{
	List<Chaussure> chauss = chaussureRepository.findAll();
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	}
	}
	
	@Test
	public void testFindByNomChaussure()
	{
	List<Chaussure> chauss = chaussureRepository.findByNomChaussure("Addidas");
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	}
	}
	
	@Test
	public void testFindByNomChaussureContains ()
	{
	List<Chaussure> chauss=chaussureRepository.findByNomChaussureContains("a");
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	} 
	}
	
	@Test
	public void testfindByNomPrix()
	{
	List<Chaussure> chauss = chaussureRepository.findByNomPrix("Addidas",299);
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	}
	}
	
	@Test
	public void testfindByLieu()
	{
	LieuCreationChaussure lieu = new LieuCreationChaussure();
	lieu.setIdLieu(1L);
	List<Chaussure> chauss = chaussureRepository.findByLieu(lieu);
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	}
	}
	
	@Test
	public void findByLieuIdLieu()
	{
	List<Chaussure> chauss = chaussureRepository.findByLieuIdLieu(1L);
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	}
	}
	
	@Test
	public void testfindByOrderByNomChaussureAsc()
	{
	List<Chaussure> chauss =
	chaussureRepository.findByOrderByNomChaussureAsc();
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	}
	}
	
	@Test
	public void testTrierChaussuresNomsPrix()
	{
	List<Chaussure> chauss = chaussureRepository.trierChaussureNomsPrix();
	for (Chaussure c : chauss)
	{
		System.out.println(c);
	}
	}
	
	
	
	
	
	
	
	
	
	
	

}
