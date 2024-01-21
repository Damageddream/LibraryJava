package exercises.ingheretence;

public class CourseApp {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setEtCourse(12);
        bootcamp.setCoachName("Martin");
        bootcamp.setCoachLastName("Wowe");
        bootcamp.setId(1);
        bootcamp.setDescribtion("Dobry kurs szybki");
        bootcamp.setPrice(200);
        bootcamp.setConsulatationHours(10);
        bootcamp.setVideoTime(50);
        bootcamp.setName("Kurs Jav");
        System.out.println("Nazwa kursu: "+bootcamp.getName());
        System.out.println("Opis kursu: "+bootcamp.getDescribtion());
        System.out.println("Ilość materiału: "+bootcamp.getVideoTime()+" godzin");
        System.out.println("Cena kursu: " +bootcamp.getPrice());
        System.out.println("Przewydiwywany czas ukończe nia: "+bootcamp.getEtCourse());
        System.out.println("Imie trenera: "+bootcamp.getCoachName());
        System.out.println("naziwsko trenera: "+bootcamp.getCoachLastName());
    }
}
