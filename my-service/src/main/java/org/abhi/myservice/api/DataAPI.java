package org.abhi.myservice.api;

import org.abhi.myservice.service.LoginService;
import org.abhi.myservice.vo.DataResponse;
import org.abhi.myservice.vo.DataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController()
@RequestMapping("/data-service")
public class DataAPI {
	
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/data")
	public DataResponse login(@RequestParam("token") String token, @RequestParam("user") String user ) {
		if(!loginService.validate(token, user)) {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "token error...");
		}
		DataResponse dataResponse = new DataResponse();
		dataResponse.getData().add(new DataVO("1", "Test payload"));
		dataResponse.getData().add(new DataVO("2", "Test payload 2"));
		return dataResponse;
	}
}
