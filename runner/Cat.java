public class Cat{

	private int age;
	private String name;

	public Cat(int num, String nam){
		age = num;
		name = nam; 
  	}

	public void speak(){
		System.out.println("MEOW MY NAME IS " + name + " AND I AM " + age + " YEARS OLD ");
	}
}