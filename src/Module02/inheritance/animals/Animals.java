package Module02.inheritance.animals;

public class Animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("The Animals movements, sounds, and food :");

		System.out.println();

		Dog d = new Dog("The Dog");

		d.movement();
		d.Sound();
		d.food();
		System.out.println();

		Rabbit r = new Rabbit("The Rabbit");

		r.movement();
		r.Sound();
		r.food();
		System.out.println();

		Fish f = new Fish("The Fish");

		f.movement();
		f.Sound();
		f.food();
		System.out.println();

		Bird b = new Bird("The Bird");

		b.movement();
		b.Sound();
		b.food();

	}

}
