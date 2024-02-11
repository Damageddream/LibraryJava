package exercises.finalrep.game;

public class Defender extends Character{
    private double defBonus;

    public Defender(String name, double attackStr, double defStr, int hp, double defBonus) {
        super(name, attackStr, defStr, hp);
        this.defBonus = defBonus;
        setDefStr(defStr+defBonus);
    }

    @Override
    public String toString() {
        return "Defender{" +
                "defBonus=" + defBonus +
                "} " + super.toString();
    }
}
