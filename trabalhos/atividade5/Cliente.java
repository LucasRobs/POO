class Cliente extends Pessoa{
    Planos plano;
    Pagamento pagamento;

    public void setPlano(Planos plano) {
        this.plano = plano;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    public int getMensalidade() {
        return pagamento.getValor();
    }

}