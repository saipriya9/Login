package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.ashokit.entity.CityMasterEntity;
@Repository
public interface CityRepo extends JpaRepository<CityMasterEntity, Integer> {

}
