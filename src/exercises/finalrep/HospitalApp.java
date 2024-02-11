package exercises.finalrep;

public class HospitalApp {
    public static void main(String[] args) {
        Doctor emp1 = new Doctor("Lor", "Kor", 4000, 1.1);
        Nurse emp2 = new Nurse("Rir", "Bir", 3000, 5);
        Nurse emp3 = new Nurse("Min", "Kelo", 3000, 3);

        Hospital employees = new Hospital();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        for (Person hospitalEmployee : employees.getHospitalEmployees()) {
            System.out.println(hospitalEmployee);
        }

    }
}
