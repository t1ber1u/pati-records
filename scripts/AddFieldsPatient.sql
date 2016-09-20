-- Insert all the new fields of the in the table Patients
use pep;
ALTER TABLE patient ADD phone VARCHAR( 255 );  
ALTER TABLE patient ADD genderAdm VARCHAR( 255 ) ;
ALTER TABLE patient ADD birthDate VARCHAR( 255 ) ;
ALTER TABLE patient ADD address VARCHAR( 255 )   ;
ALTER TABLE patient ADD maritalStatus VARCHAR( 255 ) ;
ALTER TABLE patient ADD breed VARCHAR( 255 ) ;  
ALTER TABLE patient ADD ethnicGroup VARCHAR( 255 ) ;
