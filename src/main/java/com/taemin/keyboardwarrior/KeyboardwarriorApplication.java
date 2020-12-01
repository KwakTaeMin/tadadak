package com.taemin.keyboardwarrior;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
@EnableJpaRepositories(basePackages = "com.taemin.keyboardwarrior.repository")
@EntityScan("com.taemin.keyboardwarrior.model")
public class KeyboardwarriorApplication {

	public static void main(String[] args) {
		SpringApplication.run(KeyboardwarriorApplication.class, args);
	}

}
