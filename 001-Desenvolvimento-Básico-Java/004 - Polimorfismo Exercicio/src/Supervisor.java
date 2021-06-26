public class Supervisor extends Funcionario{

  @Override
  public double calculaImposto() {
    return getSalario() * 0.05;
  }
}
