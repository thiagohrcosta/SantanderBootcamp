import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
  public static void main(String[] args){
    String[] nomes = {"Joao", "Paulo", "Oliveira", "Instrutor", "Java"};
    Integer[] numeros = {1,2,3,4,5};
    ImprimirNOmesFiltrados(nomes);
  }

  public static void ImprimirNOmesFiltrados(String... nomes){

    String nomesParaImprimir = "";
    for(String nome : nomes){
      System.out.println(nome);
      }

      Stream.of(nomes)
          .forEach(System.out::println);
    }

    System.out.println(nomesParaImprimir);

    String nomesImprimirDaStream = Stream.of(nomes)
        .filter(nome -> nome.equals("Joao"))
        .collect(Collectors.joining());

    System.out.println("Nomes do stream: " + nomesImprimirDaStream);


  }


}
