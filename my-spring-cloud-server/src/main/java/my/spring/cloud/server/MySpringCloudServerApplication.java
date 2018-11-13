package my.spring.cloud.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MySpringCloudServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringCloudServerApplication.class, args);
	}
}
