package exercises.discount;

class DiscountApp {
    public static void main(String[] args) {
        Client client1 = new Client("Jan", "Kowalski", true);
        double price1 = 1100;

        Client client2 = new Client("Karol", "Nowak", false);
        double price2 = 1100;

        Info info = new Info();
        String info1 = info.getFullInfo(client1, price1);
        String info2 = info.getFullInfo(client2, price2);

        System.out.println(info1);
        System.out.println(info2);
    }
}