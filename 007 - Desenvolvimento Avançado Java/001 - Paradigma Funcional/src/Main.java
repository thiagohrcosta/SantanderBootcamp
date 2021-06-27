import java.util.function.UnaryOperator;

public class Main {
  public static void main(String[] args){
    // o paradigma imperativo de forma instantânea como ordens dadas ao computador
    int valor = 10;
    int resultado = valor * 3;
    System.out.println("O resultado é : " + resultado);

    // no paradigma funcional damos uma regra, uma declaração de como queremos que o programa
    // se comporte

    UnaryOperator<Integer> calcularValorVezesTrinta = valor2 -> valor2 * 30;
    int valor2 = 10;
    System.out.println("O resultado é : " + calcularValorVezesTrinta.apply(10));
  }
}
