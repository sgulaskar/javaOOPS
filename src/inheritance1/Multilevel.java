package inheritance1;

public class Multilevel {

	public static void main(String[] args) {
		
		Person p=new Person();
		p.name="Ram";
		p.display();
		
		System.out.println("-------------------------");
		
		Employee e=new Employee();
		e.name="Sita";
		e.id=111;
		e.sal=120000f;
		e.display();
		
		System.out.println("---------------------------");
		
		Manager m=new Manager();
		m.name="Surya";
		m.id=2222;
		m.sal=25000;
		m.bonus=20000;
		m.display();

	}

}
