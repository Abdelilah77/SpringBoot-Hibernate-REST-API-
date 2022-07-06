package com.ProjectRestAPI.SpringBootPersonneAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ProjectRestAPI.SpringBootPersonneAPI.dao.PersonneDAO;
import com.ProjectRestAPI.SpringBootPersonneAPI.model.Personne;

@Service
public class PersonneServiceImp implements PersonneService {
	
	@Autowired
	PersonneDAO personneDAO ;
    @Transactional
	@Override
	public List<Personne> getListPersonnes() {
		
		return personneDAO.getListPersonnes();
	}
    @Transactional
	@Override
	public Boolean AjouterOuModifierPersonne(Personne P) {
		
		return personneDAO.AjouterOuModifierPersonne(P);
		
	}
   

}
