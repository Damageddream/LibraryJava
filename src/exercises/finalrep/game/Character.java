package exercises.finalrep.game;

public class Character {
    private String name;
    private double attackStr;
    private double DefStr;
    private double hp;

    public Character(String name, double attackStr, double defStr, double hp) {
        this.name = name;
        this.attackStr = attackStr;
        DefStr = defStr;
        this.hp = hp;
    }

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

    public double getDefStr() {
        return DefStr;
    }

    public void setDefStr(double defStr) {
        DefStr = defStr;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", attackStr=" + attackStr +
                ", DefStr=" + DefStr +
                ", hp=" + hp +
                '}';
    }
}
