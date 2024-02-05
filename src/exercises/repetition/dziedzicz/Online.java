package exercises.repetition.dziedzicz;

public class Online extends Course{
    private double videoLengthMin;
    private double estimatedTimeToFinish;

    public Online(String id, double price, String describtion, double videoLengthMin, double estimatedTimeToFinish) {
        super(id, price, describtion);
        this.videoLengthMin = videoLengthMin;
        this.estimatedTimeToFinish = estimatedTimeToFinish;
    }

    public double getVideoLengthMin() {
        return videoLengthMin;
    }

    public void setVideoLengthMin(double videoLengthMin) {
        this.videoLengthMin = videoLengthMin;
    }

    public double getEstimatedTimeToFinish() {
        return estimatedTimeToFinish;
    }

    public void setEstimatedTimeToFinish(double estimatedTimeToFinish) {
        this.estimatedTimeToFinish = estimatedTimeToFinish;
    }
}
