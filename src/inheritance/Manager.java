package inheritance;

public class Manager extends Employee {
	
	float bonus;
	
	Manager(String name,int id,float sal,float bonus)
	{
		super(name,id,sal);
		this.bonus=bonus;
	}
	void display()
	{
		super.display();
		System.out.println("Bonus is :"+bonus);
	}
}
