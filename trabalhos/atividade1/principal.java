public class principal{
  public static void main(String[] args){
    Funcionario x = new Funcionario("Priscillo", 13, 1500.00, 11, 04, 2019, "201857899");
    x.printer();
    x.bonifica(400);
    x.printer();

  }
}
