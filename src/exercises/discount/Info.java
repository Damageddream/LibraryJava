package exercises.discount;

public class Info {
    private String getNameInfo(Client client){
        if(client.getFirstName() == null && client.getLastName() == null){
            return "Witaj nieznajomy";
        } else if (client.getLastName() == null) {
            return "Witaj " + client.getFirstName();
        } else if (client.getFirstName() == null) {
            return "Dzień dobry pan/pani "+client.getLastName();
        } else  {
            return "Witaj " + client.getFirstName() + " " + client.getLastName();
        }
    };
    private String getPriceInfo(double price){
        return "Kwota przed rabatem: " + price;
    }

    private String getDiscountInfo(double price, Client client){
        DiscountService discountService = new DiscountService();
        double discountPrice = discountService.calculateDiscountPrice(client, price);
        return "Do zapłaty (po rabacie): " + discountPrice;
    }

    public String getFullInfo(Client client, double price){
        return getNameInfo(client) + "\n" + getPriceInfo(price)
                + "\n" + getDiscountInfo(price, client);
    }
}
