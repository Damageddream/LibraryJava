package exercises.finalrep;

public class Hospital {
    private Person[] hospitalEmployees;
    private static final int EMPLYEES_LEN = 3;
    private int numOfEmp = 0;

    public Hospital() {
        this.hospitalEmployees = new Person[EMPLYEES_LEN];
    }
    public void add(Person p){
        hospitalEmployees[numOfEmp] = p;
        numOfEmp++;
    }

    public Person[] getHospitalEmployees() {
        return hospitalEmployees;
    }

}
