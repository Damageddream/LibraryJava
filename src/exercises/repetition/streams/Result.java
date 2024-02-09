package exercises.repetition.streams;

import java.util.Objects;

public class Result {
    private String hostName;
    private String guestName;
    private int goalsFor;
    private int goalsAgainst;

    @Override
    public String toString() {
        return "Result{" +
                "hostName='" + hostName + '\'' +
                ", guestName='" + guestName + '\'' +
                ", goalsFor=" + goalsFor +
                ", goalsAgainst=" + goalsAgainst +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Result result = (Result) o;
        return goalsFor == result.goalsFor && goalsAgainst == result.goalsAgainst && Objects.equals(hostName, result.hostName) && Objects.equals(guestName, result.guestName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostName, guestName, goalsFor, goalsAgainst);
    }

    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
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

    public Result(String hostName, String guestName, int goalsFor, int goalsAgainst) {
        this.hostName = hostName;
        this.guestName = guestName;
        this.goalsFor = goalsFor;
        this.goalsAgainst = goalsAgainst;
    }
    public void printScore(){
        System.out.println(hostName+" - "+guestName+"("+goalsFor+":"+goalsAgainst+")");
    }
    public int getGoalsDiff(){
        return -(goalsFor-goalsAgainst);
    }
    public int getSumOfGolas(){
        return goalsFor+goalsAgainst;
    }
}
