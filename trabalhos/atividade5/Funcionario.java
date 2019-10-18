class Funcionario extends Pessoa{
    public Funcionario setCargo(int x){
        if(x == 1){
            Gerente y = new Gerente();
            return y;
        }else if(x == 2){
            Caixa y = new Caixa();
            return y;
        }else if(x == 3){
            Instutores y = new Instutores();
            return y;
        }else if(x == 4){
            Auxiliares y = new Auxiliares();
            return y;
        }
        Funcionario y = new Funcionario();
        return y;
    }
}