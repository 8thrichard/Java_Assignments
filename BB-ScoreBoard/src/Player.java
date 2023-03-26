public class Player {

    private String name;
    private int jersey;
    private int foul;
    private int fieldGoals_1pt;
    private int fieldGoals_2pt;
    private int fieldGoals_3pt;

    public Player() {
        this.name = "unknown";
        this.jersey = 0;
        this.foul = 0;
        this.fieldGoals_1pt = 0;
        this.fieldGoals_2pt = 0;
        this.fieldGoals_3pt = 0;
    }

    public Player(String name, int jersey) throws Exception {
        this();
        this.setName(name);
        this.setJersey(jersey);

    }

    public String getName() {

        return this.name;
    }

    public int getJersey() {
        return this.jersey;
    }

    public setName(String name) {
        this.name = name;

    }

    public String getFieldGoals_1pt() {
        return this.fieldGoals_1pt;
    }

    public String getFieldGoals_2pt() {
        return this.fieldGoals_2pt;
    }

    public String getFieldGoals_3pt() {
        return this.fieldGoals_3pt;
    }

    public void setJersey(int jersey) throws Exception {
        if (jersey >= 0 && jersey <= 99)
            this.jersey = jersey;
        else
            throw new Exception("Invalid Jersey number. Must be Between 0-99");
    }
}
