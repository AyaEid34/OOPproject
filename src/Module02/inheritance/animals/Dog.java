package Module02.inheritance.animals;

public class Dog extends AnimalsProperties {
	
	public Dog (String name) {
		super(name);
		
	}
	public void Sound() {
		System.out.println("it sounds like Woof Woof");
	}
	
	public void movement() {
		System.out.println(name + "  is running");
			
	}
	
	public void food() {
		System.out.println("and eats meat. ");
		
	}
}
