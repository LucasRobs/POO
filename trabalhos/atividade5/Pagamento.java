class Pagamento{
    private int valor; //= getMensalidade();

    public int getValor() {
        return this.valor;
    }

    public int getPagamento() {
        return getValor();
    }

    public Pagamento TipoDePagamento(int x){
        if(x == 1){
            Boleto y = new Boleto();
            return y;
        }else if(x == 2){
            Cartao y = new Cartao();
            return y;
        }
    }
}