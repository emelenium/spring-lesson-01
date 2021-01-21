package ru.education.lessons;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.education.lessons.domain.Person;
import ru.education.lessons.service.PersonService;

//@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
		//		SpringApplication.run(Main.class, args);
		Person ivan = context.getBean(Person.class);
	//	Person ivan = service.getByName("Ivan");

//		Person ivan = new Person("Ivan",27);
		System.out.println("name: "+ ivan.getName()+ " age "+ ivan.getAge());
	}

}
