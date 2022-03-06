package com.JavaSite.JavaSite.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
public class PatientDTO {
    private Integer id;
    private String name;
    private LocalDateTime dataAppointment;
}
