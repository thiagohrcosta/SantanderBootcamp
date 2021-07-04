import java.util.function.Supplier;

public class Supiladores {
  public static void main(String[] args){
    Supplier<Pessoa> instanciaPessoa = () -> new Pessoa();
    System.out.println(instanciaPessoa.get());
  }
}

class Pessoa {
  private String nome;
  private Integer idade;

  public Pessoa(){
    nome = "Joao";
    idade = 25;
  }

  @Override
  public String toString(){
    return String.format("Nome: %s, idade: %d", nome, idade);
  }
}
