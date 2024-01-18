package exercises.arrays;

public class LiftRun {
    public static void main(String[] args) {
        Lift lift = new Lift();
        Person person1 = new Person(100,1);
        Person person2 = new Person(100,2);
        Person person3 = new Person(100,3);
//        Person person4 = new Person(100,4);
//        Person person5 = new Person(100,5);

        lift.add(person1);
        lift.add(person2);
        lift.add(person3);
//        lift.add(person4);
//        lift.add(person5);

        lift.start(lift);
        lift.emptyLift();

    }
}
