public class Hora {
    
    import java.util.Scanner;

public class Hora {

    // Função para converter o horário de 24h para 12h
    public static int[] converterPara12Horas(int hora24, int minuto, char[] periodo) {
        int hora12;
        if (hora24 == 0) {
            hora12 = 12;
            periodo[0] = 'A';
        } else if (hora24 < 12) {
            hora12 = hora24;
            periodo[0] = 'A';
        } else if (hora24 == 12) {
            hora12 = 12;
            periodo[0] = 'P';
        } else {
            hora12 = hora24 - 12;
            periodo[0] = 'P';
        }
        return new int[]{hora12, minuto};
    }

    // Função para exibir o horário em formato 12h
    public static void exibirHorario(int hora, int minuto, char periodo) {
        String periodoStr = (periodo == 'A') ? "A.M." : "P.M.";
        System.out.printf("Horário em 12 horas: %d:%02d %s%n", hora, minuto, periodoStr);
    }

    // Função principal com loop
    
}

}
