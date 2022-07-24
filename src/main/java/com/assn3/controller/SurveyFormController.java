//Author:- Vamsi Krishna Peddi

//This code is for object oriented representation of a sql table in Java. Also acts as a java bean

package com.assn3.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assn3.entities.SurveyDetails;
import com.assn3.repos.SurveyDetailsRepository;



@CrossOrigin
@RestController
public class SurveyFormController {

	@Autowired
	private SurveyDetailsRepository<SurveyDetails> sdr;

	@PostMapping("/survey_form_submission")
	public ResponseEntity<String> take_survey_details(@ModelAttribute SurveyDetails sdls) {

		if (sdls.getfName() == null || sdls.getlName() == null || sdls.getAddress() == null || sdls.getCity() == null
				|| sdls.getState() == null || sdls.getZip() == null || sdls.getPhone() == null
				|| sdls.getEmail() == null || sdls.getDate() == null || sdls.getCampus() == null
				|| sdls.getReason() == null) {

			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Fields enetered in the Form has Null values or incorrect values sent");
		} else {
			try {
				sdr.save(sdls);

				return ResponseEntity.status(HttpStatus.CREATED).body("Successfully saved the submitted survey form details");

			} catch (Exception ex) {
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception occurred while saving survey details!! Retry!");
			}
		}
	}

	

	@GetMapping("/fullsurveylist")
	public  ResponseEntity<List> survey_details() {

		return ResponseEntity.ok().body(sdr.findAll());

	}

}
