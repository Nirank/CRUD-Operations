package com.example.SQL_Rocks.Service;

import com.example.SQL_Rocks.model.Patient;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PatientService {
    public Patient savePatient( Patient patient);
    public List<Patient> getAllPatient();
}
