package com.klef.soa.service;

import java.util.List;

import com.klef.soa.entity.Patient;

public interface PatientService {
	
 Patient addPatient(Patient patient);
 List<Patient> displayAllPatient();
 Patient updatePatient(Patient p);
 Patient displayPatientById(Long id);
 String deletepatientById(Long id);
List<Patient> displayPatientsByGender(String gender);
Long displayPatientCount();

}
