package com.JavaSite.JavaSite.config;

import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

@Configuration
public class TimeZ {

    @PostConstruct
    public void init() {

        TimeZone.setDefault(TimeZone.getTimeZone("GMT+3"));

        System.out.println("Date in GMT+3: " + new Date().toString());
    }
}