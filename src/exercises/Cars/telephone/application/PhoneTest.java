package exercises.Cars.telephone.application;

import exercises.Cars.telephone.logic.Charger;
import exercises.Cars.telephone.model.Telephone;

public class PhoneTest {
    public static void main(String[] args) {
        Telephone telephone = new Telephone("Samsung", "Galaxy S10", 3400, 75);
        Charger charger = new Charger();
        System.out.println(telephone.printInfo());
        charger.charge(telephone);
        System.out.println(telephone.printInfo());

    }
}
