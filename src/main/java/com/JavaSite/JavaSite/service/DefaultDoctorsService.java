package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.entity.Appointments;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.exeption.ValidationException;
import com.JavaSite.JavaSite.repository.AppointmentsRepository;
import com.JavaSite.JavaSite.repository.DoctorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Repository
@AllArgsConstructor
public class DefaultDoctorsService implements DoctorService{
    private final DoctorRepository doctorRepository;
    private final DoctorConvert doctorConvert;
    @Override
    public List<DoctorDTO> findAll() {
        return doctorRepository.findAll()
                .stream()
                .map(doctorConvert::fromDoctorToDoctorDto)
                .collect(Collectors.toList());
    }
    @Override
    public DoctorDTO saveDoctor(DoctorDTO doctorDTO)  {
        Doctor savedUser = doctorRepository.save(doctorConvert.fromDoctorDtoToDoctor(doctorDTO));
        return doctorConvert.fromDoctorToDoctorDto(savedUser);
    }
    @Override
    public void deleteDoctor(Integer id){
        doctorRepository.deleteById(id);
    }
}
