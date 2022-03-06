package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.dto.LaboratoryDTO;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.entity.Laboratory;
import lombok.Builder;
import org.springframework.stereotype.Component;

@Component
public class LaboratoryConvert {
    public Laboratory fromLaboratoryDtoToLaboratory(LaboratoryDTO laboratoryDTO) {
        Laboratory laboratory = new Laboratory();
        laboratory.setId(laboratoryDTO.getId());
        laboratory.setName(laboratoryDTO.getName());
        laboratory.setTimeAppStart(laboratoryDTO.getTimeAppStart());
        laboratory.setTimeAppEnd(laboratoryDTO.getTimeAppEnd());

        return laboratory;
    }
    @Builder
    public LaboratoryDTO fromLaboratoryToLaboratoryDto(Laboratory laboratory) {
        return LaboratoryDTO.builder().
                id(laboratory.getId()).
                name(laboratory.getName()).
                timeAppStart(laboratory.getTimeAppStart()).
                timeAppEnd(laboratory.getTimeAppEnd()).build();
    }
}
