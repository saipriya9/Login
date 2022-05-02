package in.ashokit.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.UserDtlsEntity;

@Repository
public interface UserMasterRepo  extends JpaRepository<UserDtlsEntity,Integer> {
 
 
 // this syntax error in the jpa query is intentional please fix this
 ("select * from UserDtlsEntity where emailId= #{}")
 String findByEmail(String emaiId);

}
