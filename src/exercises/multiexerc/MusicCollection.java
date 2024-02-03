package exercises.multiexerc;

import java.util.List;
import java.util.stream.Collectors;

class MusicCollection {
    public static void main(String[] args) {
        List<Song> songs = List.of(
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("No One", 248, "Alicia Keys", Song.Genre.POP),
                new Song("Nothing Else Matters", 386, "Metallica", Song.Genre.METAL),
                new Song("Believer", 216, "Imagine Dragons", Song.Genre.ROCK),
                new Song("Fear of The Dark", 438, "Iron Maiden", Song.Genre.METAL),
                new Song("Enter Sandman", 346, "Metallica", Song.Genre.METAL),
                new Song("The Unforgiven", 348, "Metallica", Song.Genre.METAL),
                new Song("Girl on Fire", 404, "Alicia Keys", Song.Genre.POP)
        );
        Integer popSongsLen = allSongsLenth(songs, Song.Genre.POP);
        long nrOfMettalicaSongs = artistSongsCount(songs, "Metallica");
        List<Song> noPopSongs = filteredSongs(songs, Song.Genre.POP);
        System.out.println("Czas piosenek pop w s: "+popSongsLen);
        System.out.println("Liczba piosenek Metallici: "+nrOfMettalicaSongs);
        System.out.println("Piosenki bez popu: ");
        noPopSongs.forEach(System.out::println);
    }
    private static Integer allSongsLenth(List<Song> songs, Song.Genre genre){
        return songs.stream()
                .filter(x -> x.getGenre().equals(genre))
                .map(Song::getLength)
                .reduce(0, Integer::sum);

    }
    private static long artistSongsCount(List<Song> songs, String artist){
        return songs.stream()
                .filter(x -> x.getArtist().equals(artist))
                .count();
    }
    private static List<Song> filteredSongs(List<Song> songs, Song.Genre genre){
        return songs.stream()
                .filter(song -> !song.getGenre().equals(genre))
                .distinct()
                .toList();
    }
}