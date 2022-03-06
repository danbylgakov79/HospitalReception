package com.JavaSite.JavaSite.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.print.Doc;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Optional;
import java.util.Set;


@Entity
@Table(name = "appointments")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class Appointments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private LocalDateTime timeStart;

    @Column
    private LocalDateTime timeEnd;

    @Column
    private Integer patientID;
    @Column
    private Integer doctorID;
    @Column
    private Integer labID;

}

