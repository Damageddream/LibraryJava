package exercises.ingheretence;

public class ExaustPArt extends Part {
    private boolean euStandard;

    public ExaustPArt(boolean euStandard) {
        this.euStandard = euStandard;
    }

    public boolean isEuStandard() {
        return euStandard;
    }

    public void setEuStandard(boolean euStandard) {
        this.euStandard = euStandard;
    }
}
