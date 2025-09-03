package demos;

public class variable2 {
	int rollno=20;
	String Name= "Sangram";
	char G='M';
	float f=2.55f;
	
	
	void Display()
	{
		System.out.println("Roll No is="+rollno);
		System.out.println("Name is="+Name);
		System.out.println("Gender Is="+G);
		System.out.println("Score is="+f);
	}
	
	public static void main(String[] args)
	{
		variable2 v=new variable2();
		v.Display();
	}

}
