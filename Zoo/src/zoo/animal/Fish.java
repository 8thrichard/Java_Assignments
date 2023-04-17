package zoo.animal;


/**
The Fish class is an abstract class that extends the Animal class and defines the properties and methods
that all fish will have. Fish can be of either freshwater or saltwater types, which is represented by
the Water enum. Fish also have a type property which is set to "fish" by default.
*/
public abstract class Fish extends Animal {
	
	/**
	 * The type of this Animal, which is "fish".
	 */
	protected final String type = "fish";
	
	/**
	 * The type of water that this Fish can live in, represented by the Water enum.
	 */
	protected Water water;
	
	/**
	 * Inherits the properties of Animals class.
	 * Constructs a new Fish object with default values.
	 */
	public Fish() {
		super();
		this.water = Water.UNKNOWN;

	}
	
	/**
	 * Constructs a new Fish object with the specified birthdate and weight.
	 * @param birthdate the birthdate of this Fish
	 * @param weight the weight of this Fish
	 * @throws Exception if the birthdate or weight is invalid
	 */
	public <T> Fish(T birthdate, float weight) throws Exception {
		super(birthdate, weight);
	}
	
	/**
	 * Constructs a new Fish object with the specified birthdate, weight, and water type.
	 * @param birthdate the birthdate of this Fish
	 * @param weight the weight of this Fish
	 * @param water the type of water that this Fish can live in
	 * @throws Exception if the birthdate or weight is invalid, or if the water type is not valid
	 */
	public <T> Fish(T birthdate, float weight, T water) throws Exception {
		super(birthdate, weight);
		this.setWater(water);
	}

	/**
	 * Returns the type of water that this Fish can live in.
	 * @return the type of water
	 */
	public Water getWater() {
		return this.water;		
	}
	
	/**
	 * Sets the type of water that this Fish can live in.
	 * @param water the type of water, which can be a string ("salt" or "fresh") or a Water enum value
	 * @throws Exception if the water type is not valid
	 */
	public <T2> void setWater(T2 water) throws Exception {


		if (water instanceof String) {

			String s = (String) water; 

			s = s.toLowerCase();

			switch(s) {
			case "s":
			case "Salt":
			case "Saltwater":
				this.water = Water.SALT;
				break;
			case "f":
			case "fresh":
			case "freshwater":
				this.water = Water.FRESH;
				break;
			default:
				this.water = Water.UNKNOWN;
			}
		} else if (water instanceof Water) {
			Water w = (Water) water;
			this.water = w;

		} else { 
			throw new Exception("Invalid water: "+ water);

		}

	}


	@Override
	public String toString() {
		return this.id + " " + this.type;

	}



}
