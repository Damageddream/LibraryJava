package exercises.ingheretence;

public class ShopApp {
    public static void main(String[] args) {
        Tire tire = new Tire(2.2, 2.2);
        ExaustPArt exPar = new ExaustPArt(true);
        tire.setModel("auto");
        tire.setId(1);
        tire.setSeriesNr(123);
        tire.setProducentName("bmw");
        exPar.setId(2);
        exPar.setSeriesNr(123);
        System.out.println(tire.getSeriesNr());
        System.out.println(tire.getProducentName());
        System.out.println(exPar.getSeriesNr());
    }
}
