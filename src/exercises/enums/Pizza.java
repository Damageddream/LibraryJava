package exercises.enums;

public enum Pizza {
    MARGHERTIA("pomidorowy", "gouda", "margherita"),
    CAPRICIOSA("pomidorowy", "gouda", "pieczarki", "capriciosa"),
    PROSCIUTTO("pomidorowy", "gouda", "szynka", "prosciutto");

    public String getDescribtion() {
        return describtion;
    }

    private final String sos;
    private final String ser;
    private String topping;
    private final String describtion;

    public String getSos() {
        return sos;
    }

    public String getSer() {
        return ser;
    }

    public String getTopping() {
        return topping;
    }

    private Pizza(String sos, String ser, String describtion) {
        this.sos = sos;
        this.ser = ser;
        this.describtion = describtion;
    }

    private Pizza(String sos, String ser, String topping, String describtion) {
        this(sos, ser, describtion);
        this.topping = topping;
    }

    @Override
    public String toString() {
        String ifTopping = "";
        if(topping != null){
            ifTopping = ", topping ='" + topping;
        }
        return "Pizza{" +
                "sos='" + sos + '\'' +
                ", ser='" + ser + '\'' +
                ifTopping + '\'' +
                '}';
    }
    public static Pizza fromDescribtion(String desc){
        Pizza[] pizzas = Pizza.values();
        for (Pizza pizza : pizzas) {
            if (pizza.getDescribtion().equals(desc))
                    return pizza;
        }
        return null;
    }

}
