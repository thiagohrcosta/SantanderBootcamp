import java.io.IOException;
import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) throws IOException {
    Scanner leitor = new Scanner(System.in);
    int cont = 0;
    int total = 0;

    while (cont <= 5 ) {
      double x = leitor.nextDouble();
      if (x  > 0 ) {
        total ++;
      }
      cont ++ ;
    }
    System.out.println(total + " valores positivos");
  }
}