
package zoo.animal;

/**
The Swim interface defines the behaviors of animals that can swim.
Animals that can swim can propel themselves forward in water, and they can drift
with the current.
*/
public interface Swim {
	
	/**
	Propel the animal forward in water.
	*/
	void propel();
	
	/**
	Drift with the current.
	*/
	void drift();

}
