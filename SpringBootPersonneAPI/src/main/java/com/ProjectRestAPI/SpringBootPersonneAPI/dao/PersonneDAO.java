package com.ProjectRestAPI.SpringBootPersonneAPI.dao;

import java.util.List;

import com.ProjectRestAPI.SpringBootPersonneAPI.model.Personne;

public interface PersonneDAO {

	List<Personne> getListPersonnes();
	Boolean AjouterOuModifierPersonne(Personne P);
	
	
}
