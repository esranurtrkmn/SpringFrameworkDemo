package javacamp.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="job_adverts")

public class JobAdvert {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="advert_title")
	private String advertTitle;
	
	

}


