package com.assn3;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.assn3.entities.SurveyDetails;
import com.assn3.repos.SurveyDetailsRepository;

@SpringBootTest
class ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private SurveyDetailsRepository sdr;

	@Test void saveSurvey() { SurveyDetails sd=new SurveyDetails();
	  sd.setAddress("add"); sd.setCampus("cmp"); sd.setCity("city");
	  sd.setDate("date"); sd.setEmail("email"); sd.setfName("fnam");
	  sd.setLikelihood("lkhood"); sd.setlName("lname"); sd.setPhone("phne");
	  sd.setReason("reson"); sd.setState("stte"); sd.setZip("zp"); sdr.save(sd);
	  
	  assertNotNull(sd); //SurveyDetails sd = sdr.findAll();
	  }
	 

}
