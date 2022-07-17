//Author:- Vamsi Krishna Peddi

//This is JPA code to run queries on database

package com.assn3.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.assn3.entities.SurveyDetails;
@Repository
public interface SurveyDetailsRepository<id> extends JpaRepository<SurveyDetails,id> {


}
