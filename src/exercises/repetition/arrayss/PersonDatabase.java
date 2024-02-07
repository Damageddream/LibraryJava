package exercises.repetition.arrayss;

import java.util.Arrays;

public class PersonDatabase {
    private Person[] people;
    private int peopeLength = 1;
    private int peopleNumber = 0;

    public PersonDatabase() {
        this.people = new Person[peopeLength];
    }

    public void add(Person p){
        if(p == null){
            throw new NullPointerException("osoba nie może być null");
        }
        if(people[peopeLength] != null){
            people = Arrays.copyOf(people, peopeLength*2);
        } else{
            people[peopleNumber] = p;
            peopleNumber++;
        }
    }
    public void remove(Person p){
        for (int i = 0; i < people.length; i++) {
            if(people[i].equals(p)){
                people[i] = null;

            }
        }
    }

}
