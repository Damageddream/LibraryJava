package exercises.objectmethods;

public class DataStore {


    private static final int MAX_COMPUTERS = 100;
    private Computer[] computerBase = new Computer[MAX_COMPUTERS];

    private int computerEquity;

    public Computer[] getComputerBase() {
        return computerBase;
    }

    public void setComputerBase(Computer[] computerBase) {
        this.computerBase = computerBase;
    }

    public int getComputerEquity() {
        return computerEquity;
    }

    public void setComputerEquity(int computerEquity) {
        this.computerEquity = computerEquity;
    }

    public void addComputer(Computer computer){
        computerBase[computerEquity] = computer;
        computerEquity++;
    }
    public int checkAvailability(Computer computer){
        int sameComputerNr = 0;
        for (int i = 0; i < computerEquity; i++) {
            if(computerBase[i].equals(computer)){
                sameComputerNr += 1;
            }
        }
        return  sameComputerNr;
    }
}
