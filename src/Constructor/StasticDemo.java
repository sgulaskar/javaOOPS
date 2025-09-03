package constructor;

public class StasticDemo {

	int roll;
	String name;
	float marks;
	static String school_name="New English School";
	public StasticDemo(int roll,String name,float marks)
	{
		this.roll=roll;
		this.name=name;
		this.marks=marks;
		
	}
	public StasticDemo(int i, String s, float f1, String school_name2) {
		
		roll=i;
		name=s;
		marks=f1;
		
		
	
	}
	void display()
	{
		System.out.println("Student Details are");
		System.out.println(roll);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(school_name);
		
	}
	static void change()
	{
		school_name="Potdar International school";
		System.out.println(school_name);
	}
	static
	{
		System.out.println("This is a static block");
	}
	public static void main(String[] args) {
		StasticDemo.school_name="New Maratha Highschool";
		StasticDemo.change();
		StasticDemo s1=new StasticDemo(12,"Ram",55.5f,school_name);
		s1.display();
	}

}
