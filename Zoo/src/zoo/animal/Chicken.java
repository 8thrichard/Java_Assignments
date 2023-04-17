package zoo.animal;

public class Chicken extends Bird implements Fly {

	protected final String type = "Chicken";

	/**
	 * Default constructor for Chicken class.
	 * Sets wingspan to 0.
	 */
	public Chicken() {
		super();
		this.wingspan = 0;
	}

	/**
	 * Constructor for Chicken class that sets the birthdate and weight of the chicken.
	 * 
	 * @param birthdate The birthdate of the chicken
	 * @param weight The weight of the chicken
	 * 
	 * @throws Exception if an invalid value is passed for weight
	 */
	public <T> Chicken(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}


	/**
	 * Constructor for Chicken class that sets the birthdate, weight, and wingspan of the chicken.
	 * 
	 * @param birthdate The birthdate of the chicken
	 * @param weight The weight of the chicken
	 * @param wingspan The wingspan of the chicken
	 * 
	 * @throws Exception if an invalid value is passed for weight or wingspan
	 */
	public <T> Chicken(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight);
	}

	/**
	 * Returns a string representation of the Chicken object.
	 * 
	 * @return A string representation of the Chicken object
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
	 * Implements the soar method of the interface Fly.
	 * This means the chicken can maintain height in the air without flapping wings or using engine power.
	 */
	@Override
	public void soar() {
		System.out.println("This " + this.type + " can soar..");	
	}

	/**
	 * Implements the glide method of the interface Fly.
	 * Meaning: make an unpowered flight, either in a glider or in an aircraft with engine failure.
	 */
	@Override
	public void glide() {
		System.out.println("This " + this.type + " can glide..");

	}

	/**
	 * Implements the fly method of the interface Fly.
	 */
	@Override
	public void fly() {
		System.out.println("This " + this.type + " can drift..");

	}
}
// End of Chicken