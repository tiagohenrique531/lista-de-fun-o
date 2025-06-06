public class Imposto {

     public static double somaImposto(double taxaImposto, double custo) {
        return custo + (custo * (taxaImposto / 100));
     }
}