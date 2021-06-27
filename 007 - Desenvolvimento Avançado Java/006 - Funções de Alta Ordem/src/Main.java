import java.util.function.Function;

public class Main {
  public static void main(String[] args){
    Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
    System.out.println(retornaNomeAoContrario.apply("João"));
  }
}
