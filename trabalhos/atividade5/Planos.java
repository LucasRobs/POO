class Planos{
    private int mensalida = 70;

    public int getMensalida() {
        return this.mensalida;
    }

    public void setMensalida(int mensalida) {
        this.mensalida = mensalida;
    }

    public Planos escolherPlano(int x){
        if(x == 1){
            Plano_basico y = new Plano_basico();
            return y;
        }else if(x == 2){
            Plano_medio y = new Plano_medio();
            setMensalida(y.getMensalida() * 2);
            return y;
        }
    }
}