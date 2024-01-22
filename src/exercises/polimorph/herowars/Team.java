package exercises.polimorph.herowars;

public class Team {
    private static final int TEAM_NUMBER = 3;
//    private Hero[] team =
    private String teamName;
    private Hero[] team;
    private int teamCurrentNr = 0;

    public Team(String teamName) {
        this.teamName = teamName;
        this.team = new Hero[TEAM_NUMBER];
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
        teamCurrentNr++;
    }
}
