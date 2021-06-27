import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
  public static void main(String[] args){

    Date agora = new Date();

    String dateToStr = DateFormat.getInstance().format(agora);
    System.out.println(dateToStr);

    dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);

    Date dataAgora = new Date();

    SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    String dataFormatada = formatter.format(agora);
    System.out.println(dataFormatada);
  }
}
