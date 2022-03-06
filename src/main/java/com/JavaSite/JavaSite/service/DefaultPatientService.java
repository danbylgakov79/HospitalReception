package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.dto.PatientDTO;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.entity.Patient;

import com.JavaSite.JavaSite.repository.DoctorRepository;
import com.JavaSite.JavaSite.repository.PatientRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Repository
@AllArgsConstructor
public class DefaultPatientService  implements PatientService{
    private final PatientRepository patientRepository;
    private final PatientConvert patientConvert;
    @Override
    public List<PatientDTO> findAll() {
        return patientRepository.findAll()
                .stream()
                .map(patientConvert::fromPatientToPatientDto)
                .collect(Collectors.toList());
    }
    @Override
    public PatientDTO savePatient(PatientDTO patientDTO)  {
        Patient savedUser = patientRepository.save(patientConvert.fromPatientDtoToPatient(patientDTO));
        return patientConvert.fromPatientToPatientDto(savedUser);
    }
    @Override
    public void deletePatient(Integer id){
        patientRepository.deleteById(id);
    }
}
