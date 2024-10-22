package com.soumaya.chaussure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.soumaya.chaussure.entities.Chaussure;
import com.soumaya.chaussure.entities.LieuCreationChaussure;

@SpringBootApplication

public class ChaussureApplication implements CommandLineRunner{

	
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(ChaussureApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
	repositoryRestConfiguration.exposeIdsFor(Chaussure.class,LieuCreationChaussure.class);
	}     

}
