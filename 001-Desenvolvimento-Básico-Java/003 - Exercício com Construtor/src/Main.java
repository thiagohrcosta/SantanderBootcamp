public class Main {
  public static void main(String[] args) {

    Carro carro = new Carro("Ferrari", "488", 2021 );
    carro.setCor("Vermelha");
    System.out.println(
        "O carro selecionado é da marca "
            + carro.getMarca()
            + " cujo modelo é o "
            + carro.getModelo()
            + " com ano de fabricação em "
            + carro.getAno()
            + " da cor "
            + carro.getCor()
    );

  }

}
