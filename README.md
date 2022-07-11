# PRJ301 Assignment : Students grading sub-system web .

PRJ301 Assignment : Students grading sub-system web .

TODO LIST :
+ Front-end :  
-loginPage  
-studentDetailView (thô)  
-markView (thô)  
-teacherDetailView (thô)  
-courseMarkView (thô)  
+ Back-end :    
-login  
-authorization  
-student information   (in-progress)
-teacher information  
-course marks view , add , edit for teacher  
  
+ Database :    
-database(final)  
-query(chưa final)  
 
 PRJ :Student , assessment , Exam 
 
 SELECT * FROM   
 (SELECT * FROM Exam ) A    
 INNER JOIN    
 (SELECT said , aid , max(date) as date FROM Exam    
 Group BY sid,aid) B  
 ON A.aid = B.aid AND A.sid = B.sid AND A.DATE =b.date  
