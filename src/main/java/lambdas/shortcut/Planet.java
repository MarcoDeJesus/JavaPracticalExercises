package lambdas.shortcut;

import java.math.BigDecimal;

public class Planet {
    private BigDecimal milesFromSun;
    public Planet(String milesFromSun){
        this.milesFromSun = new BigDecimal(milesFromSun);
    }

    public BigDecimal getMilesFromSun(){
        return milesFromSun;
    }

    public static BigDecimal milesToKilometers(BigDecimal miles){
        BigDecimal scale = new BigDecimal("1.60934");
        return miles.multiply(scale);
    }
}
