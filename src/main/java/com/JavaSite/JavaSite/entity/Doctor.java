package com.JavaSite.JavaSite.entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Doctor")
@Data//ломбок аннотация: генерирует геттеры, сеттеры, иквалс, хеш код методы
@NoArgsConstructor//ломбок аннотация: конструктор без аргуметов
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private String name;
    @Column
    private Time timeAppStart;
    @Column
    private Time timeAppEnd;
}