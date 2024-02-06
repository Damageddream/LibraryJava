package exercises.repetition.polimor;

public class Hospital {
    private Person[] people;
    private int peopleNr = 0;

    public Hospital() {
        this.people = new Person[peopleNr];
    }
    public void add(Person person){
        people[peopleNr] = person;
        peopleNr++;
    }
    public void getInfo(){
        for (Person person : people) {
            if(person == null){
                continue;
            }
            System.out.println(person.toString());

        }
    }
}
