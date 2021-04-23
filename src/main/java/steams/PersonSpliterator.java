package steams;

import java.util.Spliterator;
import java.util.function.Consumer;

public class PersonSpliterator implements Spliterator<Persona> {
    private final Spliterator<String> lineSpliterator;
    private String name;
    private int age;
    private String city;

    public PersonSpliterator(Spliterator<String> lineSpliterator) {
        this.lineSpliterator = lineSpliterator;
    }

    @Override
    public boolean tryAdvance(Consumer<? super Persona> action) {
        if (this.lineSpliterator.tryAdvance(line -> this.name = line) &&
            this.lineSpliterator.tryAdvance(line -> this.age = Integer.parseInt(line)) &&
            this.lineSpliterator.tryAdvance(line -> this.city = line)){

            Persona p = new Persona(name, age, city);
            action.accept(p);

            return true;
        }
        return false;
    }

    @Override
    public Spliterator<Persona> trySplit() {
        return null;
    }

    @Override
    public long estimateSize() {
        return lineSpliterator.estimateSize() / 3;
    }

    @Override
    public int characteristics() {
        return lineSpliterator.characteristics();
    }
}
