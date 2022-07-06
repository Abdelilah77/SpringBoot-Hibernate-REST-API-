package com.ProjectRestAPI.SpringBootPersonneAPI.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ProjectRestAPI.SpringBootPersonneAPI.model.Personne;
import com.ProjectRestAPI.SpringBootPersonneAPI.service.PersonneService;



@RestController
@RequestMapping("/api")
public class PersonneController {

	@Autowired
	private PersonneService personneService;
	
	@GetMapping("/Personne")
	public List<Personne> listerPersonnes(){
		return personneService.getListPersonnes();
	}
	@PostMapping("/Personne")
	public ResponseEntity<Personne> createPersonne(@RequestBody Personne personne ) {
		if (!personneService.AjouterOuModifierPersonne(personne))
			return new ResponseEntity<Personne>(personne,HttpStatus.OK);	
		return new ResponseEntity<Personne>(personne,HttpStatus.BAD_REQUEST) ;
	}
	@PutMapping("/Personne")
	public ResponseEntity<Personne> modifierPersonne(@RequestBody Personne personne ) {
		if (!personneService.AjouterOuModifierPersonne(personne))
			return new ResponseEntity<Personne>(personne,HttpStatus.OK);	
		return new ResponseEntity<Personne>(personne,HttpStatus.BAD_REQUEST) ;
	}
}
