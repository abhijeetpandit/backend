package org.abhi.myservice.api;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.abhi.myservice.service.LoginService;
import org.abhi.myservice.vo.LoginVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController()
@RequestMapping("/auth-service")
public class LoginAPI {
	
	@Autowired
	private LoginService loginService;
	
	@PostMapping("/login")
	public String login(@RequestBody LoginVO loginVO) {
		if(loginVO.getUserName().equals("apple") && loginVO.getPassword().equals("orange")) {
			return loginService.performLogin(loginVO); 
		} else {
			throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Wrong credentials. 1 attempt remaining...");
		}
	}

	
}
