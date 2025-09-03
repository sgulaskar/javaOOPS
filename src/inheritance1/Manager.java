package inheritance1;

public class Manager extends Employee{
	float bonus;
	void display()
	{
		super.display();       //Super keyword is usally refer to immmediate class ,method ,variable
		System.out.println("Bonus is :"+bonus);
	}
	

}
