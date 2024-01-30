package exercises.array;

public class PersonDatabase {
    private static final int STARING = 1;
    public Person[] persons;
    private int personsNr;

    public PersonDatabase() {
        this.persons = new Person[STARING];
    }
    public void add(Person p){
        if(p == null){
            throw new NullPointerException("Należy podać osobę");
        }
        boolean fullArray = true;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i] == null){
                persons[i] = p;
                fullArray = false;
            }
            if(persons[i] == null){
                fullArray = false;
            }
        }
        if(fullArray){
            Person[] secondArr = new Person[persons.length*2];
            System.arraycopy(persons,0,secondArr,0, persons.length);
            persons = secondArr;
            persons[persons.length-1] = p;
        }

    }
    public void removePerson(Person p){
        if(p == null){
            throw new NullPointerException("Należy podać osobę");
        }
        boolean personDel = false;
        for (int i = 0; i < persons.length; i++) {
            if(persons[i].equals(p) && !personDel){
                persons[i] = null;
                personDel = true;
            }
            if(personDel && i<persons.length-1){
                persons[i] = persons[i+1];
            }
            if(personDel && i==persons.length-1){
                persons[i] = null;
            }
        }
    }
    public Person get(int index){
        return persons[index];
    }
    public int size(){
        int sizeNr = 0;
        for (Person person : persons) {
            if(person != null){
                sizeNr++;
            }
        }
        return sizeNr;
    }
}
