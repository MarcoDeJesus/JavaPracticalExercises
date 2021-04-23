import algoritmo.ValorX;
import io.examples.PathExample;
import io.examples.SimpleIO;
import lambdas.shortcut.Planet;
import streams.examples.Countries;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String args[]) throws IOException {
/*        Scanner scanner = new Scanner(System.in);
        String input;
        input = scanner.nextLine();
        System.out.println("This is the input: " + input);*/

        SimpleIO ioObject = new SimpleIO();
        //ioObject.PrintFile(args);


        //ANALIZAR EL MOTIVO
        Planet earth = new Planet("93000000");
        Function<BigDecimal, BigDecimal> lambda = Planet::milesToKilometers;
        Function<BigDecimal, BigDecimal> lambdaPlanet = x -> Planet.milesToKilometers(x);

        PathExample pathExample = new PathExample();
        pathExample.currentFolder();

        Countries countries = new Countries();
        countries.SeeOutput();

        ValorX valorX = new ValorX();
        valorX.contar();
    }
}
