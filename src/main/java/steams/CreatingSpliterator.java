package steams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class CreatingSpliterator {
    public static void main(String args[]) {
        Path path = Paths.get("C:\\Users\\marco_de_jesus\\AppData\\Roaming\\JetBrains\\IdeaIC2021.1\\scratches\\people.txt");
        try(Stream<String> lines = Files.lines(path);){

            Spliterator<String> lineSpliterator = lines.spliterator();
            Spliterator<Persona> peopleSpliterator = new PersonSpliterator(lineSpliterator);

            Stream<Persona> people = StreamSupport.stream(peopleSpliterator, false);
            people.forEach(System.out::println);
            //people.forEach(x -> System.out.println(x));

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
