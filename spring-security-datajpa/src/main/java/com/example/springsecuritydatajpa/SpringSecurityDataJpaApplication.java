package com.example.springsecuritydatajpa;

import com.example.springsecuritydatajpa.dao.HelloUserDetailsDAO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = HelloUserDetailsDAO.class)
public class SpringSecurityDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityDataJpaApplication.class, args);
	}

}
