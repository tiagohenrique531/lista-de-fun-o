import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System .in);
        Imposto result = new Imposto();

        System.out.print("Digite a taxa de imposto (em %)");
        double imposto = s.nextDouble();

        System.out.print("\nDigite o custo do item: R$ ");
        double custo = s.nextDouble();

        double custoComImposto = Imposto.somaImposto(imposto, custo);

        System.out.printf("Custo com imposto: R$ %.2f\n", custoComImposto);

        s.close();
    }
}