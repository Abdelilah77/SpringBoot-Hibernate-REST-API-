package com.ProjectRestAPI.SpringBootPersonneAPI.service;

import java.util.List;

import com.ProjectRestAPI.SpringBootPersonneAPI.model.Personne;

public interface PersonneService {
	List<Personne> getListPersonnes();
	Boolean AjouterOuModifierPersonne(Personne P);

}
