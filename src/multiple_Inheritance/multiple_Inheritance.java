package multiple_Inheritance;

interface A 
{
    void Show();
}

interface B 
{
    void Display();
}
class C implements A, B 
{
    public void Show() 
    {
    	System.out.println("Show from Interface A");
    }
    public void Display() 
    {
    	System.out.println("Display from Interface B");
    }
}
public class multiple_Inheritance 
{

	public static void main(String[] args) 
	{
		C c1=new C();
		c1.Show();
		c1.Display();

	}

}
