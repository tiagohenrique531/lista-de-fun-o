import java.util.Scanner;

public class Argumento {
    private static Scanner s = new Scanner(System.in);


    public static char perguntar(int numero) {
        
        if (numero > 0 ) {
            return 'P';
        } else {
            return 'N';
        }
    }
}
