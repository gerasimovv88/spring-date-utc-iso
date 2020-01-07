package ru.vladigeras.springdateutciso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class SpringDateUtcIsoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDateUtcIsoApplication.class, args);
	}

	@PostConstruct
	public void setGlobalUtcDate() {
		TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
	}
}
