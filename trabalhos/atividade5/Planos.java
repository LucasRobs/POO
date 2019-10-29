class Planos{
    private int mensalidade = 70;

    public int getMensalidade() {
        return this.mensalidade;
    }

    public void setMensalidade(int mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Planos escolherPlano(int x){
        if(x == 1){
            Plano_basico y = new Plano_basico();
            return y;
        }else if(x == 2){
            Plano_medio y = new Plano_medio();
            setMensalidade(y.getMensalidade() * 2);
            return y;
        }
        return null;
    }

}