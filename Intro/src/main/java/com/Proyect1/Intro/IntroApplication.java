package com.Proyect1.Intro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //anotaciones indican funcionalidad a lo que viene, en este caso una clase, tambien se puede usar en funciones. Esto limita que se va a usar SpringBoot
public class IntroApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntroApplication.class, args);
	}

}
