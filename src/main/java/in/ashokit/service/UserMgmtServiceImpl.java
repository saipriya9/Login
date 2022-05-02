package in.ashokit.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ashokit.bindings.LoginForm;
import in.ashokit.bindings.UnlockAccForm;
import in.ashokit.bindings.UserRegForm;
import in.ashokit.repository.CityRepo;
import in.ashokit.repository.CountryMasterRepo;
import in.ashokit.repository.StateMasterRepo;
import in.ashokit.repository.UserMasterRepo;
@Service
public class UserMgmtServiceImpl implements UserMgmtService{
	@Autowired
	private CityRepo cityRepo;
	
	/*
	 * public UserMgmtServiceImpl(CityRepo cityRepo) { super(); this.cityRepo =
	 * cityRepo; }
	 */

		//this.cityRepo= cityRepo;
	@Autowired
	private CountryMasterRepo countryRepo;
	@Autowired
	private StateMasterRepo stateRepo;
	@Autowired
	private UserMasterRepo userRepo;
	

	@Override
	public String emailCheck(String emaiId) {
		// TODO Auto-generated method stub
			return userRepo.findByEmail(emaiId);
	}

	@Override
	public String loginCheck(LoginForm loginform) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCountries() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getCities() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<Integer, String> getStates() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveUser(UserRegForm userRegForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String unlockAcc(UnlockAccForm unlockAccForm) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String forgotPwd(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

}
