package com.soumaya.chaussure.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.soumaya.chaussure.entities.LieuCreationChaussure;

@RepositoryRestResource(path = "lieu")
@CrossOrigin(origins = "http://localhost:4200/") //pour autoriser angular
public interface LieuCreationChaussureRepository extends JpaRepository<LieuCreationChaussure, Long> {

}
