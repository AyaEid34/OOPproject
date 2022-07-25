package Module02.inheritance.animals;

public class Fish extends AnimalsProperties {
	
	
	public Fish (String name) {
		super(name);
			
	}

	public void Sound() {
		System.out.println("its sound purrs purrs!! ");
	}
	
	public void movement() {
		System.out.println(name + "  is swiming");
		
		}
	public void food() {
		System.out.println("eats smaller fish!!");
		
	}

}
