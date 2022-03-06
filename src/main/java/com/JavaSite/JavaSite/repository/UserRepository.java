package com.JavaSite.JavaSite.repository;

import com.JavaSite.JavaSite.entity.Appointments;
import com.JavaSite.JavaSite.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

     List<Appointments> findAllByPatientID(Integer patientID);
}
