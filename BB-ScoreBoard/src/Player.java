public class Player {

    private String name;
    private String jersey;
    private String fouls;

    public Player() {
        this.name = "unknown";
        this.jersey = 0;
        this.fouls = 0;
    }

    public Player(Srting name, int jersey) throws Exception {
        this();
        this.name = name;
        this.jersey(jersey);

    }

    public String getName() {

        return this.name;
    }

    public int getJersey() {
        return this.jersey;
    }

    public void setName(String Name) {

    }

    public void setjersey(int jersey) throws Exception {
        if (jersey >= 0 && jersey <= 99)
            this.jersey = jersey;
        else
            throw new Exception("Invalid Jersey number. Must be Between 0-99");
    }
}
