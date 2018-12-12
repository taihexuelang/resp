package center.wf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
	@RequestMapping("/get")
	public Object get(){
		return port;
	}

}
