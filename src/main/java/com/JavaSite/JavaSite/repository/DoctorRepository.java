package com.JavaSite.JavaSite.repository;

import com.JavaSite.JavaSite.entity.Appointments;
import com.JavaSite.JavaSite.entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

}
