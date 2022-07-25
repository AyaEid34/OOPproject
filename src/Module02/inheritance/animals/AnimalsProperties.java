package Module02.inheritance.animals;

public class AnimalsProperties {

	
	protected String name;
	
	public AnimalsProperties(String name) {
		this.name=name;
	} 
	
	public void Sound() {
		System.out.println("HI");
	}
	
	public void movement() {
		System.out.println(name + "  moves ");
		
	}
	
	public void food() {
		System.out.println(name + "  eats : ");
		
	}
	
}
