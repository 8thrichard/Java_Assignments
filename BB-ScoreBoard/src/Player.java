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

    public int getFoul() {
        return this.foul;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFieldGoals_1pt() {
        return this.fieldGoals_1pt;
    }

    public int getFieldGoals_2pt() {
        return this.fieldGoals_2pt;
    }

    public int getFieldGoals_3pt() {
        return this.fieldGoals_3pt;
    }

    public void setJersey(int jersey) throws Exception {
        if (jersey >= 0 && jersey <= 99)
            this.jersey = jersey;
        else
            throw new Exception("Invalid Jersey number. Must be Between 0-99");
    }

    public void foul(){
        this.foul++;
    }

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
                throw new Exception("Invalid shot type. Must be 1, 2, or 3."); }
        }

    public int getPoints() {
        int points = 0;
        points += this.fieldGoals_1pt;
        points += this.fieldGoals_2pt * 2;
        points += this.fieldGoals_3pt * 3;
        return points;
    }

    public void displayStats() {
        System.out.println("Jersey number: " + this.jersey + "\nPlayer name: " + this.name + "\n# of fouls: "
                + this.foul + "\n# of points: " + getPoints());
    }

    public boolean equals(Object object) {
        if (!(object instanceof Player))
            return false;

        Player other = (Player) object;
        if (this.jersey == other.getJersey())
            return true;
        else
            return false;

    }

}