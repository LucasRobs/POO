class Boleto extends Pagamento{
    @Override
    public int getPagamento() {
        return getValor() + 3;
    }
}