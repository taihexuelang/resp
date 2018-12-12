package center.wf;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author 王峰
 * @Time：2018年12月6日 上午10:51:33
 * @version 1.0
 */
@RestController
@RequestMapping("/get")
public class userController {
	@Value("${server.port}")
	   String port;
	@Autowired
	RestTemplate restTemplate;
	@RequestMapping("/get")
	@HystrixCommand(fallbackMethod = "hiError")
	public Object get(){
	return	restTemplate.getForObject("http://EURKA-CLIENT1/get/get", String.class);
	}
	public String hiError(){
		return "sorry";
	}

}
