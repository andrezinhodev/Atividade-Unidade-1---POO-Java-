package Unid1CodeJava1;

public class Aviao {
  private String nome, cor, modelo;
  private double valorAviao;

  public Aviao (
    String nome, String cor, String modelo,
    double valorAviao) {
      this.nome = nome;
      this.cor = cor;
      this.modelo = modelo;
      this.valorAviao = valorAviao;
    }
    public String getNome() {
      return nome;
    }
  
    public void setNome(String nome) {
      this.nome = nome;
    } 

    public String getCor() {
      return cor;
    }
  
    public void setCor(String cor) {
      this.cor = cor;
    }
        public String getModelo() {
      return modelo;
    }
  
    public void setModelo(String modelo) {
      this.modelo = modelo;
    }  

        public double getValorAviao() {
      return valorAviao;
    }
  
    public void setValorAviao(double valorAviao) {
      this.valorAviao = valorAviao;
    } 

    public static void main(String[] args) {
      
      Aviao meuAviao = new Aviao(
        "PARO22",
        "Azul",
        "Turbo Helice",
        1000000
      );    

      // Exibindo os dados do meu objeto
      System.out.println(meuAviao.getNome());
      System.out.println(meuAviao.getModelo());
      System.out.println(meuAviao.getValorAviao());
      System.out.println(meuAviao.getCor());
    }
  }
