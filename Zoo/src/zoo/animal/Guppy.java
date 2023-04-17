package zoo.animal;

/**
Guppy is a type of Fish that implements the Swim interface, allowing it to move through water.
*/
public class Guppy extends Fish implements Swim{
	
	/**
	The type of this Animal, which is "Guppy".
	*/
	protected final String type = "Guppy";

	/**
	 * Inherits the properties of class @Fish
	 *Constructs a new Guppy object with default values.
	*/
	public Guppy() {
		super();
	}
	
	/**
	Constructs a new Guppy object with the specified birthdate and weight.
	@param birthdate the birthdate of this Guppy
	@param weight the weight of this Guppy
	@throws Exception if the birthdate or weight is invalid
	*/
	public <T> Guppy(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	Constructs a new Guppy object with the specified birthdate, weight, and water type.
	@param birthdate the birthdate of this Guppy
	@param weight the weight of this Guppy
	@param water the type of water that this Guppy can live in
	@throws Exception if the birthdate or weight is invalid
	*/
	public <T> Guppy(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight);
		this.setWater(water);
	}
	
	/**
	 * Returns a string representation of the Guppy Animal.
	 * 
	 * @return A string representation of the Guppy Animal.
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;

	}
	
	/*
	 * Implements the eat method of the abstract class Animal.
	 */
	@Override
	public void eat() {
		System.out.println("This " + this.type + " is eating..");
	}

	/**
	 * Implements the swim method of the abstract class Animal.
	 */
	@Override
	public void propel() {
		System.out.println("This " + this.type + " can propel..");
		
	}

	/**
	 * Implements the swim method of the abstract class Animal.
	 */
	@Override
	public void drift() {
		System.out.println("This " + this.type + " can drift..");
		
	}
}
