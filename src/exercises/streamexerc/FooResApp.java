package exercises.streamexerc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FooResApp {
    public static void main(String[] args) {
        List<FootballResults> results = Stream.of(
                new FootballResults("ManU", "ManCit", 5, 0),
                new FootballResults("Pool", "Spurs", 1, 2),
                new FootballResults("Burnley", "WestHam", 0, 0),
                new FootballResults("Newcast", "AstonVill", 2, 3),
                new FootballResults("Wolfs", "Bournm", 3, 1),
                new FootballResults("CrystalPal", "Luton", 1, 0),
                new FootballResults("Nottingham", "Chelsea", 1, 1),
                new FootballResults("Arsenal", "Everton", 3, 0)).toList();
        System.out.println("Wszystkie mecze: ");
        results.stream().sorted(Comparator.comparingInt(FootballResults::getResultDifference).reversed())
               .forEach(FootballResults::printResult);
        List<FootballResults> namedList = filteredResults(results.stream(), "Arsenal");
        System.out.println("Mecze Arsenalu");
        for (FootballResults footballResults : namedList) {
            System.out.println(footballResults);
        }
        Integer sumOfGoals = results.stream().map(FootballResults::sumOfGoals).reduce(0, Integer::sum);
        System.out.println("Łączna liczba goli:" +sumOfGoals);
        String[]  guesNames =  results.stream().map(FootballResults::getGuestName).toArray(String[]::new);

       String[] homeNames =  results.stream().map(FootballResults::getHomeName).toArray(String[]::new);
        long count = Stream.of(guesNames, homeNames).flatMap(Arrays::stream).distinct().count();
        System.out.println("Liczba druyyn biorących udział: "+count);



    }
    private static List<FootballResults> filteredResults (Stream<FootballResults> results, String name){
        return results.filter(x -> x.getGuestName().equals(name) || x.getHomeName().equals(name)).collect(Collectors.toList());
    }

}
