package exercises.repetition.enums;

public enum Status {
    NEW("nowe"),
    PAID("opłacone"),
    SHIPPED("wysłane"),
    DELIVERED("dostarczone"),
    CANCELLED("anulowane");
    private String name;

    Status(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
