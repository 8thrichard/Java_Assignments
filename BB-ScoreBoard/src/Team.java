import java.util.ArrayList;
import java.lang.List;

public class Team {
    private String name;
    private List<Player> players;

    public Team() {
        this.name = "Unknown";
        this.players = new ArrayList<Player>();

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

        // this is the header shoud be, watch friday video

        for (int i =0 ; i < this.players.size(); i++)
        String name = this.Players.get(i).getName();
        int jersey = this.Players.get(i).getJersey();


        System.out.printf("%-10s %-15s %-5s %-5s %-5s%n", "Name", "Jersey Number", "Fouls", "1pt", "2pt", "3pt");

        for (Player player : this.players) {
            String name = player.getName();
            int jersey = player.getJersey();
            int fouls = player.getFouls();
            int fg1pt = player.getFieldGoals_1pt();
            int fg2pt = player.getFieldGoals_2pt();
            int fg3pt = player.getFieldGoals_3pt();

        /* System.out.printf("%-2d %15s %5d, jersey, name, foul); */
        
        System.out.println(jersey + " " + name);

    }

    // Team cat Fouls =0 Points = 3

    public void displayTeamStats() {
        int totalFouls = getTeamFouls();
        int totalPoints = getTeamPoints();
        System.out.println("Team " + this.name + " Fouls=" + totalFouls + " Points=" + totalPoints);
    }

    public void displayDetailStats() {
        // Header
        System.out.printf("%-10s %-15s %-5s %-5s %-5s%n", "Name", "Jersey Number", "Fouls", "1pt", "2pt", "3pt");

        for (Player player : this.players) {
            String name = player.getName();
            int jersey = player.getJersey();
            int fouls = player.getFouls();
            int fg1pt = player.getFieldGoals_1pt();
            int fg2pt = player.getFieldGoals_2pt();
            int fg3pt = player.getFieldGoals_3pt();

            System.out.printf("%-10s %-15s %-5d %-5d %-5d %-5d%n", name, jersey, fouls, fg1pt, fg2pt, fg3pt);
        }
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