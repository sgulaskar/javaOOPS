package inheritance.MultilevelInheritance;


class Animal
{
	public void Eating()
	{
		System.out.println("Animal is Eating");
	}
}

class Dog extends Animal
{
	public void bark()
	{
		System.out.println("The dag is barking");
	}
}

class puppy extends Dog
{
	public void screming()
	{
		System.out.println("The puppy is Screming");
	}
}



public class Multilevel_Inheritance 
{

	public static void main(String[] args) 
	{
		puppy p1=new puppy();
		p1.Eating();
		p1.bark();
		p1.screming();

	}

}
