package in.ashokit.service;

import java.io.IOException;
import java.util.Map;

import in.ashokit.bindings.LoginForm;
import in.ashokit.bindings.UnlockAccForm;
import in.ashokit.bindings.UserRegForm;

public interface UserMgmtService {
	
	
	public Map<Integer, String> getCountries();
	
	public Map<Integer, String> getCities(int countryId);
	
	public Map<Integer, String> getStates(int stateId);
	
	public String signUp(UserRegForm userRegForm);

	public String signIn(LoginForm login) throws IOException;
	
	
	
	public String unlockAcc(UnlockAccForm unlockAccForm);
	
	public String forgotPwd(String email);
	
}

//public String emailCheck(String email);

