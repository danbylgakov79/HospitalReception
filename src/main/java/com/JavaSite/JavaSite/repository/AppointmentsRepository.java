package com.JavaSite.JavaSite.repository;

import com.JavaSite.JavaSite.entity.Appointments;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppointmentsRepository extends JpaRepository<Appointments, Integer> {

     List<Appointments> findAllByDoctorID(Integer doctorID);
     List<Appointments> findAllByPatientID(Integer patientID);

}
