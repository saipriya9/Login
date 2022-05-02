package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.CountryMasterEntity;
@Repository
public interface CountryMasterRepo extends JpaRepository<CountryMasterEntity, Integer> {

}
