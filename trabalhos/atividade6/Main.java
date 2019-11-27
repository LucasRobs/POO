public class Main{
  public static void main(String[] args){
    Instituicao UFCqx = new Instituicao();
    Reitor r1 = new Reitor("Lucas", "qwe123");
    UFCqx.setReitor(r1);
    UFCqx.menu(UFCqx);
    System.out.println("asdasd");
    UFCqx.listarCursos();
  }
}
