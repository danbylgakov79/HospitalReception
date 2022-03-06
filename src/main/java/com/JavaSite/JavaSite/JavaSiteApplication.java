package com.JavaSite.JavaSite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication

public class JavaSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaSiteApplication.class, args);
	}

}

