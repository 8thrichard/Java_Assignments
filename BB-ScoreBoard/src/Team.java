import java.util.ArrayList;
import java.util.List;

public class Team {

	private String name;
	private List<Player> players;

	/**
	 * default constructor
	 */
	public Team() {
		this.name = "Unknown";
		this.players = new ArrayList<Player>();
	}

	/**
	 * Overload constructor
	 */
	public Team(String name) {
		this();
		this.setName(name);
	}

	/**
	 * This method uses the jersey to add a players name.
	 */
	public void addPlayer(String name, int jersey) throws Exception {
		Player dup = this.getPlayer(jersey);

		if (dup == null)
			this.players.add(new Player(name, jersey));
		else
			throw new Exception("Jersey " + jersey + " has been assigned to " + dup.getName() + "!!");
	}

	/**
	 * This method is used to display Team stats for both teams
	 */
	public void displayTeamStats() {
		System.out.println("Team " + this.name + " Fouls =" + this.getTeamFouls());
		System.out.println("Team " + this.name + " Points =" + this.getTeamPoints());
	}

	/**
	 * This method displays the details stats of the players chosen from the two
	 * Different teams
	 */
	public void displayDetailStats() {
		System.out.println("=================================================");
		System.out.println("Jersey\tName\tFouls\t1pt\t2pt\t3pt\tTotal");
		System.out.println("======\t======\t=====\t===\t===\t===\t=====");

		for (int i = 0; i < this.players.size(); i++) {
			String name = this.players.get(i).getName();
			int jersey = this.players.get(i).getJersey();
			int fouls = this.players.get(i).getFoul();
			int fieldGoals_1pt = this.players.get(i).getFieldGoals_1pt();
			int fieldGoals_2pt = this.players.get(i).getFieldGoals_2pt();
			int fieldGoals_3pt = this.players.get(i).getFieldGoals_3pt();
			int total = this.players.get(i).getPoints();

			System.out.printf("%4d\t%7s\t%2d\t%2d\t%2d\t%2d\t%2d%n", jersey, name, fouls,
					fieldGoals_1pt, fieldGoals_2pt, fieldGoals_3pt, total);

		}
	}

	/**
	 * This method is used to get the player by calling the jersey.
	 * it throws an error when a number under 0 is entered
	 */
	public Player getPlayer(int jersey) throws Exception {

		int index = this.players.indexOf(new Player(jersey));

		if (index == -1)
			return null;
		else
			return this.players.get(index);
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * This method calculates the total team fouls.
	 */

	public int getTeamFouls() {
		int totalFouls = 0;
		for (int i = 0; i < this.players.size(); i++) {
			totalFouls += this.players.get(i).getFoul();
		}
		return totalFouls;
	}

	/**
	 * This method is used the calculate the teams total points
	 */

	public int getTeamPoints() {
		int totalPoints = 0;
		for (int i = 0; i < this.players.size(); i++) {
			totalPoints += this.players.get(i).getPoints();
		}
		return totalPoints;
	}

	/**
	 * This method is used to get the Team name.
	 */

	public String getName() {
		return this.name;
	}

	/**
	 * this method is used to set the Teams' name
	 */

}