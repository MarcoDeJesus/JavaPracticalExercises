package streams.examples;

import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Countries {

    public static Function<String, String> swap = s ->{
      if(s.equals("Australia")){
          return "New Zealand";
      }else{
          return s;
      }
    };

    public void SeeOutput(){
        Set<String> islandNations = Set.of("Australia", "Japan", "Taiwan", "Cyprus", "Cuba");
        islandNations = islandNations.stream()
                .map(swap)
                .map(n -> n.substring(0, 1))
                .collect(Collectors.toSet());

        for (String s : islandNations){
            System.out.print(s);
        }
    }
}
