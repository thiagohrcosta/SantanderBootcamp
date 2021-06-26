public class Main {

  public static void main(String[] args){

    Pessoa pessoa = new Pessoa("John", 20, 04, 1990);

    System.out.println(pessoa.getNome());
    System.out.println(pessoa.getDataNascimento());
    System.out.println(pessoa.calculaIdade());

    pessoa.setNome("John Doe");

    System.out.println(pessoa.getNome());
  }
}
