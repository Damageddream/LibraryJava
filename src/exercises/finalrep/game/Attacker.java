package exercises.finalrep.game;

public class Attacker extends Character{
    private double attBonus;

    public Attacker(String name, int attackStr, int defStr, int hp, double attBonus) {
        super(name, attackStr, defStr, hp);
        this.attBonus = attBonus;
        setAttackStr(attackStr+attBonus);
    }

    @Override
    public String toString() {
        return "Attacker{" +
                "attBonus=" + attBonus +
                "} " + super.toString();
    }
}
