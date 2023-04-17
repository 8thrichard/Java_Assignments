package zoo.animal;

/**
The Fly interface represents the behavior of flying for animals that can fly such as birds.
It defines three methods that represent different ways of flying: fly(), soar(), and glide().
 */
public interface Fly {

	/**
	 * This method represents the typical way of flying, usually with flapping wings.
	 */
	void fly();

	/**
	 * This method represents flying high in the air with minimal effort or movement.
	 */
	void soar();

	/**
	 * This method represents a type of flying where the animal descends slowly while keeping the wings outstretched.
	 */
	void glide();

}
