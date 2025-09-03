package inheritance;
 
public class Employee extends Person{
	int id;
	float sal;
	//name
	Employee(String name,int id,float sal)
	{
		super(name);
		this.id=id;
		this.sal=sal;
	}
	void display()
	{
		super.display();
		System.out.println("Id is :"+id);
		System.out.println("Salary is :"+sal);
	
}
}
