package exercises.polimorph.herowars;

public class BattleApp {
    public static void main(String[] args) {
        Defender jon = new Defender("Jon", 10, 20, 20, 0.2);
        Attacker bob = new Attacker("Bob", 15, 10, 20, 0.2);
        Attacker rollo = new Attacker("Rollo", 20, 10, 20, 0.2);

        Team team1 = new Team("Team1");
        team1.addTeamate(jon);
        team1.addTeamate(bob);
        team1.addTeamate(rollo);

        Defender karl = new Defender("Karl", 10, 25, 20, 0.2);
        Defender larry = new Defender("Larry", 10, 25, 20, 0.2);
        Attacker myron = new Attacker("Myron", 20, 5, 20, 0.2);

        Team team2 = new Team("team2");
        team2.addTeamate(karl);
        team2.addTeamate(larry);
        team2.addTeamate(myron);

        BattleLogic battleLogic = new BattleLogic();

        System.out.println(battleLogic.battle(team1,team2));


    }
}
