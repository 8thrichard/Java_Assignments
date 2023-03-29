import java.util.ArrayList;
import java.lang.List;

public class Team {

    private String name;
    private List<Player> players;

    public Team() {
        this.name = "Unknown";
        this.players = new ArrayList<Player>();

    }

    public Team(String name) {
        this();
        this.setName(name);
    }

    public void addPlayer(String name, int jersey) throws Exception {
        Player dup = this.getPlayer(jersey);

        if (dup == null) {
            this.players.add(new Player(name, jersey));
        } else {
            throw new Exception("Jersey #" + jersey + " already assigned to " + dup.getName());
        }
    }

    public Player getPlayer(int jersey) throws Exception {
        int index = this.players.indexOf(new Player(jersey));
        if (index == -1)
            return null;
        else
            return this.players.get(index);

    }

    public int getTeamFouls() {
        int teamfouls = 0;
        for (int i = 0; i < this.players.size(); i++)
            teamFouls += this.players.get(i).getFouls();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public void displayDetailStats() {
        System.out.println("=================================================");
        System.out.println("Jersey\tName\tFouls\t1pt\t2pt\t3pt\tTotal");
        System.out.println("======\t======\t=====\t===\t===\t===\t=====");
        
        for (int i = 0; i < this.players.size(); i++) {
            String name = this.players.get(i).getName();
            int jersey = this.players.get(i).getJersey();
            int fouls = this.players.get(i).getFouls();
            int fieldGoals_1pt = this.players.get(i).getfieldGoals_1pt();
            int fieldGoals_2pt = this.players.get(i).getfieldGoals_2pt();
            int fieldGoals_3pt = this.players.get(i).getfieldGoals_3pt();
            int total = this.players.get(i).getPoints();
            
        
            System.out.printf("%4d\t%7s\t%2d\t%2d\t%2d\t%2d\t%2d%n", jersey, name, fouls, 
            fieldGoals_1pt, fieldGoals_2pt, fieldGoals_3pt, total); 
        }

    }

    // Team cat Fouls =0 Points = 3

    public void displayTeamStats() {
        int totalFouls = getTeamFouls();
        int totalPoints = getTeamPoints();
        System.out.println("Team " + this.name + " Fouls=" + totalFouls + " Points=" + totalPoints);
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getTeamPoints() {
        int teamPoints = 0;
        for (int i = 0; i < this.players.size(); i++) {
            teamPoints += this.players.get(i).getPoints();
        }
        return teamPoints;
    }

}