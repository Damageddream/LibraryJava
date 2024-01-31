package exercises.qexerc;

public enum Priority {
    LOW("low", 3),
    MODERATE("moderate", 2),
    HIGH("high", 1);

    String name;
    int num;

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    Priority(String name, int num) {
        this.name = name;
        this.num = num;
    }

    @Override
    public String toString() {
        return name;
    }
    public static Priority fromDescription(String describtion){
        Priority[] values = values();
        for (Priority value : values) {
            if(value.getName().equals(describtion)){
                return value;
            }

        }
        return null;
    }
}
