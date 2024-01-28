package exercises.filesexerc;

public class Client {
    private String name;
    private String country;
    private double salary;
    private int id;


    public Client(String name, String country, double salary, int id) {
        this.name = name;
        this.country = country;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
