# PRJ301 Assignment : Students grading sub-system web .

PRJ301 Assignment : Students grading sub-system web .

TODO LIST :
+ Front-end :  
-loginPage  (thô)
-studentDetailView
-markView 
-teacherDetailView 
-courseMarkView (thô)  
+ Back-end :    
-login          (xong)
-authorization  (xong)
-student information   (sửa list courses)
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
