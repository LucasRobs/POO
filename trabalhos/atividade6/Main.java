public class Main{
  public static void main(String[] args){
    Instituicao UFCqx = new Instituicao();
    UFCqx.setReitor(new Reitor("adm", "adm"));
    while(true){
      try{
        UFCqx.menu(UFCqx);
      }catch(java.util.InputMismatchException e){
        System.out.println("Digitou letra em campo de numero");
      }finally{
        System.out.println("reiniciando progama....");
      }
    }
  }
}
