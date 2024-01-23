package exercises.objectmethods;

public class NotebookShop {
    public static void main(String[] args) {
        Computer adm = new Computer("ADM", 12);
        Computer asus = new Computer("Asus", 10);
        Computer dell = new Computer("Dell", 100);
        Computer adm1 = new Computer("ADM", 12);
        Computer thosiba = new Computer("Thosiba", 100);

        DataStore dataStore = new DataStore();
        dataStore.addComputer(adm1);
        dataStore.addComputer(asus);
        dataStore.addComputer(dell);
        dataStore.addComputer(adm);
        dataStore.addComputer(thosiba);

        System.out.println(dataStore.checkAvailability(adm1));
        for (int i = 0; i < dataStore.getComputerEquity(); i++) {
            System.out.println(dataStore.getComputerBase()[i].toString());
        }

    }
}
