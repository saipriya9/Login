package in.ashokit.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.bindings.LoginForm;
import in.ashokit.bindings.UserRegForm;
import in.ashokit.entity.UserDtlsEntity;

@Repository
public interface UserMasterRepo  extends JpaRepository<UserDtlsEntity,Integer> {

	UserRegForm findByEmail(String email);


	String saveAll(UserRegForm user);

	String get(LoginForm login);

}
