package com.cognizant.mfpe.pensionManagementSystem.webportal.restClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import com.cognizant.mfpe.pensionManagementSystem.webportal.model.AuthResponse;
import com.cognizant.mfpe.pensionManagementSystem.webportal.model.UserData;

@FeignClient(name = "authorization-service", url = "http://authorization-environ.eba-gxumxq57.ap-south-1.elasticbeanstalk.com")
public interface AuthClient {

	@PostMapping("/login")
	public UserData login(@RequestBody UserData userlogincredentials);

	@GetMapping("/validate")
	public AuthResponse getValidity(@RequestHeader("Authorization") String token);

}
