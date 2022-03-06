package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.PatientDTO;

import java.util.List;

public interface PatientService {
    PatientDTO savePatient(PatientDTO patientDTO);
    List<PatientDTO> findAll();
    void deletePatient(Integer id);
}
