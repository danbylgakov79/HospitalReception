package com.JavaSite.JavaSite.repository;

import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Integer> {
}
