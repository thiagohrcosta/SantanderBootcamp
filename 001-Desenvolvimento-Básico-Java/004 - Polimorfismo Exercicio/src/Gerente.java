public class Gerente extends Funcionario{

  @Override
  public double calculaImposto() {
    return getSalario() * 0.1;
  }
}


