//Author:- Vamsi Krishna Peddi

//This is initialization code for spring boot application and its apis listed in controller

package com.assn3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.assn3.repos")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
