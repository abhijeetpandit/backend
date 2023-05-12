package org.abhi.myservice.service;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.abhi.myservice.vo.LoginVO;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	private Map<String, String> tokens = new HashMap<>();
	
	public String performLogin(LoginVO loginVO) {
		String token = UUID.randomUUID().toString();
		tokens.put(loginVO.getUserName(), token);
		return token;
	}
	
	public boolean validate(String token, String user) {
		String val = tokens.get(user);
		if(val != null && token.equals(val)) {
			return true;
		}
		return false;
	}
}
