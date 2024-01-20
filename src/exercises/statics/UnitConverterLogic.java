package exercises.statics;

public class UnitConverterLogic {
    static final double CUPS_TO_ML = 250;
    static final double SPOON_TO_ML = 15;
    static final double TEASPOON_TO_ML = 5;
    static public String cupsToMl(double cups){
        return cups+" to po przeliczeniu "+(cups*CUPS_TO_ML)+" ml";
    }
    static public String spoonsToM(double spoons){
        return spoons+" to po przeliczeniu "+(spoons*SPOON_TO_ML)+" ml";
    }
    static public String littleSpoonsToMl(double littleSpoons){
        return littleSpoons+" to po przeliczeniu "+(littleSpoons*TEASPOON_TO_ML)+" ml";
    }
}
