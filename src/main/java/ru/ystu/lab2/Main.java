package ru.ystu.lab2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import ru.ystu.lab2.service.QueueServiceImpl;

@SpringBootApplication
@ImportResource("classpath:beans.xml")
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Main.class, args);
		QueueServiceImpl service = context.getBean(QueueServiceImpl.class);
		service.run();
	}

}
