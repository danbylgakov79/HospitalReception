package com.JavaSite.JavaSite.controller;

import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.exeption.ValidationException;
import com.JavaSite.JavaSite.service.AppointmentsService;

import com.JavaSite.JavaSite.service.DoctorService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/doctor")
@AllArgsConstructor
@Repository
@Service
@Log
@RestController
public class DoctorController {

    private final DoctorService doctorService;

    @PostMapping("/save")
    public DoctorDTO saveUsers(@RequestBody DoctorDTO doctorDTO) throws ValidationException {
        log.info("Handling save users: " + doctorDTO);
        return doctorService.saveDoctor(doctorDTO);
    }

    @GetMapping("/findAll")
    public List<DoctorDTO> findAll() {
        log.info("Handling find all users request");
        return doctorService.findAll();
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Integer id) {
        log.info("Handling delete user request: " + id);
        doctorService.deleteDoctor(id);
        return ResponseEntity.ok().build();
    }
}

