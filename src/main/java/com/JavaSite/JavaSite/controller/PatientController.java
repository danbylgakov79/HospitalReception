package com.JavaSite.JavaSite.controller;


import com.JavaSite.JavaSite.dto.PatientDTO;
import com.JavaSite.JavaSite.exeption.ValidationException;

import com.JavaSite.JavaSite.service.PatientService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/patient")
@AllArgsConstructor
@Repository
@Service
@Log
@RestController
public class PatientController {
    private final PatientService patientService;

    @PostMapping("/save")
    public PatientDTO saveUsers(@RequestBody PatientDTO patientDTO) throws ValidationException {
        log.info("Handling save users: " + patientDTO);
        return patientService.savePatient(patientDTO);
    }

    @GetMapping("/findAll")
    public List<PatientDTO> findAll() {
        log.info("Handling find all users request");
        return patientService.findAll();
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Integer id) {
        log.info("Handling delete user request: " + id);
        patientService.deletePatient(id);
        return ResponseEntity.ok().build();
    }
}
