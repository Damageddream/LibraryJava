package exercises.ingheretence;

public class Bootcamp extends OnlineCourse{
    private String coachName;
    private String coachLastName;
    private double consulatationHours;

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public String getCoachLastName() {
        return coachLastName;
    }

    public void setCoachLastName(String coachLastName) {
        this.coachLastName = coachLastName;
    }

    public double getConsulatationHours() {
        return consulatationHours;
    }

    public void setConsulatationHours(double consulatationHours) {
        this.consulatationHours = consulatationHours;
    }
}
