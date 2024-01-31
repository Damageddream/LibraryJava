package exercises.iterexerc;

import java.util.*;

public class IterExerc {
    public static void main(String[] args) {
        TreeMap<String, Person> people = new TreeMap<>();
        Person person = new Person("Mar", "Grab", 23);
        Person person1 = new Person("Woj", "Lor", 13);
        Person person2 = new Person("Kar", "Aor", 42);
        people.put(person.getName(), person);
        people.put(person1.getName(), person1);
        people.put(person2.getName(), person2);
        Set<String> lastNames = people.keySet();
        Collection<Person> values = people.values();
        Iterator<Person> pepIter = values.iterator();
        while (pepIter.hasNext()){
            System.out.println(pepIter.next());
        }

    }
}
