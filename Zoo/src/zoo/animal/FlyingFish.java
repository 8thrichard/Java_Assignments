package zoo.animal;

/**
The FlyingFish class represents a type of Fish that is capable of flying and swimming.
It extends the Fish class and implements the Fly and Swim interfaces.
*/
public class FlyingFish extends Fish implements Fly, Swim {
	
	/**
	 * The type of this animal, which is set to "FlyingFish".
	 */
	protected final String type = "FlyingFish";
	
	/*
	 *This method takes on the instances of the Fish Class with default values.
	 **/
	public FlyingFish() {
		super();

	}

	/**
	 * Creates a new instance of FlyingFish with the given birthdate and weight.
	 * @param birthdate the birthdate of this FlyingFish
	 * @param weight the weight of this FlyingFish in pounds
	 * @throws Exception if the given weight is invalid
	 */
	public <T> FlyingFish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * Creates a new instance of FlyingFish with the given birthdate, weight, and water type.
	 * @param birthdate the birthdate of this FlyingFish
	 * @param weight the weight of this FlyingFish in pounds
	 * @param water the type of water this FlyingFish can live in
	 * @throws Exception if the given weight is invalid or the water type is not recognized
	 */
	public <T> FlyingFish(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight, water);
	}

	/**
	 * Returns a string representation of the FlyingFish Animal.
	 * 
	 * @return A string representation of the FlyingFish Animal.
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
	}
	
	/**
	 * Implements the eat method of the abstract class Animal.
	 */
	@Override
	public void eat() {
		System.out.println("This " + this.type + " is eating..");
	}
	
	/**
	 * Implements the eat method of the abstract class Animal.
	 */
	@Override
	public void soar() {
		System.out.println("This " + this.type + " can soaring..");
	}

	/**
	 * Implements the eat method of the abstract class Animal.
	 */
	@Override
	public void glide() {
		System.out.println("This " + this.type + " can gliding..");	
	}
	
	/**
	 * Implements the eat method of the abstract class Animal.
	 */
	@Override
	public void propel() {
		System.out.println("This " + this.type + " can propel..");
	}
	
	/**
	 * Implements the eat method of the abstract class Animal.
	 */
	@Override
	public void drift() {
		System.out.println("This " + this.type + " can drift..");	
	}

	/**
	 * Implements the eat method of the abstract class Animal.
	 */
	@Override
	public void fly() {
		System.out.println("This " + this.type + " can fly..");
		
	}
}
