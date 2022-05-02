package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
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
	@PostMapping("/login")
	public String loginCheck(@RequestBody LoginForm loginform) {
		return userMgmtService.loginCheck(loginform);
		
	}
	@PostMapping("/email")
	public String emailCheck(@RequestBody String emaiId) {
		return  userMgmtService.emailCheck(emaiId);
		
	}


}
