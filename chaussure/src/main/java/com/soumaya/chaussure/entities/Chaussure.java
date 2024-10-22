package com.soumaya.chaussure.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Chaussure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long idChaussure; 
	 private String nomChaussure; 
	 private int prixChaussure;
	 private int pointureChaussure;
	 private String couleurChaussure;
	 
	@ManyToOne
	private LieuCreationChaussure lieu;
	
	public Chaussure() {
		super();
	}
	
	public Chaussure(String nomChaussure, int prixChaussure, int pointureChaussure, String couleurChaussure) {
		super();
		this.nomChaussure = nomChaussure;
		this.prixChaussure = prixChaussure;
		this.pointureChaussure = pointureChaussure;
		this.couleurChaussure = couleurChaussure;
	}



	public Long getIdChaussure() {
		return idChaussure;
	}
	public void setIdChaussure(Long idChaussure) {
		this.idChaussure = idChaussure;
	}
	public String getNomChaussure() {
		return nomChaussure;
	}
	public void setNomChaussure(String nomChaussure) {
		this.nomChaussure = nomChaussure;
	}
	public int getPrixChaussure() {
		return prixChaussure;
	}
	public void setPrixChaussure(int prixChaussure) {
		this.prixChaussure = prixChaussure;
	}
	public int getPointureChaussure() {
		return pointureChaussure;
	}
	public void setPointureChaussure(int pointureChaussure) {
		this.pointureChaussure = pointureChaussure;
	}
	public String getCouleurChaussure() {
		return couleurChaussure;
	}
	public void setCouleurChaussure(String couleurChaussure) {
		this.couleurChaussure = couleurChaussure;
	}
	
	public LieuCreationChaussure getLieu() {
		return lieu;
	}

	public void setLieu(LieuCreationChaussure lieu) {
		this.lieu = lieu;
	}

	@Override
	public String toString() {
		return "Chaussure [idChaussure=" + idChaussure + ", nomChaussure=" + nomChaussure + ", prixChaussure="
				+ prixChaussure + ", pointureChaussure=" + pointureChaussure + ", couleurChaussure=" + couleurChaussure
				+ "]";
	}
	
	
	 
	 
}
