package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.exeption.ValidationException;


import java.util.List;


public interface AppointmentsService {
    AppointmentsDTO saveAppointments(AppointmentsDTO appointmentsDTO) throws ValidationException;
    void deleteAppointment(Integer id);
    List<AppointmentsDTO> findAllByDoctorID(Integer doctorID);
    List<AppointmentsDTO> findAll();
   List<AppointmentsDTO> findAllByPatientID(Integer patientID);
}
