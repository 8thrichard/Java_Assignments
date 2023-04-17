package zoo.animal;

/**
The {@code Sparrow} class represents a type of bird known as a sparrow.
It is a subclass of the {@link Bird} class and inherits its properties and methods.
@author richardboamah
*/
public class Sparrow extends Bird{
	
	/**
	 * The type of animal, which is "Sparrow".
	 */
	protected final String type = "Sparrow";
	
	/**
	 * Inherits properties of the @BIRD class with default values.
	 */
	public Sparrow() {
		super();
		this.wingspan = 0;
	}
	
	/**
	 * Constructs a new {@code Sparrow} object with the specified birthdate and weight.
	 * 
	 * @param birthdate The birthdate of the sparrow.
	 * @param weight The weight of the sparrow in kilograms.
	 * @throws Exception If the specified weight is invalid.
	 */
	public <T> Sparrow(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * Constructs a new {@code Sparrow} object with the specified birthdate, weight, and wingspan.
	 * 
	 * @param birthdate The birthdate of the sparrow.
	 * @param weight The weight of the sparrow in kilograms.
	 * @param wingspan The wingspan of the sparrow in meters.
	 * @throws Exception If the specified weight or wingspan is invalid.
	 */
	public <T> Sparrow(T birthdate, float weight, float wingspan) throws Exception {
		super(birthdate, weight);
		this.setWingspan(wingspan);
	}
	
	/**
	 * Returns a {@code String} representation of the sparrow, which includes its ID and type.
	 * 
	 * @return A string representation of the sparrow.
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;
		
	}
	
	/**
	 * Prints a message indicating that the sparrow is eating.
	 */
	@Override
	public void eat() {
		System.out.println("This " + this.type + " is eating..");
	}
} //End of Sparrow
