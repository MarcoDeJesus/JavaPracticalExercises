package switchCases;

import java.util.*;

public class SwitchTests {
    public static void main(String[] args) throws Exception {
        String instrument = "violin";
        final String CELLO = "cello";
        String viola = "viola";
        int p = -1;
        switch(instrument) {
            case "bass" :
                break;
            case CELLO :
                p++;
            default:
                p++;
            case "Carro" :
                System.out.println("hola");
            case "VIOLIN":
                p++;
            case "viola" :
                ++p;
                break;

        }

        System.out.print(p);
    }
}
