package exercises.polimorph.herowars;

public class Attacker extends Hero{
    private double attackBonus;

    public Attacker(String name, double attackStr, double defenseStr, double healt, double attackBonus) {
        super(name, attackStr, defenseStr, healt);
        this.attackBonus = attackBonus;
        this.calculateAttackWithBonus();

    }

    public double getAttackBonus() {
        return attackBonus;
    }

    public void setAttackBonus(double attackBonus) {
        this.attackBonus = attackBonus;
        this.calculateAttackWithBonus();
    }
    private void calculateAttackWithBonus(){
        this.setAttackStr((this.getAttackStr()*getAttackBonus())+getAttackStr());
    }
}
