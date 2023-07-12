package com.example.SQL_Rocks.controller;

import com.example.SQL_Rocks.Service.PatientService;
import com.example.SQL_Rocks.model.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/add")
    public  String add(@RequestBody Patient patient){
        patientService.savePatient(patient);
        return "Patient Added Successfully.";
    }
    @GetMapping("/getAll")
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();
    }



}
