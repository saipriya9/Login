package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.service.UserMgmtService;

@RestController
public class ForgotPwdRestController {
	@Autowired
	private UserMgmtService userMgmtService;
	@GetMapping("/")
	public String forgotPwd(@PathVariable String emailId) {
		return userMgmtService.forgotPwd(emailId);
	}

}
