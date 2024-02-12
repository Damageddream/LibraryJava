package exercises.finalrep.enums;

public enum Pizza {
    MARGHERITA("tomato", "gouda"),
    CAPRICIOSA("tomato", "gouda", "mushrooms"),
    PROSCIUTTO("tomato", "gouda", "ham");
    private String souce;
    private String cheese;
    private String topping;

    Pizza(String souce, String cheese) {
        this.souce = souce;
        this.cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "souce='" + souce + '\'' +
                ", cheese='" + cheese + '\'' +
                ", topping='" + topping + '\'' +
                "} " + super.toString();
    }

    Pizza(String souce, String cheese, String topping) {
        this(souce, cheese);
        this.topping = topping;
    }
}
