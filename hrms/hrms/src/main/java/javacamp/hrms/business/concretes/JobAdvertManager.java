package javacamp.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javacamp.hrms.business.abstracts.JobAdvertService;
import javacamp.hrms.dataAccess.abstracts.JobAdvertRepository;
import javacamp.hrms.entities.concretes.JobAdvert;

@Service
public class JobAdvertManager implements JobAdvertService {

	private JobAdvertRepository jobAdvertRepository;
	
	
	@Autowired
	public JobAdvertManager(JobAdvertRepository jobAdvertRepository) {
		super();
		this.jobAdvertRepository = jobAdvertRepository;
	}



	@Override
	public List<JobAdvert> getAll() {
		
		return this.jobAdvertRepository.findAll();
	}


	
}
