package com.JavaSite.JavaSite.dto;
import com.JavaSite.JavaSite.entity.Doctor;
import com.JavaSite.JavaSite.entity.Patient;
import jdk.jshell.Snippet;
import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;

@Data
@Builder(toBuilder = true)
public class AppointmentsDTO {
    private Integer id;
    private LocalDateTime timeStart;
    private LocalDateTime timeEnd;
    private Integer patientID;
    private Integer doctorID;
    private Integer labID;

}

