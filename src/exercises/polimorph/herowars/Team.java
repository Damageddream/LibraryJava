package exercises.polimorph.herowars;

public class Team {
    private static final int TEAM_NUMBER = 3;
//    private Hero[] team =
    private String teamName;
    private Hero[] team;
    private int teamCurrentNr = 0;
    private double teamAttStr;
    private double teamDefStr;
    private double teamHealt;

    public double getTeamAttStr() {
        return teamAttStr;
    }

    public void setTeamAttStr(double teamAttStr) {
        this.teamAttStr = teamAttStr;
    }

    public double getTeamDefStr() {
        return teamDefStr;
    }

    public void setTeamDefStr(double teamDefStr) {
        this.teamDefStr = teamDefStr;
    }

    public double getTeamHealt() {
        return teamHealt;
    }

    public void setTeamHealt(double teamHealt) {
        this.teamHealt = teamHealt;
    }

    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new Hero[TEAM_NUMBER];
        this.teamAttStr = 0;
        this.teamDefStr = 0;
        this.teamHealt  =0;
    }

    public Hero[] getTeam() {
        return team;
    }

    public void setTeam(Hero[] team) {
        this.team = team;
    }

    public int getTeamCurrentNr() {
        return teamCurrentNr;
    }

    public void setTeamCurrentNr(int teamCurrentNr) {
        this.teamCurrentNr = teamCurrentNr;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public void addTeamate(Hero hero){
        team[teamCurrentNr] = hero;
        teamHealt += hero.getHealt();
        teamAttStr += hero.getAttackStr();
        teamDefStr += hero.getDefenseStr();
        teamCurrentNr++;
    }
}
