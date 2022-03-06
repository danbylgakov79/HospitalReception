package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.dto.LaboratoryDTO;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.entity.Laboratory;
import com.JavaSite.JavaSite.repository.DoctorRepository;
import com.JavaSite.JavaSite.repository.LaboratoryRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@Repository
@AllArgsConstructor
public class DefaultLaboratoryService implements LaboratoryService {
    private final LaboratoryRepository laboratoryRepository;
    private final LaboratoryConvert laboratoryConvert;
    @Override
    public List<LaboratoryDTO> findAll() {
        return laboratoryRepository.findAll()
                .stream()
                .map(laboratoryConvert::fromLaboratoryToLaboratoryDto)
                .collect(Collectors.toList());
    }
    @Override
    public LaboratoryDTO saveLaboratory(LaboratoryDTO laboratoryDTO)  {
        Laboratory savedUser = laboratoryRepository.save(laboratoryConvert.fromLaboratoryDtoToLaboratory(laboratoryDTO));
        return laboratoryConvert.fromLaboratoryToLaboratoryDto(savedUser);
    }
    @Override
    public void deleteLaboratory(Integer id){
        laboratoryRepository.deleteById(id);
    }
}

