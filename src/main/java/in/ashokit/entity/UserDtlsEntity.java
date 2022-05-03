package in.ashokit.entity;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class UserDtlsEntity {
	@Id
	@GeneratedValue
	@Column(name="USER_ID")
	private Integer id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="USER_EMAIL")
	private String email;
	
	@Column(name="USER_PWD")
	private String pwd;
	
	@Column(name="USER_MOBILE")
	private String mobile;
	
	@Column(name="DOB")
	private String dob;
	
	@Column(name="GENDER")
	private String gender;
	
	@Column(name="CITY_ID")
	private String cityId;
	
	@Column(name="STATE_ID")
	private String stateId;
	@Column(name="COUNTRY_ID")
	private String countryId;
	@Column(name="ACC_STATUS")
	private String accStatus;
	@Column(name="CREATED_DATE")
	@CreationTimestamp
	private LocalDate   createdDate;
	@Column(name="UPDATED_DATE")
	@CreationTimestamp
	private LocalDate  updatedDate;
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
