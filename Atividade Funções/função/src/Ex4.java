import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Argumento arg = new Argumento();
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = s.nextInt();
        System.out.println(Argumento.perguntar(numero));
    }
}
