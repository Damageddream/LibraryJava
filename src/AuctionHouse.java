public class AuctionHouse {
    public static void main(String[] args) {
        Adress adress = new Adress();
        Person seller = new Person();
        Auction auction1 = new Auction();

        adress.city = "Warszawa";
        adress.postalCode = "50-500";
        adress.street = "Kościuszki";
        adress.homeNo = "24A";
        adress.latNo = 21;

        seller.adress = adress;
        seller.firstName = "Jan";
        seller.lastName = "Kowalski";

        auction1.seller = seller;
        auction1.descirption = "Konsola dla wymagajacych graczy";
        auction1.price = 999.99;
        auction1.title = "Xbox One";

        Person seller2 = new Person();
        seller2.firstName = "Justyna";
        seller2.lastName = "Adamczyk";

        Auction auction2 = new Auction();
        auction2.seller = seller2;
        auction2.price = 3999;
        auction2.descirption = "Niesamowity telefon z trzema obiektywami";
        auction2.title = "Samsung S20";

        System.out.println("Aukcja " + auction1.title + " " + auction1.descirption + " w cenie "
                + auction1.price + " wystawiona przez " + auction1.seller.firstName + " " + auction1.seller.lastName);

        System.out.println("Aukcja " + auction2.title + " " + auction2.descirption + " w cenie "
                + auction1.price + " wystawiona przez " + auction2.seller.firstName + " " + auction2.seller.lastName);


    }
}
