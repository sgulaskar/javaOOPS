package constructor1;

public class Employee {
	int id;
	String name;
	float sal;
	
	public Employee()                       //Defalut Constructor
	{
		System.out.println("this is a Default Constructor :");
	}
	
	void display()
	{
		System.out.println("Employee Details are:");
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
	public Employee(int id,String name,float sal)      //Parametrized Constructor
	{
		this.id=id;        //this keyword is used to point current object
		this.name=name;
		this.sal=sal;
	}

	public static void main(String[] args) {
		
		Employee e1=new Employee();
		e1.display();
		Employee e2= new Employee(33,"Ram",200000f);  //pass parameter to parametrized constructor
		e2.display();

	}

}
