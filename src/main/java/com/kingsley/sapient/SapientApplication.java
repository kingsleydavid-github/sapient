package com.kingsley.sapient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.kingsley.sapient.*")
@EntityScan("com.kingsley.sapient.*")
@EnableJpaRepositories("com.kingsley.sapient.*")
public class SapientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SapientApplication.class, args);
	}

}
