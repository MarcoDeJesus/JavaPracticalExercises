package lambdaCustom;

public class LambdaCustom {
    public static void main(String args[]){
        ClaseQueImplementaLaInterfaz instanciaDeLaClaseQueImplementa = new ClaseQueImplementaLaInterfaz();
        System.out.println(instanciaDeLaClaseQueImplementa.funtionalInterfaceMethod(25));

        ClaseQueImplementaLaInterfaz InstanciaDeLaClaseQueImplementa2 = new ClaseQueImplementaLaInterfaz(){
          @Override
          public String funtionalInterfaceMethod(int x){
              return String.valueOf(x + 25);
          }
        };
        System.out.println(InstanciaDeLaClaseQueImplementa2.funtionalInterfaceMethod(25));

        ClaseQueImplementaLaInterfaz instanciaDeLaClaseQueImplementa3 = new ClaseQueImplementaLaInterfaz(){
            @Override
            public String funtionalInterfaceMethod(int x) {
                return super.funtionalInterfaceMethod(x);
            }
        };
        System.out.println(instanciaDeLaClaseQueImplementa3.funtionalInterfaceMethod(25));

        InterfazAImplementar implementacionDeLaInterfaz = x -> String.valueOf(x + 25);
        System.out.println(implementacionDeLaInterfaz.funtionalInterfaceMethod(25));


    }
}
