package center.wf;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "EURKA-CLIENT11")
public interface fes {
	@RequestMapping(value = "/get/get",method = RequestMethod.GET)
	public String get();
}
