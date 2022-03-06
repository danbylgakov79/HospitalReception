package com.JavaSite.JavaSite.dto;

import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.sql.Time;
import java.sql.Timestamp;

@Data
@Builder(toBuilder = true)
public class DoctorDTO {
    private Integer id;
    private String name;
    private Time timeAppStart;
    private Time timeAppEnd;
}