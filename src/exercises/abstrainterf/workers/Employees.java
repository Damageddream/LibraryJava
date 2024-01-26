package exercises.abstrainterf.workers;

public class Employees {

    private static final int MAX_EMP = 3;
    private Emplyee[] employess;
    private int emplNr;

    public Employees() {
        this.employess = new Emplyee[MAX_EMP];
        this.emplNr = 0;
    }



    public void addEmployee(Emplyee emplyee){
        this.employess[emplNr] = emplyee;
        this.emplNr++;
    }

    public String getInfo(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < emplNr; i++) {
            String formmated = "%s %s, wypłata miesięczna: %.2f, wypłata roczna: %.2f %n";
            sb.append(formmated.formatted(employess[i].getName()
            , employess[i].getLastName(), employess[i].monthlyEarnings(), employess[i].yearlyEarnings()));
        }
        String companyMonthly = "Suma miesięcznych wynagrodzeń " + getComapnyMonthlyExpen()+"\n";
        String comapnyYEarly = "Suma rocznych wynagrodzeń" + getComapnyYearlyExpen();
        sb.append(companyMonthly);
        sb.append(comapnyYEarly);

       return sb.toString();
    }
    private double getComapnyMonthlyExpen(){
        double resulet = 0;
        for (int i = 0; i < emplNr; i++) {
            resulet += employess[i].monthlyEarnings();
        }
        return  resulet;
    }
    private  double getComapnyYearlyExpen(){
        double result = 0;
        for (int i = 0; i < employess.length; i++) {
            result += employess[i].yearlyEarnings();
        }
        return  result;
    }


}
