package exercises.polimorph;

public class HospitalApp {
    public static void main(String[] args) {
        Person person1 = new Nurse("Ania","Walendzewicz", 1200,5);
        Person person2 = new Nurse("Wojtek","Mastara", 1300,8);
        Person person3 = new Doctor("Adam", "Lowerska", 5000, 1000);

        Hospital hospital = new Hospital();
        hospital.addWokrker(person1);
        hospital.addWokrker(person2);
        hospital.addWokrker(person3);
        hospital.getInfo();

    }
}
