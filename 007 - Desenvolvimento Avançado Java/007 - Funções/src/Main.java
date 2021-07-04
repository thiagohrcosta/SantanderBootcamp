import java.util.function.Function;

public class Main {
  public static void main(String[] args){
    Function<String, String> retornarNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
    Function<String, Integer> converterStringParaInteiroECalcularDobro = string -> Integer.valueOf(string) * 2;
    System.out.println(retornarNomeAoContrario.apply("Joao"));
    System.out.println(converterStringParaInteiroECalcularDobro.apply("20"));
  }
}
