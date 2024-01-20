package exercises.statics;

public class Student {

    private static int numbersOfStudents = 0;
    private String name;
    private  String lastName;

    public static int getNumbersOfStudents() {
        return numbersOfStudents;
    }

    public static void setNumbersOfStudents(int numbersOfStudents) {
        Student.numbersOfStudents = numbersOfStudents;
    }

    private int indexId;

    public Student(String name, String lastName, int indexId){
        this.name = name;
        this.lastName = lastName;
        this.indexId = indexId;
        numbersOfStudents++;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }
}
