//package pack;
public class Pessoa{
  private String nome;
  private int idade;
  private double altura;

  public Pessoa(String nome_in, int idade_in, double altura_in){
    this.nome = nome_in;
    this.idade = idade_in;
    this.altura = altura_in;
  }

  public String getNome(){
    return nome;
  }
  public int getIdade(){
    return idade;
  }
  public double getAltura(){
    return altura;
  }

  public void setNome(String _nome){
    this.nome = _nome;
  }
  public void setIdade(int _idade){
    this.idade = _idade;
  }
  public void setAltura(double _altura){
    this.altura = _altura;
  }
  public void imprimirDados(){
    System.out.println("Nome: "+ nome +"\nIdade: "+idade+"\nAltura: "+ altura);
  }
}
