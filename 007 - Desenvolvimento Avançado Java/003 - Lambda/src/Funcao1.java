public class Funcao1 {
  public static void main(String[] args){
    Funcao2 funcao2 = valor -> System.out.println(valor);
    funcao2.gerar("João");
  }
}

interface Funcao2{
  void gerar(String valor);
}