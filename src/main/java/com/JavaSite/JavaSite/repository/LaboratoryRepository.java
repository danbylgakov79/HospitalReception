package com.JavaSite.JavaSite.repository;

import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.entity.Laboratory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaboratoryRepository extends JpaRepository<Laboratory, Integer> {

}
