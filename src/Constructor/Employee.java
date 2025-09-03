package constructor;

public class Employee {

	
	int id;
	String name;
	float sal;
	public Employee()   //Defalut Constructor
	{
		System.out.println("This Is a Defaul Constructor");
	}
	void display()
	{
		System.out.println("Employee Details are");
		System.out.println(id);
		System.out.println(name);
		System.out.println(sal);
	}
	public Employee(int i,String n,float s)    //Parametrized Contstuctor
	{
		id=i;
		name=n; 
		sal=s;
	}
	public static void main(String[] args) {
	
		//Employee e1=new Employee();
	//e1.display();
		
		Employee e2=new Employee(22,"Ram",25000f);
	e2.display();
		
	}

}
