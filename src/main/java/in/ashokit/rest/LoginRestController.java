package in.ashokit.rest;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.LoginForm;
import in.ashokit.service.UserMgmtService;

@RestController
public class LoginRestController {
	@Autowired
	private UserMgmtService userMgmtService;
	@GetMapping("/login")
	public ResponseEntity<String> signin( LoginForm login) throws Exception{
		
		String logindtls=userMgmtService.signIn(login);
		return new ResponseEntity<>(logindtls,HttpStatus.ACCEPTED);
	}}
	