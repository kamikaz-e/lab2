package ru.ystu.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.ystu.lab2.form.MainFormImpl;
import ru.ystu.lab2.service.QueueServiceImpl;

@SpringBootApplication
@RestController

public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
		ApplicationContext context = new ClassPathXmlApplicationContext("main.xml");
		QueueServiceImpl service = context.getBean(QueueServiceImpl.class);
		new MainFormImpl(service).startQuiz();
	}

	@GetMapping("/test")
	public String hello(@RequestParam(value = "name", defaultValue = "test") String name) {
		return String.format("%s", name);
	}
}
