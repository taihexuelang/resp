package center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author ����
 * @Time��2018��12��6�� ����10:16:42
 * @version 1.0
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		
	}
	
}
