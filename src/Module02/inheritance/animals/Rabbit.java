package Module02.inheritance.animals;

public class Rabbit extends AnimalsProperties {
	
	public Rabbit(String name) {	
		super(name);
		
	}
	
	public void Sound() {
		System.out.println("it sound like muttering!");
	}
	
	public void movement() {
		System.out.println(name + "  is Jumping");
		
	}
	
	public void food() {
		System.out.println("and eats grass. ");
		
	}

}
