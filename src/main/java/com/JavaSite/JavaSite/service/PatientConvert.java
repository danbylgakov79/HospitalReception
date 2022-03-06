package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.dto.PatientDTO;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.entity.Patient;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
public class PatientConvert {
    public Patient fromPatientDtoToPatient(PatientDTO patientDTO) {
        Patient patient = new Patient();
        patient.setId(patientDTO.getId());
        patient.setName(patientDTO.getName());
        patient.setDataAppointment(patientDTO.getDataAppointment());
        return patient;
    }
    @Builder
    public PatientDTO fromPatientToPatientDto(Patient patient) {
        return PatientDTO.builder().
                id(patient.getId()).
                name(patient.getName()).
                dataAppointment(patient.getDataAppointment()).build();
    }
}

