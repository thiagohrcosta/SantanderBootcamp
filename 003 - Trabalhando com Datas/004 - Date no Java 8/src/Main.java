import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

  public static void main(String[] args){
    LocalDate hoje = LocalDate.now();

    System.out.println(hoje);
    System.out.println(hoje.getDayOfMonth());
    System.out.println(hoje.minusDays(1));

    LocalTime agora = LocalTime.now();
    System.out.println(agora);
    System.out.println(agora.plusHours(1));

    LocalDateTime horaAgora = LocalDateTime.now();
    System.out.println(horaAgora);
  }
}
