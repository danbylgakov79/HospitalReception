package com.JavaSite.JavaSite.controller;

import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.dto.LaboratoryDTO;
import com.JavaSite.JavaSite.entity.Laboratory;
import com.JavaSite.JavaSite.exeption.ValidationException;
import com.JavaSite.JavaSite.service.DoctorService;
import com.JavaSite.JavaSite.service.LaboratoryService;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/laboratory")
@AllArgsConstructor
@Repository
@Service
@Log
@RestController
public class LaboratoryController {
    private final LaboratoryService laboratoryService;

    @PostMapping("/save")
    public LaboratoryDTO saveUsers(@RequestBody LaboratoryDTO laboratoryDTO) throws ValidationException {
        log.info("Handling save laboratory: " + laboratoryDTO);
        return laboratoryService.saveLaboratory(laboratoryDTO);
    }

    @GetMapping("/findAll")
    public List<LaboratoryDTO> findAll() {
        log.info("Handling find all users request");
        return laboratoryService.findAll();
    }



    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteDoctor(@PathVariable Integer id) {
        log.info("Handling delete laboratory request: " + id);
        laboratoryService.deleteLaboratory(id);
        return ResponseEntity.ok().build();
    }
}
