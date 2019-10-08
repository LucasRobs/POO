public class Main{
    public static void main(String[] args){
      Empresa org_tabajara = new Empresa();
      for(int i = 0; i < 10; i++){
        if(i < 4){
          org_tabajara.adicionarFuncionario("Vanesso","basico", "Farias Brito");
        }else if(i < 8){
          org_tabajara.adicionarFuncionario("Priscilo","medio", "Ari de Sá");
        }else if(i < 10){
          org_tabajara.adicionarFuncionario("Dirlandio","graduacao", "UFC");
        }
      }
      org_tabajara.listarFuncionarios();
      org_tabajara.custoEmpresa();
    }

}
