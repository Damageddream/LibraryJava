package exercises.repetition.que;

public class Tasl {
    private String name;

    @Override
    public String toString() {
        return "Tasl{" +
                "name='" + name + '\'' +
                ", describtion='" + describtion + '\'' +
                ", priority=" + priority +
                '}';
    }

    private String describtion;
    private Priority priority;

    public Tasl(String name, String describtion, Priority priority) {
        this(name, priority);
        this.describtion = describtion;
    }

    public Tasl(String name, Priority priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    enum Priority{
        LOW,
        MODERATE,
        HIGH;
    }
}
