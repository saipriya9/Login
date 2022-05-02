package in.ashokit.repository;

 import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.UserDtlsEntity;

@Repository
public interface UserMasterRepo  extends JpaRepository<UserDtlsEntity,Integer> {

}
