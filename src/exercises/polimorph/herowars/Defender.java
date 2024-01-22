package exercises.polimorph.herowars;

public class Defender extends Hero {
    private double defenseBonus;

    public Defender(String name, double attackStr, double defenseStr, double healt, double defenseBonus) {
        super(name, attackStr, defenseStr, healt);
        this.defenseBonus = defenseBonus;
        this.calculateDefenseithBonus();
    }

    public double getDefenseBonus() {
        return defenseBonus;
    }

    public void setDefenseBonus(double defenseBonus) {
        this.defenseBonus = defenseBonus;
        this.calculateDefenseithBonus();
    }
    private void calculateDefenseithBonus(){
        this.setAttackStr((this.getDefenseStr()*getDefenseBonus())+getDefenseStr());
    }
}
