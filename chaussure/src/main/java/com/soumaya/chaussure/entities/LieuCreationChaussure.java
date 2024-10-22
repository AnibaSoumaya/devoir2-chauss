package com.soumaya.chaussure.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class LieuCreationChaussure {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idLieu;
	private String pays;
    private int codeBar;
    
    
    @JsonIgnore
    @OneToMany(mappedBy = "lieu")
    private List<Chaussure> chaussure;
    
	
	public LieuCreationChaussure(String pays, int codeBar ,List<Chaussure> chaussure) {
		super();
		this.pays = pays;
		this.codeBar = codeBar;
		this.chaussure = chaussure;
	}
	public Long getIdLieu() {
		return idLieu;
	}
	public void setIdLieu(Long idLieu) {
		this.idLieu = idLieu;
	}
	public String getPays() {
		return pays;
	}
	public void setPays(String pays) {
		this.pays = pays;
	}
	public int getCodeBar() {
		return codeBar;
	}
	public void setCodeBar(int codeBar) {
		this.codeBar = codeBar;
	}
    
    
}
