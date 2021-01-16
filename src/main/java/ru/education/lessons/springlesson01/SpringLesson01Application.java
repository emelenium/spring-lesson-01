package ru.education.lessons.springlesson01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringLesson01Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringLesson01Application.class, args);
		System.out.println("Hi Spring!");
	}

}
