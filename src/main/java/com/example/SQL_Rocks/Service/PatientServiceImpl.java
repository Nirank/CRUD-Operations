package com.example.SQL_Rocks.Service;

import com.example.SQL_Rocks.model.Patient;
import com.example.SQL_Rocks.repository.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements  PatientService{

    @Autowired
    private PatientRepo patientRepo;
    @Override
    public Patient savePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    @Override
    public List<Patient> getAllPatient() {

        return patientRepo.findAll();
    }
}
