package exercises.finalrep.game;

public class Team {
    private String teamName;
    private static final int TEAM_SIZE = 3;
    private Character[] team;
    private int teamSize = 0;
    private double totalAtt;
    private double totalDeff;
    private double totalHp;

    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new Character[TEAM_SIZE];
    }
    public void add(Character ch){
        team[teamSize] = ch;
        teamSize++;
    }

    public String getTeamName() {
        return teamName;
    }

    public Character[] getTeam() {
        return team;
    }

    public double getTotalAtt() {
        return totalAtt;
    }

    public void setTotalAtt(double totalAtt) {
        this.totalAtt = totalAtt;
    }

    public double getTotalDeff() {
        return totalDeff;
    }

    public void setTotalDeff(double totalDeff) {
        this.totalDeff = totalDeff;
    }

    public double getTotalHp() {
        return totalHp;
    }

    public void setTotalHp(double totalHp) {
        this.totalHp = totalHp;
    }

    private  void sum(){
        double totalAtt = 0;
        double totalDeff = 0;
        double totalHp = 0;
        for (Character character : team) {
            totalAtt += character.getAttackStr();
            totalDeff += character.getDefStr();
            totalHp += character.getHp();
        }
        this.setTotalAtt(totalAtt);
        this.setTotalDeff(totalDeff);
        this.setTotalHp(totalHp);
    }
}
