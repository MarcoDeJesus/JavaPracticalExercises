package lambdaCustom.IntefaceAsParameter;

public class Main {

    public void Saludador(Helloiable helloiable){
        helloiable.SayHello();
    }

    public static void main(String args[]){
        Introductorio introductorio = new Introductorio();
        Despedidor despedidor = new Despedidor();

        Main clasePrincipal = new Main();
        clasePrincipal.Saludador(introductorio);
        clasePrincipal.Saludador(despedidor);

        Main otraClase = new Main();
        otraClase.Saludador(() -> System.out.println("Saludo desde lambda"));

        Helloiable lambda = () -> System.out.println("Saludo desde lambda ya con Interface Type");
        otraClase.Saludador(lambda);

        Generica<Double, String, Integer> genericaLambda = (x, y) -> 34;


    }
}
