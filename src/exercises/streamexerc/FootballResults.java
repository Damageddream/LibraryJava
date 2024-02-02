package exercises.streamexerc;

import java.util.Objects;

public class FootballResults {
    private String homeName;
    private String guestName;
    private int goalsFor;
    private int goalsAgainst;

    public FootballResults(String homeName, String guestName, int goalsFor, int goalsAgainst) {
        this.homeName = homeName;
        this.guestName = guestName;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }

    public String getHomeName() {
        return homeName;
    }

    public void setHomeName(String homeName) {
        this.homeName = homeName;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public int getGoalsFor() {
        return goalsFor;
    }

    public void setGoalsFor(int goalsFor) {
        this.goalsFor = goalsFor;
    }

    public int getGoalsAgainst() {
        return goalsAgainst;
    }

    public void setGoalsAgainst(int goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    @Override
    public String toString() {
        return "FootballResults{" +
                "homeName='" + homeName + '\'' +
                ", guestName='" + guestName + '\'' +
                ", goalsFor=" + goalsFor +
                ", goalsAgainst=" + goalsAgainst +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballResults that = (FootballResults) o;
        return goalsFor == that.goalsFor && goalsAgainst == that.goalsAgainst && Objects.equals(homeName, that.homeName) && Objects.equals(guestName, that.guestName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeName, guestName, goalsFor, goalsAgainst);
    }
    public int getResultDifference() {
        return this.getGoalsFor() - this.getGoalsAgainst();
    }
    public void printResult(){
        System.out.printf("%s - %s (%d:%d)", homeName, guestName, goalsFor, goalsAgainst);

    }
    public int sumOfGoals(){
      return goalsFor + goalsAgainst;
    };


}
