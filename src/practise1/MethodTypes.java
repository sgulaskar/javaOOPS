package practise1;

public class MethodTypes {
	
	void add()                                     //1.method without return type and without parameter
													// void is a returntyepe that doesnt return any value and add is method name
	{
		int a=10;
		int b=30;
		int c=a+b;
		System.out.println("Addition is :" + c);
	}
	void sub(int a,int b)                          //2.method without return type and with parameter
	{
		int c=a-b;
		System.out.println("Subtraction is :"+ c);
	}

	int mul()                                      //3.method with return type without parameter
	{
		int a=10;
		int b=20;
		int c=a*b;
		return c;
		
	}
	float div(float a,float b)//4.method with return type and with parameter
	{
		//return a/b;
		float c=a/b;
		return c;
		
	}
	
	public static void main(String[] args) {
		
		MethodTypes m1=new MethodTypes();
		m1.add();
		m1.sub(30,10);                             //parameter passed to sub()method
		int d=m1.mul();                              //put value of c in d of mul method
		System.out.println("Multiplication is : "+ d);
		System.out.println(m1.mul());
		
		
		float e=m1.div(1.4f, 0.2f);
		System.out.println("Division is :"+ e);
		

	}

}
