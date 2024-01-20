package exercises.statics;

public class University {
    public static void main(String[] args) {
        Student student1 = new Student("John", "Kowalskie", 1);
        Student student2 = new Student("Marry", "Alos", 2);
        System.out.println(Student.getNumbersOfStudents());

    }
}
