import java.util.Calendar;

public class Main {

  public static void main(String[] args){

    Calendar agora = Calendar.getInstance();
    System.out.println("A data correta é: " + agora.getTime());

    agora.add(Calendar.DATE, -15);
    System.out.println("15 dias atrás: " + agora.getTime());

    agora.add(Calendar.MONTH, 4);
    System.out.println("4 meses depois: " + agora.getTime());

    agora.add(Calendar.YEAR, 2);
    System.out.println("2 anos depois: " + agora.getTime());

    Calendar horaAgora = Calendar.getInstance();
    System.out.printf("%tc\n", horaAgora);
    System.out.printf("%tF\n", horaAgora);
    System.out.printf("%tD\n", horaAgora);
    System.out.printf("%tr\n", horaAgora);
    System.out.printf("%tT\n", horaAgora);
  }
}
