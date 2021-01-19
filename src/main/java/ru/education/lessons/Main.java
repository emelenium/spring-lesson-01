package ru.education.lessons;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.education.lessons.domain.Person;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		Person ivan = new Person("Ivan",27);
		System.out.println("name: "+ ivan.getName()+ " age "+ ivan.getAge());
	}

}
