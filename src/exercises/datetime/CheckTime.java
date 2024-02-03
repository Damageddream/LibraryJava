package exercises.datetime;

import exercises.array.Person;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CheckTime {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String date1 = getDate();
        String date2 =getDate();

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date1Formatted = LocalDate.parse(date1, datePattern);
        LocalDate date2Formatted = LocalDate.parse(date2, datePattern);


        if(date1Formatted.isAfter(date2Formatted)){
            Period between = Period.between(date2Formatted, date1Formatted);
            System.out.println("Późniejsza data to" + date1Formatted);
            printDateInfo(between.getYears(), between.getMonths(), between.getDays());
        } else {
            Period between = Period.between(date1Formatted, date2Formatted);
            System.out.println("Późniejsza data to" + date2Formatted);
            printDateInfo(between.getYears(), between.getMonths(), between.getDays());
        }

    }
    static String getDate(){
        System.out.println("Podaj dzien miesiaca: ");
        String day = sc.nextLine();
        System.out.println("Podaj miesiac: ");
        String month = sc.nextLine();
        System.out.println("Podaj rok");
        String year = sc.nextLine();
        return year+"-"+month+"-"+day;
    }
    static void printDateInfo(int years, int months, int days){
        System.out.printf("Podane daty dzieli %d lat, %d miesięcy, i %d dni", years, months, days);
    }

}
