package pack;
//import pack.subpack;

public class principal{
  public static void main(String[] args){
    //String nome = input.nextString();
    //int idade = input.nextint();
    //double altura = input.nextdouble();

    Elevador x = new Elevador();
    x.Inicializar(10, 10);
    x.imprimirInfo();
  }
}
