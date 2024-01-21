package exercises.ingheretence;

public class StacionaryCourse extends Course  {
    private String place;
    private int classesNr;

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public int getClassesNr() {
        return classesNr;
    }

    public void setClassesNr(int classesNr) {
        this.classesNr = classesNr;
    }
}
