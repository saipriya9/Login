package in.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Id;

public class CityMasterEntity {
	@Id
	@Column(name="	CITY_ID")
	private Integer cityId;
	@Column(name="CITY_NAME")
	private String cityName;
	
	@Column(name="STATE_ID")
	private Integer stateId;

	
}
