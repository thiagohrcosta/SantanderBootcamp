import java.time.Instant;
import java.util.Date;

public class Main {

  // Depreciados ======================================================
  // Date(int year, int month, int date)
  // Date(int year, int month, int date, int hrs, int min)
  // Date(int year, int month, int date, int hrs, int min, int sec)
  // Date(String s)
  // Depreciados ======================================================

  public static void main(String[] args){
    Date novaData = new Date();
    System.out.println(novaData);

    Long currentTimeMillis = System.currentTimeMillis();
    System.out.println(currentTimeMillis);

    Date novaData1 = new Date(currentTimeMillis);
    System.out.println(novaData1);

    // ===============================================
    //after(Date)
    //before(Date)
    //compareTo(Date)
    // conferir outros métodos úteis do Java.util.Date
    // ===============================================

    Date dataNoPassado = new Date(1513124807691L);
    Date dataAtual = new Date(1624752392478L);
    Date mesmaData = new Date(1624752392478L);

    boolean isAfter = dataNoPassado.after(dataAtual);
    System.out.println(isAfter);

    boolean isBefore = dataNoPassado.before(dataAtual);
    System.out.println(isBefore);

    boolean isEquals = mesmaData.equals(dataAtual);
    System.out.println(isEquals);

    Instant instant = dataAtual.toInstant();
    System.out.println(instant);

  }
}
