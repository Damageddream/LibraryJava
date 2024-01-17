package exercises.Cars.telephone.logic;

import exercises.Cars.telephone.model.Telephone;

public class Charger {
    public void charge(Telephone telephone){
        telephone.setChargeLevel(telephone.getChargeLevel()+1);
    }
}
