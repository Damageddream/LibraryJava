package exercises.repetition.dziedzicz;

public class Bootcamp extends Online{
    private String mentorName;
    private String mentorLastName;
    private int consultationHours;

    public String getMentorName() {
        return mentorName;
    }

    public void setMentorName(String mentorName) {
        this.mentorName = mentorName;
    }

    public String getMentorLastName() {
        return mentorLastName;
    }

    public void setMentorLastName(String mentorLastName) {
        this.mentorLastName = mentorLastName;
    }

    public int getConsultationHours() {
        return consultationHours;
    }

    public void setConsultationHours(int consultationHours) {
        this.consultationHours = consultationHours;
    }

    public Bootcamp(String id, double price, String describtion, double videoLengthMin, double estimatedTimeToFinish, String mentorName, String mentorLastName, int consultationHours) {
        super(id, price, describtion, videoLengthMin, estimatedTimeToFinish);
        this.mentorName = mentorName;
        this.mentorLastName = mentorLastName;
        this.consultationHours = consultationHours;
    }
}
