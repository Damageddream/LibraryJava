package exercises.repetition.streams;

import exercises.streamexerc.FootballResults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ResultApp {
    public static void main(String[] args) {
        List<Result> results = Stream.of(
                new Result("ManU", "ManCit", 5, 0),
                new Result("Pool", "Spurs", 1, 2),
                new Result("Burnley", "WestHam", 0, 0),
                new Result("Newcast", "AstonVill", 2, 3),
                new Result("Wolfs", "Bournm", 3, 1),
                new Result("CrystalPal", "Luton", 1, 0),
                new Result("Nottingham", "Chelsea", 1, 1),
                new Result("Arsenal", "Everton", 3, 0)).toList();
        results.stream()
                .sorted(Comparator.comparingInt(Result::getGoalsDiff))
                .forEach(Result::printScore);
        List<Result> filteredListe = filterByName(results.stream(), "Arsenal");
        System.out.println(filteredListe);
        long count = Stream.of(results.stream().map(Result::getHostName).toList(),
                        results.stream().map(Result::getGuestName).toList())
                .flatMap(List::stream)
                .distinct()
                .count();
        System.out.println(count);
        Integer reduce = results.stream().map(Result::getSumOfGolas)
                .reduce(0, Integer::sum);
        System.out.println(reduce);
        int sum = results.stream().mapToInt(Result::getSumOfGolas)
                .sum();
    }

    private static List<Result> filterByName(Stream<Result> stream, String name){
        return stream.filter(x-> x.getGuestName().equals(name) || x.getHostName().equals(name)).toList();

    }
}
