package arraydemo;

public class EvenOddUsingStaticmethod 
{
    static int a[] = {56, 87, 96, 23, 47, 65, 66, 11, 22, 88};

    static void even() 
    {
        System.out.println("Even Numbers in Array:");
        for (int num : a) 
        {
            if (num % 2 == 0) 
            {
                System.out.println(num);
            }
        }
    }
    static void odd()
    {
        System.out.println("ODD Number in Array:");
        for (int num : a) 
        {
            if (num % 2 != 0) 
            {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) 
    { 
        even(); 
        odd();
    }
}
