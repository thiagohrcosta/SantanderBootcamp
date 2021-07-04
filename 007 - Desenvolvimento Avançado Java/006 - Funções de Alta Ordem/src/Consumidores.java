import java.util.function.Consumer;

public class Consumidores {
  public static void main(String[] args){

    Consumer<String> imprimirUmaFrase = System.out::println;
    Consumer<String> imprimirUmaFrase2 = frase -> System.out.print(frase);
    imprimirUmaFrase.accept("Hello World");
  }
}
