package demos;

public class PolymorphismDemo {
	
	void add()
	{
		int a=18;
		int b=33;
	
		System.out.println(a+b);
	}
	
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
		
	}
	
	void add(float a,float b)
	{
		float c=a+b;
		System.out.println(c);
		
	}
	
	void add(int a,float b)
	{
		float c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		PolymorphismDemo p=new PolymorphismDemo();
		p.add();
		
		p.add(44, 22);
		
		p.add(5.5f, 7.57f);
		
		p.add(45, 6.5f);
		

	}

}
