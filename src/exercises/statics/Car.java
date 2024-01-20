package exercises.statics;

public class Car {

    private double fuelLevel;
    private boolean engineWorks;
    private boolean klapkaClosed;
    private boolean doorsClosed;
    private boolean engineRunning;

    public double getFuelLevel() {
        return fuelLevel;
    }

    public Car(double fuelLevel, boolean engineWorks, boolean klapkaClosed, boolean doorsClosed, boolean engineRunning) {
        this.fuelLevel = fuelLevel;
        this.engineWorks = engineWorks;
        this.klapkaClosed = klapkaClosed;
        this.doorsClosed = doorsClosed;
        setEngineRunning(engineRunning);

    }

    public void setFuelLevel(double fuelLevel) {
        if(fuelLevel<=0){
            engineRunning = false;
        }
        this.fuelLevel = fuelLevel;
    }

    public boolean isEngineWorks() {
        return engineWorks;
    }

    public void setEngineWorks(boolean engineWorks) {
        if(!engineWorks){
            engineRunning = false;
        }
        this.engineWorks = engineWorks;
    }

    public boolean isKlapkaClosed() {
        return klapkaClosed;
    }

    public void setKlapkaClosed(boolean klapkaClosed) {
        this.klapkaClosed = klapkaClosed;
    }

    public boolean isDoorsClosed() {
        return doorsClosed;
    }

    public void setDoorsClosed(boolean doorsClosed) {
        this.doorsClosed = doorsClosed;
    }

    public boolean isEngineRunning() {
        return engineRunning;
    }

    public void setEngineRunning(boolean engineRunning) {
        int check = start();
        if(check == NO_FUEL || check == ENGINE_FAILURE){
            this.engineRunning = false;
        } else{
            this.engineRunning = engineRunning;
        }

    }

    int ingition(){
        int check = start();
        setEngineRunning(true);
        return  check;
    }
    static final int CORRECT_START = 100;
    static final int ENGINE_FAILURE = 200;
    static final int NO_FUEL = 300;
    static final int KLAPKA_OTWARTA = 400;
    static final int OPEN_DOORS = 500;

    private int start() {
        if (fuelLevel <= 0 || !engineWorks) {
            if (!engineWorks) {
                return ENGINE_FAILURE;
            } else {
                return NO_FUEL;
            }
        } else {
            if (!klapkaClosed) {
                return KLAPKA_OTWARTA;
            } else if (!doorsClosed) {
                return OPEN_DOORS;
            } else {
                return CORRECT_START;
            }
        }

    }

//    public void setEngine(boolean)

    public String status() {
        int statusCode = start();
        String finalStatus;
        System.out.println(statusCode);
        if (statusCode == 100) {
            finalStatus = "Wszystkie systemy sprawne, możesz wyruszyć w bezpieczną podróż";

        } else {
            finalStatus = "Do poprawy: ";
            if (fuelLevel <= 0) {
                finalStatus += "Dolej paliwa ";
            }
            if (!engineWorks) {
                finalStatus += "Napraw silnik ";
            }
            if (!klapkaClosed) {
                finalStatus += "Zamknij klapkę paliwa ";
            }
            if (!doorsClosed) {
                finalStatus += "zamknij drzwi";
            }

        }
        return finalStatus;
    }
}
