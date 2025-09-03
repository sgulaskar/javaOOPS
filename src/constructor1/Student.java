package constructor1;

public class Student 
{
	int roll_no;
	String name;
	float marks;
	static String school_name="Potdar School";
	
	public Student(int roll_no,String name,float marks)    //constructor
	{
		this.roll_no=roll_no;
		this.name=name;
		this.marks=marks;
	}
	void display()
	{
		System.out.println("Student Details Are :");
		System.out.println(roll_no);
		System.out.println(name);
		System.out.println(marks);
		System.out.println(school_name);
	}
	
	static void change()             //static method
	{
		school_name="Poddar school";
		System.out.println(school_name);
	}
	static
	{
		System.out.println("This is a static block");
	}
	public static void main(String[] args) {
		
		
		Student.change();
		 
		Student s1=new Student(11,"Ram",55.5f);
		s1.display();
		
		Student s2=new Student(22,"Suraj",65.5f);
		s1.display();
		Student.school_name="Saraswati mandir";
		Student s3=new Student(33,"sita",45.5f);
		s1.display();
		

	}

}
