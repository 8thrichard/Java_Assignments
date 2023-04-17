/*
 * @author richardboamah
 */
package zoo.animal;

/**
The {@code Bird} class is an abstract class that extends the {@code Animal} class and
represents a bird in a zoo.
 */
public abstract class Bird extends Animal{

	/**
	 * This Changes the type of animal to Bird.
	 */
	private final String type = "bird";

	/**
	 * The Wingspan of the bird in Inches.
	 */
	protected float wingspan;

	/**
	 * Creates a new {@code Bird} object with default values.
	 */
	public Bird() {
		super();
		this.wingspan = 0;
	}

	/**
	 * Creates a new {@code Bird} object with the specified birthdate and weight.
	 * 
	 * @param birthdate The birthdate of the bird.
	 * @param weight The weight of the bird.
	 * @throws Exception if the birthdate or weight is invalid.
	 */
	public <T> Bird(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}

	/**
	 * Creates a new {@code Bird} object with the specified birthdate, weight, and wingspan.
	 * 
	 * @param birthdate The birthdate of the bird.
	 * @param weight The weight of the bird.
	 * @param wingspan The wingspan of the bird.
	 * @throws Exception if the birthdate, weight, or wingspan is invalid.
	 */
	public <T> Bird(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight);
		this.setWingspan(wingspan);
	}

	/**
	 * Gets the wingspan of the bird.
	 * 
	 * @return the wingspan of the bird.
	 */
	public float getWingspan() {
		return wingspan;
	}

	/**
	 * Sets the wingspan of the bird.
	 * 
	 * @param wingspan The wingspan of the bird.
	 * @throws Exception if the wingspan is invalid.
	 */
	public void setWingspan(float wingspan) throws Exception {
		if (wingspan > 0)
			this.wingspan = wingspan;
		else
			throw new Exception("Invalid winspan" + wingspan);
	}

	/**
	Overrides the toString() method of the Animal class to include the type of animal as "bird".
	@return the string representation of the bird, including its id and type ("bird")
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;

	}

}