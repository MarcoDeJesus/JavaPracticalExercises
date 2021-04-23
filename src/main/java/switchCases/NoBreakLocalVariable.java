package switchCases;

public class NoBreakLocalVariable {
    public void Nobreak(){
        int month = 11;

        switch (month){
            case 1: case 3: case 5: case 7:
            case 8: case 10: case 12:
                String message  = "31 days. ";
                System.out.printf(message);
            case 4: case 6: case 9: case 11:
                //Already defined
                //String message = "30 days. ";

        }

        //"CAt".toUpperCase();
    }
}
