package Unid1CodeJava1;

public class Carro {
  private String cor, marca, anoDeFabricacao;
  private double valorCarro;

  // Construindo a minha classe:
  public Carro(
    String cor, String marca, String anoDeFabricacao,
    double valorCarro) {

      // Definindo os atributos da minha Classe
      this.cor = cor;
      this.marca = marca;
      this.anoDeFabricacao = anoDeFabricacao;
      this.valorCarro = valorCarro;
    }

    public String getCor() {
      return cor;
    }
    public void setCor(String cor) {
      this.cor = cor;
    }
        public String getMarca() {
      return marca;
    }
    public void setMarca(String marca) {
      this.marca = marca;
    }
    public String getAnoDeFabricacao() {
      return anoDeFabricacao;
    }
    public void setAnoDeFabricacao(String anoDeFabricacao) {
      this.anoDeFabricacao = anoDeFabricacao;
    }
      public double getValorCarro() {
      return valorCarro;
    }
    public void setValorCarro(double valorCarro) {
      this.valorCarro = valorCarro;
    }

    public static void main(String[] args) {

      Carro meuCarro = new Carro(
        "Azul", 
        "Chevrolet",
        "2002",
        22000
      );      
        System.out.println(meuCarro.getCor());
        System.out.println(meuCarro.getMarca());
        System.out.println(meuCarro.getAnoDeFabricacao());
        System.out.println(meuCarro.getValorCarro());
    }
}
