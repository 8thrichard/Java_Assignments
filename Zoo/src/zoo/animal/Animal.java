/*
 * @author:richardboamah
 * */

package zoo.animal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
The abstract class Animal represents a general animal, with properties such as ID, birthdate, gender, and weight.
It also includes methods for setting and getting these properties, as well as an abstract method for eating.
 */
public abstract class Animal {

	/**
	 * A counter for assigning a unique ID to each Animal object.
	 */
	private static int counter = 0;

	/**
	 * The date format used for birthdates in this class.
	 */
	protected static final DateTimeFormatter FORMAT = DateTimeFormatter.ofPattern("MM-dd-yyyy", Locale.US);

	/**
	 * The animal's ID.
	 */
	protected final int id;

	/**
	 * The animal's type, which is always "Animal".
	 */
	protected final String type = "Animal";

	/**
	 * The animal's gender. It can be MALE, FEMALE OR UNKNOWN
	 */
	protected Gender gender;

	/**
	 * This link was useful in learning more about the date properties in Java.
	 * https://www.baeldung.com/java-creating-localdate-with-values
	 * https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
	 */

	/**
	 * The animal's Date of Birth.
	 */

	private LocalDate birthdate;

	/**
	 * The animal's weight.
	 */
	private float weight;

	/**
	 * Constructs an Animal object with default values.
	 */
	public Animal() {
		this.id = ++Animal.counter;
		this.gender = Gender.UNKNOWN;
		this.birthdate = null;
		this.weight = 0;
	}

	/**
	 * Constructs an Animal object with the specified birthdate and weight.
	 * 
	 * @param birthdate the animal's birthdate, in MM-dd-yyyy format
	 * @param weight the animal's weight, in lbs.
	 * @throws Exception if the birthdate is invalid or if the weight is not positive
	 */
	public <T> Animal(T birthdate, float weight) throws Exception {
		this();
		this.setBirthdate(birthdate);
		this.setWeight(weight);
	}


	/**
	 * Returns the animal's ID.
	 * 
	 * @return the animal's ID
	 */
	public int getId() {
		return this.id;
	}


	/**
	 * Returns the animal's birthdate.
	 * 
	 * @return the animal's birthdate
	 */
	public LocalDate getBirthdate() {
		return this.birthdate;
	}

	/**
	 * Returns a string representation of the animal's birthdate.
	 * 
	 * @return a string representation of the animal's birthdate, in MM-dd-yyyy format
	 */
	public String getBirthdateStr() {
		if (this.birthdate == null)
			return "unknown";
		else
			return Animal.FORMAT.format(this.birthdate);
	}

	/**
	 * Returns the animal's gender.
	 * 
	 * @return the animal's gender
	 */
	public Gender getGender() {
		return this.gender;
	}

	/**
	 * Returns the animal's type, which is always "Animal".
	 * 
	 * @return the animal's type
	 */
	public String getType() {
		return this.getType();
	}

	/**
	 * Returns the animal's weight.
	 * 
	 * @return the animal's weight, in lbs
	 */
	public float getWeight() {
		return this.weight;
	}

	/**
	 * Sets the animal's birthdate to the specified value.
	 * 
	 * @param birthdate the animal's birthdate, either as a string in MM-dd-yyyy format or as a LocalDate object
	 * @throws Exception if the birthdate is invalid
	 */
	public <T> void setBirthdate(T birthdate) throws Exception {

		if (birthdate instanceof String) {

			this.birthdate = LocalDate.parse((String) birthdate, Animal.FORMAT);
			;

		} else if (birthdate instanceof LocalDate) {

			this.birthdate = (LocalDate) birthdate;

		} else {

			throw new Exception("Invalid date MM-dd-yyyy: " + birthdate);

		}

	}


	/**
	 *Sets the gender of the animal.
	 *@param gender a generic type, which can either be a string or a Gender object.
	 *@throws Exception if the gender is invalid or cannot be determined.
	 */
	public <T> void setGender(T gender) throws Exception {

		if (gender instanceof String) {

			String s = (String) gender;

			s = s.toLowerCase();

			switch (s) {
			case "m":
			case "male":
				this.gender = Gender.MALE;
				break;
			case "f":
			case "female":
				this.gender = Gender.FEMALE;
				break;
			default:
				throw new Exception("Invalid gender: " + s);
			}
		} else if (gender instanceof Gender) {
			this.gender = (Gender) gender;
		} else {
			throw new Exception("Invalid gender: " + gender);
		}

	}

	/**
	 *Sets the weight of the animal.
	 *@param weight the weight of the animal.
	 *@throws Exception if the weight is less than or equal to zero.
	 */
	public void setWeight(float weight) throws Exception {

		if (weight > 0)
			this.weight = weight;
		else
			throw new Exception("Invalid weight: " + weight);
	}

	/**
	 *Returns a string representation of the animal.
	 *@return a string consisting of the animal's ID and type.
	 */
	@Override
	public String toString() {
		return this.id + " " + this.type;

	}

	/**
	 *An abstract method that represents the act of eating by the animal.
	 */
	abstract public void eat();

}

// End of Animal
