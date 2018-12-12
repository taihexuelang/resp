package center;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ����
 * @Time��2018��12��6�� ����10:16:42
 * @version 1.0
 */
@SpringBootApplication
@RestController
@EnableEurekaClient
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Value("${server.port}")
	String foo;
	@RequestMapping(value = "/hi")
	public String hi(){
		return foo;
	}
}