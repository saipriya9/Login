package in.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.UserRegForm;
import in.ashokit.service.UserMgmtService;
@RestController
public class RegistrationRestController {
	@Autowired
	private UserMgmtService userMgmtService;
	
	
	@PostMapping("/user ")
	public ResponseEntity<String> signUp(@RequestBody UserRegForm userRegForm) {
		String userString=userMgmtService.signUp(userRegForm);
		return new ResponseEntity<>(userString,HttpStatus.CREATED);
	}
}
