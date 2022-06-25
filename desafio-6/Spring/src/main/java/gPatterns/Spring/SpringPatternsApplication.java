package gPatterns.Spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class SpringPatternsApplication {

	public static void main(String[] args) {

		SpringApplication.run( SpringPatternsApplication.class, args);

	}

}
