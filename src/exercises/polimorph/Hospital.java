package exercises.polimorph;

public class Hospital {
    private Person[] hospitalWorkers = new Person[3];
    private int workersNr = 0;
    public void addWokrker(Person person){
        hospitalWorkers[workersNr] = person;
        workersNr++;

    }
    public void getInfo(){
        for (Person hospitalWorker : hospitalWorkers) {
            System.out.println("Imię: "+ hospitalWorker.getName()+
                    " nazwisko: "+hospitalWorker.getLastName()+" Wypłata: "+
                    hospitalWorker.getSalary());
            if(hospitalWorker instanceof Nurse){
                System.out.print(" Nadgodziny: "+(((Nurse) hospitalWorker).getOvertime()));
            } else if (hospitalWorker instanceof  Doctor) {
                System.out.print(" Premia: "+(((Doctor) hospitalWorker).getBonus()));

            }
        }
    }
}
