package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.bindings.UnlockAccForm;
import in.ashokit.service.UserMgmtService;
@RestController
public class UnlockAccRestController {
	@Autowired
	private UserMgmtService userMgmtService;
	
	public String unlockAcc(UnlockAccForm unlockAccForm) {
		return "";
	}

}
