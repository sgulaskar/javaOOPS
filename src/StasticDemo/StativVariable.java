package StasticDemo;

public class StativVariable 
{
	//Java Program to demonstrate the use of static variable  
	 
	   int rollno;//instance variable  
	   String name;  
	   static String college ="ITS";//static variable  
	   //constructor  
	   StativVariable(int r, String n)
	   {  
		   rollno = r;  
		   name = n;  
	   }  
	   //method to display the values  
	   void display ()
	   {
		   System.out.println(rollno+" "+name+" "+college);
		   }  
	
	//Test class to show the values of objects  

	 public static void main(String args[])
	 {  
		 StativVariable  s1 = new StativVariable (111,"Karan");  
		 StativVariable  s2 = new StativVariable (222,"Aryan");  
		 //we can change the college of all objects by the single line of code  
		 //Student.college="BBDIT";  
		 s1.display();  
		 s2.display();  
	 }  
} 



