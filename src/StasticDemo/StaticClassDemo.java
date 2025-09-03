package StasticDemo;



public class StaticClassDemo 
{
    private static int staticVariable = 10;
    private int instanceVariable = 20;

    public static class NestedStaticClass 
    {
        public void display() 
        {
            // Static nested class can access both static and instance variables of the outer class
            System.out.println("Static variable in the outer class: " + staticVariable);
            // System.out.println("Instance variable in the outer class: " + instanceVariable); // Error: Cannot access instance variable in a static context
            
        }
    }

    public static void main(String[] args) 
    {
    	StaticClassDemo.NestedStaticClass nestedObject = new StaticClassDemo.NestedStaticClass();
        nestedObject.display();
    }
}
