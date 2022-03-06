package com.JavaSite.JavaSite.service;


import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.entity.Appointments;
import org.springframework.stereotype.Component;
import lombok.Builder;

import java.util.Optional;

@Component
public class AppointmentsConvert {

    public Appointments fromAppointmentsDtoToAppointments(AppointmentsDTO appointmentsDTO) {
        Appointments appointment = new Appointments();
        appointment.setId(appointmentsDTO.getId());
        appointment.setTimeStart(appointmentsDTO.getTimeStart());
        appointment.setTimeEnd(appointmentsDTO.getTimeEnd());
        appointment.setPatientID(appointmentsDTO.getPatientID());
        appointment.setDoctorID(appointmentsDTO.getDoctorID());
        appointment.setLabID(appointmentsDTO.getLabID());

        return appointment;
    }
    @Builder
    public AppointmentsDTO fromAppointmentsToAppointmentsDto(Appointments appointment) {
        return AppointmentsDTO.builder().
                id(appointment.getId()).
                timeStart(appointment.getTimeStart()).
                timeEnd(appointment.getTimeEnd()).
                patientID(appointment.getPatientID()).
                doctorID(appointment.getDoctorID()).
                labID(appointment.getLabID()).build();

    }

}
