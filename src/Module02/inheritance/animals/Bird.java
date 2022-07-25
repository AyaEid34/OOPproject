package Module02.inheritance.animals;

public class Bird extends AnimalsProperties {

	
	public Bird (String name) {
		super(name);
		
		
	}

	public void Sound() {
		System.out.println("its sound chirp chirp!! ");
	}
	
	public void movement() {
		System.out.println(name + "  is flying");
		
		
	}
	public void food() {
		System.out.println("eats insects and seeds.");
		
	}
}
