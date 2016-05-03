package tab;

public class Query {

	 static String getSearchQuery(String s,int s1,int s2,int s3,int s4,int s5,int s6,String s7,String s8,String s9,String s10){
		 String sql = "";
		 
		 
		 
		 if(s1==2 && s2==1 && s3==1 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";
		        }
		        else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		        else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==1 && s2==2 && s3==1 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==2 && s2==2 && s3==1 && s4==1 && s5==1 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==3 && s2==2 && s3==1 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==4 && s2==2 && s3==1 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		        else if (s1==2 && s2==1 && s3==1 && s4==0  && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy > "+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==1 && s3==1 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==1 && s3==1 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==4 && s2==1 && s3==1 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where name="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		       else if (s1==2 && s2==1 && s3==1 && s4==0 && s5==3 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";      
		        }
		       else if (s1==1 && s2==1 && s3==1 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";           
		       }   
		       else if (s1==3 && s2==1 && s3==1 & s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==4 && s2==1 && s3==1 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";       
		       }
		       else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		        // _______________________
		        if(s1==2 && s2==1 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";
		        }
		        else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==1 && s2==2 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==2 && s2==2 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==3 && s2==2 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==4 && s2==2 && s3==1 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        if(s1==2 && s2==1 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate)";;
		        }
		        else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate)";    
		        }
		        else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate)"; 
		        }
		        else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate)"; 
		        }
		        else if(s1==1 && s2==2 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate)";    
		        }  
		        else if(s1==2 && s2==2 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate)";    
		        }  
		        else if(s1==3 && s2==2 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\"order by expirationDate)";    
		        }  
		        else if(s1==4 && s2==2 && s3==1 && s4==1 && s5==1 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\"order by expirationDate)";    
		        }
		        if(s1==2 && s2==1 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";
		        }
		        else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy)";    
		        }
		        else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by  noOfCopy)"; 
		        }
		        else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by  noOfCopy)"; 
		        }
		        else if(s1==1 && s2==2 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by  noOfCopy)";    
		        }  
		        else if(s1==2 && s2==2 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by  noOfCopy)";    
		        }  
		        else if(s1==3 && s2==2 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\"order by  noOfCopy)";    
		        }  
		        else if(s1==4 && s2==2 && s3==1 && s4==1 && s5==1 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\"order by  noOfCopy)";    
		        }    
		        else if (s1==2 && s2==1 && s3==1 && s4==0  && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==1 && s3==1 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==1 && s3==1 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==4 && s2==1 && s3==1 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		       else if (s1==1 && s2==1 && s3==1 && s4==0 && s5==3 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";      
		        }
		       else if (s1==2 && s2==1 && s3==1 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)= \""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";           
		       }   
		       else if (s1==3 && s2==1 && s3==1 & s4==0 && s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==4 && s2==1 && s3==1 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";       
		       }
		       else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		        else if (s1==2 && s2==1 && s3==1 && s4==1 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";    
		        }
		        else if (s1==1 && s2==1 && s3==1 && s4==1 && s5==2 && s6==0)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";        
		        }
		        else if (s1==3 && s2==1 && s3==1 && s4==1 && s5==2 && s6==0)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";    
		        }
		        else if (s1==4 && s2==1 && s3==1 && s4==1 &&  s5==2 && s6==0)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";    
		        }
		        else if (s1==1 && s2==2 && s3==1 && s4==1 &&  s5==2 && s6==0)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";       
		        }
		        else if (s1==2 && s2==2 && s3==1 && s4==1 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";        
		        }
		        else if (s1==3 && s2==2 && s3==1 && s4==1 && s5==2 && s6==0)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";       
		        }
		        else if (s1==4 && s2==2 && s3==1 && s4==1 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by id;";        
		        }
		       else if (s1==1 && s2==1 && s3==1 && s4==1 && s5==3 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by id;";      
		        }
		       else if (s1==2 && s2==1 && s3==1 && s4==1 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)= \""+s+"\") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by id;";           
		       }   
		       else if (s1==3 && s2==1 && s3==1 & s4==1 && s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by id;";    
		       }
		       else if (s1==4 && s2==1 && s3==1 && s4==1 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by id;";    
		       }
		       else if (s1==1 && s2==2 && s3==1 && s4==1 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate  < \""+s10+"\") order by id;";       
		       }
		       else if (s1==2 && s2==2 && s3==1 && s4==1 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate < \""+s10+"\") order by id;";        
		       }
		       else if (s1==3 && s2==2 && s3==1 && s4==1 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate < \""+s10+"\") order by id;";        
		       }
		       else if (s1==4 && s2==2 && s3==1 && s4==1 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate < \""+s10+"\") order by id;";        
		       }    
		        else if (s1==2 && s2==1 && s3==1 && s4==1 && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate > \""+s10+"\") order by country;";    
		        }
		        else if (s1==1 && s2==1 && s3==1 && s4==1 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate > \""+s10+"\") order by country;";        
		        }
		        else if (s1==3 && s2==1 && s3==1 && s4==1 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate >\""+s10+"\") order by country;";    
		        }
		        else if (s1==4 && s2==1 && s3==1 && s4==1 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate >\""+s10+"\") order by country;";    
		        }
		        else if (s1==1 && s2==2 && s3==1 && s4==1 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by country;";       
		        }
		        else if (s1==2 && s2==2 && s3==1 && s4==1 &&  s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by country;";        
		        }
		        else if (s1==3 && s2==2 && s3==1 && s4==1 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by country;";       
		        }
		        else if (s1==4 && s2==2 && s3==1 && s4==1 && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate >\""+s10+"\") order by country;";        
		        }
		       else if (s1==1 && s2==1 && s3==1 && s4==1 && s5==3 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";      
		        }
		       else if (s1==2 && s2==1 && s3==1 && s4==1 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)= \""+s+"\") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";           
		       }   
		       else if (s1==3 && s2==1 && s3==1 & s4==1 && s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";    
		       }
		       else if (s1==4 && s2==1 && s3==1 && s4==1 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";    
		       }
		       else if (s1==1 && s2==2 && s3==1 && s4==1 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";       
		       }
		       else if (s1==2 && s2==2 && s3==1 && s4==1 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";        
		       }
		       else if (s1==3 && s2==2 && s3==1 && s4==1 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";        
		       }
		       else if (s1==4 && s2==2 && s3==1 && s4==1 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate < \""+s10+"\") order by country;";        
		       }
		    //______________________________________________
		       
		       if(s1==2 && s2==1 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate >\""+s10+"\" order by expirationDate);";
		        }
		        else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate >\""+s10+"\" order by expirationDate);";    
		        }
		        else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate >\""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate > \""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==1 && s2==2 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate > \""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==2 && s2==2 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate > \""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==3 && s2==2 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate > \""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==4 && s2==2 && s3==1 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate >\""+s10+"\" order by expirationDate);";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==1 && s4==0  && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==1 && s3==1 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==1 && s3==1 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==4 && s2==1 && s3==1 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		       else if (s1==2 && s2==1 && s3==1 && s4==0 && s5==3 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";      
		        }
		       else if (s1==1 && s2==1 && s3==1 && s4==0 &&  s5==3 && s6==2)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";           
		       }   
		       else if (s1==3 && s2==1 && s3==1 & s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==4 && s2==1 && s3==1 && s4==0 && s5==3 && s6==2)
		       {
		      sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";       
		       }
		       else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }
		       else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationdate);";        
		       }
		       else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }   
		       if(s1==2 && s2==1 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";
		        }
		        else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }
		        else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==1 && s2==2 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==2 && s2==2 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==3 && s2==2 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==4 && s2==2 && s3==1 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==1 && s4==0  && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==1 && s3==1 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==1 && s3==1 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==4 && s2==1 && s3==1 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		       else if (s1==2 && s2==1 && s3==1 && s4==0 && s5==3 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";      
		        }
		       else if (s1==1 && s2==1 && s3==1 && s4==0 &&  s5==3 && s6==3)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";           
		       }   
		       else if (s1==3 && s2==1 && s3==1 & s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		       }
		       else if (s1==4 && s2==1 && s3==1 && s4==0 && s5==3 && s6==3)
		       {
		      sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		       }
		       else if (s1==1 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";       
		       }
		       else if (s1==2 && s2==2 && s3==1 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==3 && s2==2 && s3==1 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==4 && s2==2 && s3==1 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       
		        if(s1==2 && s2==1 && s3==2 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";
		        }
		        else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		        else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==1 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==2 && s4==0  && s5==2 && s6==0)
		        {System.out.println("Hello1");
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy > "+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==1 && s3==2 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==1 && s3==2 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==4 && s2==1 && s3==2 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==2 && s2==1 && s3==2 && s4==0 && s5==3 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";      
		        }
		       else if (s1==1 && s2==1 && s3==2 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";           
		       }   
		       else if (s1==3 && s2==1 && s3==2 & s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==4 && s2==1 && s3==2 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";       
		       }
		       else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		        // _______________________
		        if(s1==2 && s2==1 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";
		        }
		        else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==2 && s4==0  && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==1 && s3==2 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==1 && s3==2 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==4 && s2==1 && s3==2 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		       else if (s1==2 && s2==1 && s3==2 && s4==0 && s5==3 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";      
		        }
		       else if (s1==1 && s2==1 && s3==2 && s4==0 &&  s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";           
		       }   
		       else if (s1==3 && s2==1 && s3==2 & s4==0 && s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==4 && s2==1 && s3==2 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";       
		       }
		       else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       //______________________________________________
		       
		       if(s1==2 && s2==1 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";
		        }
		        else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }
		        else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }        
		        if(s1==2 && s2==1 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";
		        }
		        else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country);";    
		        }  
		        else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==2 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        else if (s1==2 && s2==1 && s3==2 && s4==0  && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==1 && s3==2 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==1 && s3==2 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==4 && s2==1 && s3==2 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==2 && s2==1 && s3==2 && s4==0 && s5==3 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";      
		        }
		        else if (s1==1 && s2==1 && s3==2 && s4==0 &&  s5==3 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";           
		        }   
		        else if (s1==3 && s2==1 && s3==2 & s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==4 && s2==1 && s3==2 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";       
		       }
		       else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }
		       else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationdate);";        
		       }
		       else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }     
		       
		       if(s1==2 && s2==1 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";
		        }
		        else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }
		        else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==2 && s4==0  && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==1 && s3==2 && s4==0 && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==1 && s3==2 && s4==0 && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==4 && s2==1 && s3==2 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		       else if (s1==2 && s2==1 && s3==2 && s4==0 && s5==3 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";      
		        }
		       else if (s1==1 && s2==1 && s3==2 && s4==0 &&  s5==3 && s6==3)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";           
		       }   
		       else if (s1==3 && s2==1 && s3==2 & s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		       }
		       else if (s1==4 && s2==1 && s3==2 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		       }
		       else if (s1==1 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";       
		       }
		       else if (s1==2 && s2==2 && s3==2 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==3 && s2==2 && s3==2 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==4 && s2==2 && s3==2 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		         
		        if(s1==2 && s2==1 && s3==3 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";
		        }
		        else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		        else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==1 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		       else if (s1==2 && s2==1 && s3==3 && s4==0  && s5==2 && s6==0)
		        {System.out.println("Hello2");
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy > "+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==1 && s3==3 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==1 && s3==3 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==4 && s2==1 && s3==3 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		       else if (s1==2 && s2==1 && s3==3 && s4==0 && s5==3 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";      
		        }
		       else if (s1==1 && s2==1 && s3==3 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";           
		       }   
		       else if (s1==3 && s2==1 && s3==3 & s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==4 && s2==1 && s3==3 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";       
		       }
		       else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       // _______________________
		        if(s1==2 && s2==1 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";
		        }
		        else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==3 && s4==0  && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==1 && s3==3 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==1 && s3==3 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==4 && s2==1 && s3==3 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		       else if (s1==2 && s2==1 && s3==3 && s4==0 && s5==3 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";      
		        }
		       else if (s1==1 && s2==1 && s3==3 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";           
		       }   
		       else if (s1==3 && s2==1 && s3==3 & s4==0 && s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==4 && s2==1 && s3==3 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";       
		       }
		       else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		        //______________________________________________
		       
		       if(s1==2 && s2==1 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";
		        }
		        else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }
		        else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==3 && s4==0  && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==1 && s3==3 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==1 && s3==3 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==4 && s2==1 && s3==3 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		       else if (s1==2 && s2==1 && s3==3 && s4==0 && s5==3 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";      
		        }
		       else if (s1==2 && s2==1 && s3==3 && s4==0 &&  s5==3 && s6==2)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";           
		       }   
		       else if (s1==3 && s2==1 && s3==3 & s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==4 && s2==1 && s3==3 && s4==0 && s5==3 && s6==2)
		       {
		      sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";       
		       }
		       else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }
		       else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationdate);";        
		       }
		       else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }
		        else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }
		        else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==3 && s4==0  && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==1 && s3==3 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==1 && s3==3 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==4 && s2==1 && s3==3 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==2 && s2==1 && s3==3 && s4==0 && s5==3 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";      
		        }
		        else if (s1==2 && s2==1 && s3==3 && s4==0 &&  s5==3 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";           
		        }   
		        else if (s1==3 && s2==1 && s3==3 & s4==0 && s5==3 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		        }
		       else if (s1==4 && s2==1 && s3==3 && s4==0 && s5==3 && s6==3)
		       {
		      sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		       }
		       else if (s1==1 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";       
		       }
		       else if (s1==2 && s2==2 && s3==3 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==3 && s2==2 && s3==3 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==4 && s2==2 && s3==3 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		        if(s1==2 && s2==1 && s3==4 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";
		        }
		        else if(s1==1 && s2==1 && s3==4 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		        else if(s1==3 && s2==1 && s3==4 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==4 && s2==1 && s3==4 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by id;"; 
		        }
		        else if(s1==1 && s2==2 && s3==4 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==2 && s2==2 && s3==4 && s4==1 && s5==1 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==3 && s2==2 && s3==4 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }  
		        else if(s1==4 && s2==2 && s3==4 && s4==1 && s5==1 && s6==0){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by id;";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==4 && s4==0  && s5==2 && s6==0)
		        {System.out.println("Hello3");
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy > "+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==1 && s3==4 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==1 && s3==4 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==4 && s2==1 && s3==4 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by id;";    
		        }
		        else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		        else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";       
		        }
		        else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==2 && s6==0)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by id;";        
		        }
		       else if (s1==1 && s2==1 && s3==4 && s4==0 && s5==3 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";      
		        }
		       else if (s1==2 && s2==1 && s3==4 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";           
		       }   
		       else if (s1==3 && s2==1 && s3==4 & s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==4 && s2==1 && s3==4 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by id;";    
		       }
		       else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";       
		       }
		       else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==0)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==3 && s6==0)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by id;";        
		       }
		       
		      // _______________________
		        if(s1==2 && s2==1 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";
		        }
		        else if(s1==1 && s2==1 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        else if(s1==3 && s2==1 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==4 && s2==1 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\") order by country;"; 
		        }
		        else if(s1==1 && s2==2 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==2 && s2==2 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==3 && s2==2 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }  
		        else if(s1==4 && s2==2 && s3==4 && s4==1 && s5==1 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\") order by country;";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==4 && s4==0  && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==1 && s3==4 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==1 && s3==4 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==4 && s2==1 && s3==4 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+") order by country;";    
		        }
		        else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		        else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==2 && s6==1)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";       
		        }
		        else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==2 && s6==1)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+") order by country;";        
		        }
		       else if (s1==2 && s2==1 && s3==4 && s4==0 && s5==3 && s6==1){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";      
		        }
		       else if (s1==1 && s2==1 && s3==4 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";           
		       }   
		       else if (s1==3 && s2==1 && s3==4 & s4==0 && s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==4 && s2==1 && s3==4 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+") order by country;";    
		       }
		       else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";       
		       }
		       else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==1)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==3 && s6==1)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+") order by country;";        
		       }
		       
		    //______________________________________________
		       
		       if(s1==2 && s2==1 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";
		        }
		        else if(s1==1 && s2==1 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }
		        else if(s1==3 && s2==1 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==4 && s2==1 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);"; 
		        }
		        else if(s1==1 && s2==2 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==2 && s2==2 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==3 && s2==2 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }  
		        else if(s1==4 && s2==2 && s3==4 && s4==1 && s5==2 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==4 && s4==0  && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==1 && s3==4 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==1 && s3==4 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==4 && s2==1 && s3==4 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";    
		        }
		        else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		        else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==2 && s6==2)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";       
		        }
		        else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==2 && s6==2)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by expirationDate);";        
		        }
		       else if (s1==2 && s2==1 && s3==4 && s4==0 && s5==3 && s6==2){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";      
		        }
		       else if (s1==1 && s2==1 && s3==4 && s4==0 &&  s5==3 && s6==2)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";           
		       }   
		       else if (s1==3 && s2==1 && s3==4 & s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==4 && s2==1 && s3==4 && s4==0 && s5==3 && s6==2)
		       {
		      sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by expirationDate);";    
		       }
		       else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";       
		       }
		       else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }
		       else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationdate);";        
		       }
		       else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==3 && s6==2)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by expirationDate);";        
		       }
		       if(s1==2 && s2==1 && s3==4 && s4==1 && s5==2 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";
		       }
		        else if(s1==1 && s2==1 && s3==4 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by expirationDate);";    
		        }
		        else if(s1==3 && s2==1 && s3==4 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==4 && s2==1 && s3==4 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);"; 
		        }
		        else if(s1==1 && s2==2 && s3==4 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==2 && s2==2 && s3==4 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==3 && s2==2 && s3==4 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }  
		        else if(s1==4 && s2==2 && s3==4 && s4==1 && s5==2 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and expirationDate =\""+s10+"\" order by noOfCopy);";    
		        }
		        
		        else if (s1==2 && s2==1 && s3==4 && s4==0  && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==1 && s3==4 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==1 && s3==4 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==4 && s2==1 && s3==4 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";    
		        }
		        else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		        else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==2 && s6==3)
		        {
		         sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";       
		        }
		        else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==2 && s6==3)
		        {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy >"+s7+" order by noOfCopy);";        
		        }
		       else if (s1==2 && s2==1 && s3==4 && s4==0 && s5==3 && s6==3){
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)= \""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(name)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";      
		        }
		       else if (s1==1 && s2==1 && s3==4 && s4==0 &&  s5==3 && s6==3)
		       {
		        sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeMagazine where id in (select id from customer where id="+s+") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";           
		       }   
		       else if (s1==3 && s2==1 && s3==4 & s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(email_id)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		       }
		       else if (s1==4 && s2==1 && s3==4 && s4==0 && s5==3 && s6==3)
		       {
		      sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeMagazine where id in (select id from customer where upper(country)=\""+s+"\") and m_id ="+s3+" and noOfCopy < "+s7+" order by noOfCopy);";    
		       }
		       else if (s1==1 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" and id in (select id from subscribeNewsPaper where id in (select id from customer where id="+s+") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";       
		       }
		       else if (s1==2 && s2==2 && s3==4 && s4==0 &&  s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(name)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(name)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==3 && s2==2 && s3==4 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(email_id)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(email_id)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if (s1==4 && s2==2 && s3==4 && s4==0 && s5==3 && s6==3)
		       {
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where upper(country)=\""+s+"\" and id in (select id from subscribeNewsPaper where id in (select id from customer where upper(country)=\""+s+"\") and n_id ="+s3+" and noOfCopy <"+s7+" order by noOfCopy);";        
		       }
		       else if(s1==0 && s2==0 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer order by id";    
		       }
		       else if(s1==0 && s2==0 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer order by country";    
		       }
		       else if(s1==0 && s2==0 && s4==0 && s5==0 && s6==3){
		       sql="select c.id,name,email_id,address1,country,pin,billOrFree from customer c,subscribeNewsPaper order by noOfCopy";    
		       }
		       else if(s1==0 && s2==0 && s4==0 && s5==0 && s6==2){
		       sql="select c.id,name,email_id,address1,country,pin,billOrFree from customer c,subscribeNewsPaper order by expirationDate";    
		       }
		       else if(s1==1 && s2==0 && s4==1  && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by id";    
		       }
		       else if(s1==1 && s2==0 &&  s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by country";    
		       }
		       else if(s1==1 && s2==0 &&  s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by noOfCopy";    
		       }
		       else if(s1==1 && s2==0 &&  s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by expirationDate";    
		       }
		       
		       else if(s1==2 && s2==0 &&  s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by id";    
		       }
		       else if(s1==2 && s2==0 &&  s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by country";    
		       }
		       else if(s1==2 && s2==0 &&  s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by noOfCopy";    
		       }
		       else if(s1==2 && s2==0 &&  s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by expirationDate";    
		       }
		       
		       else if(s1==3 && s2==0 &&  s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by id";    
		       }
		       else if(s1==3 && s2==0 &&  s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by country";    
		       }
		       else if(s1==3 && s2==0 &&  s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by noOfCopy";    
		       }
		       else if(s1==3 && s2==0 &&  s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by expirationDate";    
		       }
		            
		       else if(s1==4 && s2==0 &&  s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by id";    
		       }
		       else if(s1==4 && s2==0 &&  s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by country";    
		       }
		       else if(s1==4 && s2==0 &&  s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by noOfCopy";    
		       }
		       else if(s1==4 && s2==0 && s4==0 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by expirationDate";    
		       }
		             
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by id";
		        }
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by id";
		        }
		       else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=3 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		       else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by id";
		       }
		       else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by id";
		        }
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }    
		       
		       
		       else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==2 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 ) order by id";    
		       }
		       else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==2 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==2 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by id";
		        }
		       else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by country";    
		       }
		       else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==2 && s3==2 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==2 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=3 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 ) order by id";    
		       }
		       else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==2 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==2 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by id";
		        }
		       else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by country";    
		       }
		       else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==2 && s3==3 && s4==1 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		     
		       else if(s1==1 && s2==0 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by id";    
		       }
		       else if(s1==1 && s2==0 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by country";    
		       }
		       else if(s1==1 && s2==0 &&  s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by noOfCopy";    
		       }
		       else if(s1==1 && s2==0 &&  s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id="+s+" order by expirationDate";    
		       }
		       
		       else if(s1==2 && s2==0 &&  s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by id";    
		       }
		       else if(s1==2 && s2==0 &&  s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by country";    
		       }
		       else if(s1==2 && s2==0 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by noOfCopy";    
		       }
		       else if(s1==2 && s2==0 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" order by expirationDate";    
		       }
		       
		       else if(s1==3 && s2==0 &&  s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by id";    
		       }
		       else if(s1==3 && s2==0 &&  s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by country";    
		       }
		       else if(s1==3 && s2==0 &&  s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by noOfCopy";    
		       }
		       else if(s1==3 && s2==0 &&  s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" order by expirationDate";    
		       }
		       else if(s1==4 && s2==0 &&  s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by id";    
		       }
		       else if(s1==4 && s2==0 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by country";    
		       }
		       else if(s1==4 && s2==0 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by noOfCopy";    
		       }
		       else if(s1==4 && s2==0 &&  s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" order by expirationDate";    
		       }
		             
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by id";
		        }
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==2 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==2 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==2 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==1 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by id";
		        }
		       else if(s1==4 && s2==1 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==2 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=3 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==1 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by id";
		        }
		       else if(s1==4 && s2==1 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		        
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 ) order by id";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=1) order by id";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1) order by country";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by id";
		        }
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 )order by country";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==1 && s3==1 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=1 order by expirationDate)";    
		       }    
		           
		       else if(s1==1 && s2==2 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==1 && s2==2 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==1 && s2==2 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==2 && s3==2 &&s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==2 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 ) order by id";    
		       }
		       else if(s1==2 && s2==2 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==2 && s2==2 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==2 && s3==2 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==2 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=2) order by id";    
		       }
		       else if(s1==3 && s2==2 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2) order by country";    
		       }
		       else if(s1==3 && s2==2 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==2 && s3==2 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==2 && s3==2 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by id";
		        }
		       else if(s1==4 && s2==2 && s3==2 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 )order by country";    
		       }
		       else if(s1==4 && s2==2 && s3==2 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==2 && s3==2 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=2 order by expirationDate)";    
		       }
		       
		       else if(s1==1 && s2==2 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==1 && s2==2 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==1 && s2==2 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==1 && s2==2 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where id in (select id from subscribemagazine where m_id=3 order by expirationDate)";    
		       }
		       
		       else if(s1==2 && s2==2 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 ) order by id";    
		       }
		       else if(s1==2 && s2==2 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in(select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==2 && s2==2 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==2 && s2==2 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where name=\""+s+"\" and id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		        
		       else if(s1==3 && s2==2 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in(select id from subscribeMagazine where m_id=3) order by id";    
		       }
		       else if(s1==3 && s2==2 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,c0ountry,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3) order by country";    
		       }
		       else if(s1==3 && s2==2 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==3 && s2==2 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where email_id=\""+s+"\"  where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		       
		       else if(s1==4 && s2==2 && s3==3 && s4==0 && s5==0 && s6==0){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by id";
		        }
		       else if(s1==4 && s2==2 && s3==3 && s4==0 && s5==0 && s6==1){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 )order by country";    
		       }
		       else if(s1==4 && s2==2 && s3==3 && s4==0 && s5==0 && s6==3){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by noOfCopy)";    
		       }
		       else if(s1==4 && s2==2 && s3==3 && s4==0 && s5==0 && s6==2){
		       sql="select id,name,email_id,address1,country,pin,billOrFree from customer where country=\""+s+"\" where id in (select id from subscribeMagazine where m_id=3 order by expirationDate)";    
		       }
		 
		 
		 
		return sql;
	}
	
	 static String getInsertQuery(String pass,String s,String s1, String s2,String s3, String s4,String s5,String s6,String s7,String billorfree,String s8){
		 String sql = null;
		 sql = "insert into customer ( password,name,address1,address2,address3,city,state,country,pin,billOrFree,email_id) values('"+pass+"','"+s+"','"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+billorfree+"','"+s8+"');";
		 return sql;
	 }

	 static public boolean checkNum(String a){
			for(int i= 0; i< a.length(); i++ ){
				char j = a.charAt(i);
				if(j != '0' && j != '1' &&j != '2' &&j != '3' &&j != '4' &&j != '5' &&j != '6' &&j != '7' &&j != '8' &&j != '9'&&j != '-')
					return false;
			}
			return true;
		}
	
	 static public  boolean checkEmpty(String a)//checks if empty 
		{
		    if(a.equals("") || a == null) {
		        return true;
		    }
		     for(int i=0;i<a.length();i++)
		    {
		        if(a.charAt(i)!=' ')
		        {
		           return false;
		        }
		    }
		    
		    return true;
		}

	 static public  boolean checkEmpty(char[] a)//checks if empty 
		{
		   return a.length == 0;
		}

}
