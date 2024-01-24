package exercises.enums;

public enum Status {
    NEW("Nowe"),
    PAID("Opłacone"),
    SHIPPED("Wysłane"),
    DELIVERED("Dostarczone"),
    CANCELLED("Anulowane");

    String describtion;

    Status(String describtion) {
        this.describtion = describtion;
    }

    public String getDescribtion() {
        return describtion;
    }
    public static Status fromDescribtion(String desc){
        Status[] statuses = Status.values();
        for (Status status : statuses) {
            if(status.getDescribtion().equals(desc)){
                return status;
            }

        }
        return  null;
    }


}
