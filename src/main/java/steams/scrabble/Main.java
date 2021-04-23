package steams.scrabble;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.Locale;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Main {

    //https://introcs.cs.princeton.edu/java/data/words.shakespeare.txt

    public static void main(String args[]) throws IOException {

        Set<String> shakespeareWords =
                Files.lines(Paths.get("C:\\Users\\marco_de_jesus\\AppData\\Roaming\\JetBrains\\IdeaIC2021.1\\scratches\\words.shakespeare.txt"))
                .map(word -> word.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());

        Set<String> scrabble =
                Files.lines(Paths.get("C:\\Users\\marco_de_jesus\\AppData\\Roaming\\JetBrains\\IdeaIC2021.1\\scratches\\words.utf-8.txt"))
                .map(word -> word.toLowerCase(Locale.ROOT))
                .collect(Collectors.toSet());

        System.out.println("# words of Shakespeare: " + shakespeareWords.size());
        System.out.println("# words of Scrabble: " + scrabble.size());

        final int [] scrabbleENScore = {
                //a, b, c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z
                  1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 19
        };

        Function<String, Integer> score =
                word -> word.chars().map(letter -> scrabbleENScore[letter - 'a']).sum();

        ToIntFunction<String> scoreInt =
                word -> word.chars().map(letter -> scrabbleENScore[letter - 'a']).sum();

        System.out.println("Score of hello: " + scoreInt.applyAsInt("hello"));

        String bestWord = shakespeareWords.stream()
                .filter(word -> scrabble.contains(word))
                .max(Comparator.comparing(score))
                .get();

        System.out.println("The Best word: " + bestWord);

        IntSummaryStatistics summaryStatistics = shakespeareWords.stream().parallel()
                .filter(scrabble::contains)
                .mapToInt(scoreInt)
                .summaryStatistics();

        System.out.println("Stats: " + summaryStatistics);

    }
}
