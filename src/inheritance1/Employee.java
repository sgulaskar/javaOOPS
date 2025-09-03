package inheritance1;

public class Employee extends Person{
	int id;
	float sal;
	void display()
	{
		super.display();
		System.out.println("ID is :"+id);
		System.out.println("Salary is :"+sal);
	}
}
