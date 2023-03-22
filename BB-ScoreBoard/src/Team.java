import java.util.ArrayList;
import java.lang.String;

public class Team {
    private String name;
    private List players;

    public Team() {
        this.name = "Unknown";
        this.players = new ArrayList<>(players);

    }

    public void addPlayer(String Name, int jersey) {

        Player dup = this.getPlayer(jersey);
        if (dup == null)
            this.players.add(new Player(name, jersey));
        else
            throw Exception("Jersey #" + jersey + "already assigned to" + dup.getName());
    }

    public Player getPlayer(int jersey) throws Exception {
        int index = this.players.indexOf(new Player(jersey));

        if (index == -1)
            return null;
        else
            return this.players.get(index);

    }

    public void displayDetailStats() {
        for (int i =0 ; i < this.players.size(); i++)
        String name = this.Players.get(i).getName();
        int jersey = this.Players.get(i).getJersey();


        System.out.println(jersey + " " + name);

    }
}