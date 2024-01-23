package exercises.polimorph.herowars;

public class BattleLogic {
//    private double calculateTeamAttack(Team team){
//        double teamAttack = 0;
//        for (Hero hero : team.getTeam()) {
//            teamAttack += hero.getAttackStr();
//        }
//        return teamAttack;
//    }
//    private double calculateTeamDefense(Team team){
//        double teamDefnese = 0;
//        for (Hero hero : team.getTeam()) {
//            teamDefnese += hero.getDefenseStr();
//        }
//        return teamDefnese;
//    }
//    private double calculateTeamHealt(Team team){
//        double teamHealt = 0;
//        for (Hero hero : team.getTeam()) {
//            teamHealt += hero.getHealt();
//        }
//        return  teamHealt;
//    }
    private void round(Team team1, Team team2){
      if(team1.getTeamAttStr() > team2.getTeamDefStr()) {
            team2.setTeamHealt(team2.getTeamHealt()-(team1.getTeamAttStr()-team2.getTeamDefStr()));
        }
    }
    private String checkWinner(Team team1, Team team2){

        if(team1.getTeamHealt() > team2.getTeamHealt()){
            return "Wygraną jest drużna "+team1.getTeamName();
        } else if (team2.getTeamHealt()> team1.getTeamHealt()) {
            return "Wygraną jest drużna "+team2.getTeamName() + " zdrowie druzyny: "
                    +team2.getTeamHealt()+" zdrowie pokonanej drużyny: "+ team1.getTeamHealt();
        } else {
            return "Remis";
        }
    }
    public String battle(Team team1, Team team2){

        round(team1,team2);
        round(team2, team1);
        return checkWinner(team1,team2);

    }

}
