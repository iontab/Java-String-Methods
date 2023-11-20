package example;

public class Student {
	
	 int id;  
	 String name;  
	 String city;  
	  
	 Student(int id, String name, String city){  
		 
	 this.id=id;  
	 this.name=name;  
	 this.city=city;  
	 
	 }  
	 
	 
	 public String toString(){ 
		  return id+" "+name+" "+city;  
		 } 
	  
	 public static void main(String args[]){  
		 
	   Student s1=new Student(1,"John","Java");  
	  
	    
	     
	   System.out.println(s1);//compiler writes here s1.toString()  
	   
	 }  

}
