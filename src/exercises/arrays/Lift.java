package exercises.arrays;

public class Lift {
    private Person[] lift;

    public Lift(){
        this.lift = new Person[4];
    }
    public void add(Person person){
        if(lift[0] != null && lift[1] != null && lift[2] != null && lift[3] != null){
            System.out.println("W windzie nie ma już miejsca");
        } else if (lift[0] == null) {
            lift[0] = person;
        } else if (lift[1] == null) {
            lift[1] = person;
        } else if(lift[2] == null) {
            lift[2] = person;
        } else {
            lift[3] = person;
        }
    }
    public void start(Lift a) {
        int totalWeigth = 0;
        if(a.getLift()[0] != null){
            totalWeigth += a.getLift()[0].getWeight();
        }
        if(a.getLift()[1] != null){
            totalWeigth += a.getLift()[1].getWeight();
        }
        if(a.getLift()[2] != null){
            totalWeigth += a.getLift()[2].getWeight();
        }
        if(a.getLift()[3] != null){
            totalWeigth += a.getLift()[3].getWeight();
        }
        if(totalWeigth > 400){
            System.out.println("Winda jest przeciążona o "+(totalWeigth - 400));
        } else {
            System.out.println("Winda wystartowała");
        }

    }

    public void emptyLift(){
        this.lift[0] = null;
        this.lift[1] = null;
        this.lift[2] = null;
        this.lift[3] = null;
        System.out.println(this.lift[0]);
        System.out.println("Winda opróżniona");
    }

    public Person[] getLift() {
        return lift;
    }

    public void setLift(Person[] lift) {
        this.lift = lift;
    }
}
