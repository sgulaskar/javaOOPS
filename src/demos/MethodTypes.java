package demos;

public class MethodTypes {

		void add()
		{
			int a=12;
			int b=30;
			int c=a+b;
			System.out.println("Addition of Number is:"+c);
		}
		
		void addition(int a,int b)
		{
			int c=a+b;
			System.out.println("Addition of Parameters is:"+c);
		}
		
		int sub()
		{
			int a=80;
			int b=30;
			int c=a-b;
			return c;
		}
		
		float substract(float a,float b)
		{
			float c=a-b;
			return c;
		}
		
		public static void main(String[] args) {
			MethodTypes m1=new MethodTypes();
			
			m1.add();
			
			m1.addition(60, 40);
			
			int d= m1.sub();
			System.out.println("Subtraction is :"+d);
			System.out.println(m1.sub());
			
			float e=m1.substract(45.5f, 25.5f);
			System.out.println("Subtraction of float Number is :"+e);
			
	}

}
