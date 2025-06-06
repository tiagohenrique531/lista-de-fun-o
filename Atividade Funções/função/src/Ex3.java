import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Resultado resultado = new Resultado();
        System.out.print("Digite o primeiro número: ");
        int n1 = s.nextInt();
        System.out.print("Digite o primeiro número: ");
        int n2 = s.nextInt();
        System.out.print("Digite o primeiro número: ");
        int n3 = s.nextInt();

        System.out.println(resultado.somar(n1, n2, n3));
    }
}
