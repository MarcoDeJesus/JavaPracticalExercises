package steams.tomsawyer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class FlatMapExample {
    public static void main(String args[]) throws IOException {

        Stream<String> stream1 = Files.lines(Paths.get("C:\\Users\\marco_de_jesus\\AppData\\Roaming\\JetBrains\\IdeaIC2021.1\\scratches\\tomsawyer1.txt"));
        Stream<String> stream2 = Files.lines(Paths.get("C:\\Users\\marco_de_jesus\\AppData\\Roaming\\JetBrains\\IdeaIC2021.1\\scratches\\tomsawyer2.txt"));
        Stream<String> stream3 = Files.lines(Paths.get("C:\\Users\\marco_de_jesus\\AppData\\Roaming\\JetBrains\\IdeaIC2021.1\\scratches\\tomsawyer3.txt"));
        Stream<String> stream4 = Files.lines(Paths.get("C:\\Users\\marco_de_jesus\\AppData\\Roaming\\JetBrains\\IdeaIC2021.1\\scratches\\tomsawyer4.txt"));

/*        System.out.println("Stream 1 : " + stream1.count());
        System.out.println("Stream 2 : " + stream2.count());
        System.out.println("Stream 3 : " + stream3.count());
        System.out.println("Stream 4 : " + stream4.count());*/

        Stream<Stream<String>> streamOfStreams = Stream.of(stream1, stream2, stream3, stream4);

        //Stream<String> streamOfLines = streamOfStreams.flatMap(stream -> stream);
        Stream<String> streamOfLines = streamOfStreams.flatMap(Function.identity());

       //System.out.println(streamOfLines.count());

        Function<String, Stream<String>> lineSplitter = line -> Pattern.compile(" ").splitAsStream(line);

        Stream<String> streamOfWords =  streamOfLines.flatMap(lineSplitter)
                .map(word -> word.toLowerCase())
                .filter(word -> word.length() == 4)
                .distinct();

        System.out.println(streamOfWords.count());
    }
}
