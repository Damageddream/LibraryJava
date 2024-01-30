package exercises.array;

public class TestApp {
    public static void main(String[] args) {
        Person person = new Person("Mar", "war", "123");
        Person person2 = new Person("Low", "Kar", "343");
        Person person3 = new Person("Hol", "Ire", "593");
        Person person4 = new Person("pru", "Mry", "111");
        Person person5 = new Person("Mar", "war", "123");

        PersonDatabase personDatabase = new PersonDatabase();
        personDatabase.add(person);
        personDatabase.add(person2);
        personDatabase.add(person3);
        personDatabase.add(person4);

        for (Person person1 : personDatabase.persons) {
            System.out.println(person1);
        }
        personDatabase.removePerson(person2);
        System.out.println("...............");
        for (Person person1 : personDatabase.persons) {
            System.out.println(person1);
        }

    }

}
