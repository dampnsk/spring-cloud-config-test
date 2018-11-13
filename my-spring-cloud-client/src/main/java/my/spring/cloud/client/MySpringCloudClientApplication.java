package my.spring.cloud.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@Profile("test")
public class MySpringCloudClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringCloudClientApplication.class, args);
	}
}
