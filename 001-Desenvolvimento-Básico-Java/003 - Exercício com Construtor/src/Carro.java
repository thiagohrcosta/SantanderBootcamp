public class Carro {

  private String marca;
  private String modelo;
  private Integer ano;
  private String cor;

  public Carro(String marca, String modelo, Integer ano){
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
  }

  public void setMarca(String marca){
    this.marca = marca;
  }

  public String getMarca(){
    return marca;
  }

  public void setModelo(String modelo){
    this.modelo = modelo;
  }

  public String getModelo(){
    return modelo;
  }

  public void  setAno(Integer ano){
    this.ano = ano;
  }

  public Integer getAno(){
    return ano;
  }

  public  void setCor(String cor){
    this.cor = cor;
  }
  public String getCor(){
    return cor;
  }

}
