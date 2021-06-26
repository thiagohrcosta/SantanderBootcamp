public class Main {

  public static void main(String[] args){
    Carro carro = new Carro();
    carro.setMarca("Ferrari");
    carro.setModelo("F50");
    carro.setQuantidadeDePortas(2);

    Motocicleta moto = new Motocicleta();
    moto.setMarca("Kawasaki");
    moto.setModelo("Ninja 400");
    moto.setCilindradas("399cc");

    System.out.println("O carro selecionado foi: " + carro.getMarca() + ", " + carro.getModelo() + ", de " + carro.getQuantidadeDePortas() + " portas");
    System.out.println("A motocicleta selecionada foi: " + moto.getMarca() + ", " + moto.getModelo() + ", de " + moto.getCilindradas());

    carro.acelera();
    moto.acelera();
  }


}
