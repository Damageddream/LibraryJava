package exercises.polimorph.herowars;

public class BattleLogic {
    private double calculateTeamAttack(Team team){
        double teamAttack = 0;
        for (Hero hero : team.getTeam()) {
            teamAttack += hero.getAttackStr();
        }
        return teamAttack;
    }
    private double calculateTeamDefense(Team team){
        double teamDefnese = 0;
        for (Hero hero : team.getTeam()) {
            teamDefnese += hero.getDefenseStr();
        }
        return teamDefnese;
    }
    private double calculateTeamHealt(Team team){
        double teamHealt = 0;
        for (Hero hero : team.getTeam()) {
            teamHealt += hero.getHealt();
        }
        return  teamHealt;
    }
    private double round(double attackersStr, double defendersStr, double defendersHealt){
        if(defendersStr > attackersStr){
            return defendersHealt;
        } else {
            return defendersHealt-(attackersStr - defendersStr);
        }
    }
    private String checkWinner(double team1Healt, double team2Healt){
        if(team1Healt > team2Healt){
            return "Wygraną jest drużna "+team1.getTeamName();
        } else if (calculateTeamHealt(team2)> calculateTeamHealt(team1)) {
            return "Wygraną jest drużna "+team2.getTeamName();
        } else {
            return "Remis";
        }
    }
    public String battle(Team team1, Team team2){
        double team1Att = calculateTeamAttack(team1);
        double team1Def = calculateTeamDefense(team1);
        double team1Healt = calculateTeamHealt(team1);

        double team2att = calculateTeamAttack(team1);
        double team2Def = calculateTeamDefense(team2);
        double team2Healt = calculateTeamHealt(team2);

        team2Healt = round(team1Att, team2Def, team2Healt);
        team1Healt = round(team2att, team1Def, team1Healt);

        return
    }

}
