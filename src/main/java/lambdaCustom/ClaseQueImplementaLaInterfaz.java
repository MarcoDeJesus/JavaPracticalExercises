package lambdaCustom;

public class ClaseQueImplementaLaInterfaz implements InterfazAImplementar {
    @Override
    public String funtionalInterfaceMethod(int x) {
        return String.valueOf(x + 25);
    }
}
