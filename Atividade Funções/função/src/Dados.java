import java.util.Scanner;

public class Dados {
    private int usuario;
    private static Scanner s = new Scanner(System.in);

    public int getUsuario() {
        return usuario;
    }

    public void setInt(int usuario) {
        this.usuario = usuario;
    }

    public void receber() {
        System.out.print("Digite um número: ");
        usuario = s.nextInt();

        for (int x = 1; x <= usuario; x++) {
            System.out.println();
            for (int y = 0; y < x; y++) {
                System.out.print(x + " ");
            }
        }

    }
}
