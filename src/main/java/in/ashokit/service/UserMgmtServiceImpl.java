package in.ashokit.service;


import java.util.HashMap;
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
	
	@Autowired
	private CountryMasterRepo countryRepo;
	@Autowired
	private StateMasterRepo stateRepo;
	@Autowired
	private UserMasterRepo userRepo;
	@Override
	public Map<Integer, String> getCountries() {
		Map<Integer, String> countryMap = new HashMap<>();
		return (Map<Integer, String>) countryRepo.findAll();
		} 
	
	@Override
	public Map<Integer, String> getStates(int  countryId) {
		Map<Integer, String> stateMap=new HashMap<>();// TODO Auto-generated method stub
		return (Map<Integer, String>)stateRepo.getById(countryId);
	}
	@Override
	public Map<Integer, String> getCities(int stateId) {
		Map<Integer, String> cityMap=new HashMap<>();
		return (Map<Integer, String>) cityRepo.getById(stateId);
	}
	
	@Override
	public String signUp(UserRegForm userRegForm) {
		 UserRegForm user = new UserRegForm();
		 
         user.setFirstName(userRegForm.getFirstName());
         user.setLastName(userRegForm.getLastName());
         user.setGender(userRegForm.getGender());
         user.setUserMobile(userRegForm.getUserMobile());
         user.setUserEmail(userRegForm.getUserEmail());
         user.setUserPwd(userRegForm.getUserPwd());
         user.setCountryId(userRegForm.getCountryId());
         user.setCityId(userRegForm.getCityId());
         user.setStateId(userRegForm.getStateId());
         
		 return userRepo.saveAll(user);
	}
	@Override
	public String signIn(LoginForm login) {
		try {
			UserRegForm dbUser = userRepo.findByEmail(login.getEmail());
            String password = dbUser.getUserPwd();
            if (dbUser != null && dbUser.getUserEmail().equals(login.getEmail()) &&
                    password.equals((login.getPwd()))) {
            	return  userRepo.get(login);
            }
            else {
            	  throw new Exception("Invalid Customer Id");
            }	
		}
            catch (Exception e) {
		     System.out.println(e);
			}
		return null;
                
            }
	
	
	@Override
	public String unlockAcc(UnlockAccForm unlockAccForm) {
		
		return null;
	}
	@Override
	public String forgotPwd(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	}

	/*
	 * @Override public String emailCheck(String email) { return
	 * userRepo.findByEmail(email); }
	 */
	

	
