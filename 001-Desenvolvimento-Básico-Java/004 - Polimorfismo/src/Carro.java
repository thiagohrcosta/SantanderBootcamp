public class Carro extends Veiculo{

  private Integer quantidadeDePorta;

  public Integer getQuantidadeDePorta() {
    return quantidadeDePorta;
  }

  public void setQuantidadeDePorta(Integer quantidadeDePorta) {
    this.quantidadeDePorta = quantidadeDePorta;
  }


  public double calculaImposto(){
    return this.getValorVenal() * 0.07;
  }
}
