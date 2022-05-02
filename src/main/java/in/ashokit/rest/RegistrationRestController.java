package in.ashokit.rest;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
	@GetMapping("/country")
	public Map<Integer, String> getCountries(){
		return userMgmtService.getCountries();
	}
	@GetMapping("/city")

	public Map<Integer, String> getCities(){
		return userMgmtService.getCities();
	}
	@GetMapping("/state")

	public Map<Integer, String> getStates(){
		return userMgmtService.getStates();
	}
	@PostMapping("/user ")
	public String saveUser(@RequestBody UserRegForm userRegForm) {
		return userMgmtService.saveUser(userRegForm);
	}
}
