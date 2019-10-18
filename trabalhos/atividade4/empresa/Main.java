public class Main{
    public static void main(String[] args){
      Empresa org_tabajara = new Empresa();
      for(int i = 0; i < 10; i++){
        if(i < 4){
          org_tabajara.adicionarFuncionario("Pedrinha", "basico", "Farias Brito");
        }else if(i < 8){
          org_tabajara.adicionarFuncionario("Priscilo", "medio", "Ari de Sá");
        }else if(i < 10){
          org_tabajara.adicionarFuncionario("Dirlandio", "superior", "UFC");
        }
      }
      org_tabajara.custoEmpresa();
      for(int i = 0; i < 10; i++){
        if(i < 7){
          org_tabajara.declararComissao(i, "vendedor");
        }else if(i < 9){
          org_tabajara.declararComissao(i, "supervisor");
        }else if(i < 10){
          org_tabajara.declararComissao(i, "gerente");
        }
      }
      org_tabajara.listarFuncionarios();
    }
}
