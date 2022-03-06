package com.JavaSite.JavaSite.service;

import com.JavaSite.JavaSite.dto.DoctorDTO;
import com.JavaSite.JavaSite.dto.LaboratoryDTO;
import com.JavaSite.JavaSite.entity.Laboratory;

import java.util.List;

public interface LaboratoryService {
    LaboratoryDTO saveLaboratory(LaboratoryDTO laboratoryDTO);
    List<LaboratoryDTO> findAll();
    void deleteLaboratory(Integer id);
}
