# 645Assn3_BE #Vamsi Krishna Peddi

# SWE-645_Assignement-3 
 


This repo contains code related to spring boot for backend support of assignment 3. 

#SpringBoot and JPA

This code in src folder have two apis in SurveyFormController.java 

1. survey_form_submission :- This API will get called user submits survey form. It will parse the payload using Model attribute and save the suvey details to Mysql database using spring boot JPA.

2. fullsurveylist :- This API will fetch the survey details when it gets called from mysql database of SurveyDetails details table. 



#Database Mysql

Mysql_queries.sql :- This file contains query related to creating survey table and its fields which should be executed on Mysql client. In my case i have used eclipse as mysql client for running sql queries. This file is present under src folder
