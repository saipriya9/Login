package in.ashokit.service;

import java.util.Map;

import in.ashokit.bindings.LoginForm;
import in.ashokit.bindings.UnlockAccForm;
import in.ashokit.bindings.UserRegForm;

public interface UserMgmtService {
	public String emailCheck(String emaiId);
	
	public String loginCheck(LoginForm loginform);
	
	public Map<Integer, String> getCountries();
	
	public Map<Integer, String> getCities();
	
	public Map<Integer, String> getStates();
	
	public String saveUser(UserRegForm userRegForm);
	
	public String unlockAcc(UnlockAccForm unlockAccForm);
	
	public String forgotPwd(String emailId);
	
}
