package com.klef.soa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.klef.soa.entity.Patient;
import com.klef.soa.service.PatientService;


@RestController
public class PatientController {
	@Autowired
	private PatientService service;

	@GetMapping("/")
	public String test() {
		return "SOA Programmming  && MicroServices";
	}
	
	@GetMapping("/displayall")
	public ResponseEntity <List<Patient>> displayallpatients() {
		
		List<Patient>patients=service.displayAllPatient();
				return ResponseEntity.status(200).body(patients);
	}
	
	
	@PostMapping("/add")
	public ResponseEntity <Patient>addPatient( @RequestBody Patient  p) {
		Patient patient=service.addPatient(p);
		return ResponseEntity.status(201).body(patient);
	}
	

}
