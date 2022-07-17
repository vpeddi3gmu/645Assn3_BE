
#Vamsi Krishna Peddi

#This file contains queries related to sql which should be executed before stating this project 
#so that required table will get created

drop table SurveyDetails;

create table SurveyDetails(id			 INT  NOT NULL AUTO_INCREMENT,
fName        varchar(20) NOT NULL,  
lName        varchar(20) NOT NULL,  
address      varchar(20) NOT NULL,  
city         varchar(20) NOT NULL,  
state        varchar(20) NOT NULL,  
zip          varchar(20)NOT NULL,  
phone        varchar(20)NOT NULL,  
email        varchar(20)NOT NULL,  
date         varchar(20)NOT NULL,  
campus       varchar(20)NOT NULL,  
reason       varchar(20)NOT NULL,  
likelihood   varchar(20), primary key(id) ) ;

select * from SurveyDetails;
