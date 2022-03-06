package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.exeption.ValidationException;

import java.util.List;

public interface DoctorService {
    DoctorDTO saveDoctor(DoctorDTO doctorDTO);
    List<DoctorDTO> findAll();
    void deleteDoctor(Integer id);
}
