public class Veiculo {

  private String marca;
  private String modelo;
  private double valorVenal;

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public double getValorVenal() {
    return valorVenal;
  }

  public void setValorVenal(double valorVenal) {
    this.valorVenal = valorVenal;
  }

  public double calculaImposto(){
    return this.valorVenal * 0.01;
  }


}
