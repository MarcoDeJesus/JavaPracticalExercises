package algoritmo;

public class ValorX {

    public void contar(){
        int x = 0;
        int vueltas=0;

        //Debuggear la respuesta es 12 porque continue salta la
        // linea y omite la 20 donde se aumenta el contador a 1
        while(x < 100){
            if(x%3 == 0){
                x+=3;
            }

            if(x%2==0){
                x+=2;
                continue;
            }
            x++;
            vueltas++;
        }
    }
}
