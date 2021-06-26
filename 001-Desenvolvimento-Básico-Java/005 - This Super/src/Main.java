public class Main {

  public static void main(String[] args){

    Veiculo carro1 = new Carro("Palio", "Fiat", 20000);
    Veiculo carro2 = new Carro("Palio", "Fiat", 20000);

    System.out.println(carro1.equals(carro2));
  }
}
