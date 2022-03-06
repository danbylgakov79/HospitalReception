package com.JavaSite.JavaSite.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.sql.Time;
@Data
@Builder(toBuilder = true)
public class LaboratoryDTO {
    private Integer id;
    private String name;
    private Time timeAppStart;
    private Time timeAppEnd;
}
