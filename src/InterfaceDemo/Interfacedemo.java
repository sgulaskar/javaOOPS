package InterfaceDemo;

public class Interfacedemo 
{

public static void main(String[] args) 
{
		
		Car c=new Kia();            //create Reference of car class method because object is not created by abstact class
		c.accelerate();
		c.breake();
		c.Gearmode();
		
		System.out.println("------------------------------");
		
		Car c1=new Swift();
		c1.accelerate();
		c1.breake();
		c1.Gearmode();
		
		System.out.println("------------------------------");
		
		Kia k=new Kia();
		k.accelerate();
		k.breake();
		
		System.out.println("-------------------------------");
		
		Swift s=new Swift();
		s.accelerate();
		s.breake();
		
		

	}

	}

