package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.entity.Appointments;
import com.JavaSite.JavaSite.entity.Doctor;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
public class DoctorConvert {

    public Doctor fromDoctorDtoToDoctor(DoctorDTO doctorDTO) {
        Doctor doctor = new Doctor();
        doctor.setId(doctorDTO.getId());
        doctor.setName(doctorDTO.getName());
        doctor.setTimeAppStart(doctorDTO.getTimeAppStart());
        doctor.setTimeAppEnd(doctorDTO.getTimeAppEnd());

        return doctor;
    }
    @Builder
    public DoctorDTO fromDoctorToDoctorDto(Doctor doctor) {
        return DoctorDTO.builder().
                id(doctor.getId()).
                name(doctor.getName()).
                timeAppStart(doctor.getTimeAppStart()).
                timeAppEnd(doctor.getTimeAppEnd()).build();
    }
}
