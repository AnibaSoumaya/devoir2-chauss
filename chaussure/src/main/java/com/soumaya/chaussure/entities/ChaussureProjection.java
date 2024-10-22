package com.soumaya.chaussure.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nomChauss", types = { Chaussure.class })
public interface ChaussureProjection {
	public String getNomChaussure();
	
}
