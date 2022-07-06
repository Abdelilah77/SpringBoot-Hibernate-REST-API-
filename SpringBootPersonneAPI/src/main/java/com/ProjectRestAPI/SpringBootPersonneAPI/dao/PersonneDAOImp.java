package com.ProjectRestAPI.SpringBootPersonneAPI.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ProjectRestAPI.SpringBootPersonneAPI.model.Personne;

@Repository
public class PersonneDAOImp implements PersonneDAO {

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Personne> getListPersonnes() {
		Session se = entityManager.unwrap(Session.class);
		Query<Personne> query = se.createQuery("from Personne",Personne.class);
		
		return query.getResultList();
	}

	@Override
	public Boolean AjouterOuModifierPersonne(Personne P) {
		Session se = entityManager.unwrap(Session.class);
		if (!checkDuplicatedCin(P)) se.saveOrUpdate(se);	
		return checkDuplicatedCin(P);
	}


	public Boolean checkDuplicatedCin(Personne P) {
		Session se = entityManager.unwrap(Session.class);
		Query query = se.createQuery("select p.cin from Personne p");
		List<String> rows = query.list();
		for (String row: rows) {
		   
		    if(row.equals(P.getCin())) {
		    	return true;
		    }
		   
		}
		return false;
	}
}
