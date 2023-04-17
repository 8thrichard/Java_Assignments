//Github Repository URL: https://github.com/8thrichard/Java_Assignments.git
/**
 * This Class Represents a Player in a BasketBall Game
 */
public class Player {

	/*
	 * The Name of the Player
	 */
	private String name;

	/*
	 * The Jersey Number of the Player
	 */
	private int jersey;
	
	/**
	 * The number of fouls the player has committed.
	 */
	private int foul;

	/**
	 * 
	 * The number of field goals the player has scored worth 1 point.
	 */
	private int fieldGoals_1pt;
	/**
	 * 
	 * The number of field goals the player has scored worth 2 points.
	 */
	private int fieldGoals_2pt;
	/**
	 * 
	 * The number of field goals the player has scored worth 3 points.
	 */
	private int fieldGoals_3pt;


	/**
	 * 
	 * Creates a new player with default values.
	 * The name is set to "unknown", jersey number to 0, fouls to 0 and
	 * field goals to 0 for all point values.
	 */
	public Player() {
		this.name = "unknown";
		this.jersey = 0;
		this.foul = 0;
		this.fieldGoals_1pt = 0;
		this.fieldGoals_2pt = 0;
		this.fieldGoals_3pt = 0;
	}

	/**
	 * 
	 * Creates a new player with the given name and jersey number.
	 * The player is initialized with default values for fouls and field goals.
	 * 
	 * @param name   the name of the player
	 * @param jersey the jersey number of the player
	 * @throws Exception if the jersey number is invalid
	 */
	public Player(String name, int jersey) throws Exception {
		this();
		this.setName(name);
		this.setJersey(jersey);
	}

	/**
	 * 
	 * Creates a new player with the given jersey number.
	 * The player is initialized with default values for name, fouls and field
	 * goals.
	 * 
	 * @param jersey the jersey number of the player
	 * @throws Exception if the jersey number is invalid
	 */
	public Player(int jersey) throws Exception {
		this();
		try {
			this.setJersey(jersey);
		} catch (Exception e) {
			throw e;
		}
	}

	/**
	 * Get the Player's name.
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Get the Player jersey number
	 */
	public int getJersey() {
		return this.jersey;
	}

	/*
	 * Get the Player's number of fouls.
	 */
	public int getFoul() {
		return this.foul;
	}

	/**
	 * Set the Player's name.
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Get the Player's number of 1pt field goals made.
	 * 
	 */
	public int getFieldGoals_1pt() {
		return this.fieldGoals_1pt;
	}

	/**
	 * Get the Player's number of 2pt field goals made.
	 * 
	 */
	public int getFieldGoals_2pt() {
		return this.fieldGoals_2pt;
	}

	/**
	 * Get the Player's number of 3pt field goals made.
	 * 
	 */
	public int getFieldGoals_3pt() {
		return this.fieldGoals_3pt;
	}

	/**
	 * Set the Player's jersey number if it's a positive number between 1 and 99.
	 */
	public void setJersey(int jersey) throws Exception {
		if (jersey >= 0 && jersey <= 99)
			this.jersey = jersey;
		else
			throw new Exception("Invalid Jersey number. Must be Between 0-99");
	}

	/*
	 * Increment the Player's fouls by 1.
	 */
	public void foul() {
		this.foul++;
	}

	/**
	 * Increment the appropriate field goal type, using a switch that also handles
	 * for invalid data.
	 */
	public void shot(int shotType) throws Exception {
		switch (shotType) {
			case 1:
				this.fieldGoals_1pt++;
				break;
			case 2:
				this.fieldGoals_2pt++;
				break;
			case 3:
				this.fieldGoals_3pt++;
				break;
			default:
				throw new Exception("Invalid shot type. Must be 1, 2, or 3.");
		}
	}

	/**
	 * Get the Player's total points by calculating it by field goal types.
	 */
	public int getPoints() {
		int points = 0;
		points += this.fieldGoals_1pt;
		points += this.fieldGoals_2pt * 2;
		points += this.fieldGoals_3pt * 3;
		return points;
	}

	/**
	 * Display the Player's jersey number, name, # of fouls, and # of points via
	 * getPoints method
	 */
	public void displayStats() {
		System.out.println("Jersey number: " + this.jersey + "\nPlayer name: " + this.name + "\n# of fouls: "
				+ this.foul + "\n# of points: " + getPoints());
	}

	/**
	 * Instead of verifying two players are identical by equal identities.
	 * This method will verify two players are the same by ONLY their jersey number.
	 * This allows the ArrayList.getIndex() method to return a player's by only
	 * checking their jersey number.
	 */
	public boolean equals(Object object) {
		if (!(object instanceof Player))
			return false;

		Player other = (Player) object;
		if (this.jersey == other.getJersey())
			return true;
		else
			return false;

	}
	// End of Player
}
