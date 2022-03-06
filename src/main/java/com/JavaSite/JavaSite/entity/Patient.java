package com.JavaSite.JavaSite.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "Patient")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private LocalDateTime dataAppointment;
}
