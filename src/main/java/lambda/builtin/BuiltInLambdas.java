package lambda.builtin;

import java.net.Inet4Address;
import java.util.function.*;

public class BuiltInLambdas {

    public void TestBuildint() {
        // Solo acepta un parametro de entrada tipo double
        //DoublePredicate<Integer> test = (x) -> true;

        BiFunction<Integer, Integer, Integer> divide = (x, y) -> x / y;

        IntPredicate testInt = x -> x == 0;

        DoubleFunction<String> area = r -> String.valueOf(Math.PI * r * r);

        //////////////////////////////////

        BiConsumer<String, String> biConsumer = (x, y) -> System.out.println("");
        BiFunction<Integer, Integer, Double> biFunction = (x, y) -> Double.valueOf(x * y);
        BiPredicate<Boolean, String> biPredicate = (x, y) -> true;

        //No retorna nada. es un void.
        // void accept(T t);
        Consumer<Double> consumer = x -> System.out.println(x);

        // Es un get
        // T get();
        Supplier<Integer> supplier = () -> 4;
        supplier.get();

        // pasa un parametro de entrada y regresa un segundo de salida.
        // R apply(T t);
        Function<Integer, String> function = x -> String.valueOf(x) + "Valor";

        // Regresa un boleano
        // boolean test(T t);
        Predicate<Integer> predicate = x -> x >3;







    }
}
