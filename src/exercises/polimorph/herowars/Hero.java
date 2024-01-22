package exercises.polimorph.herowars;

public class Hero {
    private String name;
    private double attackStr;
    private double defenseStr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAttackStr() {
        return attackStr;
    }

    public void setAttackStr(double attackStr) {
        this.attackStr = attackStr;
    }

    public double getDefenseStr() {
        return defenseStr;
    }

    public void setDefenseStr(double defenseStr) {
        this.defenseStr = defenseStr;
    }

    public double getHealt() {
        return healt;
    }

    public void setHealt(double healt) {
        this.healt = healt;
    }

    public Hero(String name, double attackStr, double defenseStr, double healt) {
        this.name = name;
        this.attackStr = attackStr;
        this.defenseStr = defenseStr;
        this.healt = healt;
    }

    private double healt;
}
