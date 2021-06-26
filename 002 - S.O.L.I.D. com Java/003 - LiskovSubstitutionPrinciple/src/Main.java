public class Main {

  public static void main(String[] args){
    Retangulo retangulo = new Quadrado();

    retangulo.setAltura(10);
    retangulo.setLargura(5);

    System.out.println("Area : " + retangulo.getArea());
    // Haverá um erro, pois nem tudo deve ser abstraído ou estendido.
  }
}
