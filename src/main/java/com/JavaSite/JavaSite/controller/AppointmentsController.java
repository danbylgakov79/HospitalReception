package com.JavaSite.JavaSite.controller;

import com.JavaSite.JavaSite.dto.AppointmentsDTO;
import com.JavaSite.JavaSite.exeption.ValidationException;
import com.JavaSite.JavaSite.service.AppointmentsService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/appointments")
@AllArgsConstructor
@Repository
@Service
@Log
public class AppointmentsController {

    private final AppointmentsService appointmentsService;


    @PostMapping("/save")
    public AppointmentsDTO saveUsers(@RequestBody AppointmentsDTO appointmentsDTO) throws ValidationException {
        log.info("Handling save users: " + appointmentsDTO);
        return appointmentsService.saveAppointments(appointmentsDTO);
    }

    @GetMapping("/findAll")
    public List<AppointmentsDTO> findAllAppointments() {
        log.info("Handling find all users request");
        return appointmentsService.findAll();
    }


    @GetMapping("/findAllByDoctorID")
    public List<AppointmentsDTO> findAllByDoctorID(@RequestParam Integer doctorID) {
        log.info("Handling find by login request: " + doctorID);
        return appointmentsService.findAllByDoctorID(doctorID);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteAppointment(@PathVariable Integer id) {
        log.info("Handling delete user request: " + id);
        appointmentsService.deleteAppointment(id);
        return ResponseEntity.ok().build();
    }

}

