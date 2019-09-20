class Main {
    
    public static void main(String[] args) {
        Conta x =  new Conta("Lucas", 47028922, "Bradesco", 1500, 19, 9 ,1998);
        System.out.println(x.saldo());
        x.sacar(1000);
        System.out.println(x.saldo());
        x.depositar(5000);
        System.out.println(x.recuperaDadosParaImpressao());
        x.setNome("Lucas Robs");
        System.out.println(x.saldo()+"\n");
        System.out.println(x.recuperaDadosParaImpressao());
        Conta y =  new Conta("Lucas", 47028922, "Bradesco", 1500, 19, 9 ,1998);
        Conta z = x;
        if(x.nome ==  y.nome){
            System.out.println("Igua\n");
        }else{
            System.out.println("Diferente\n");
        }
        Conta c1 = new Conta("Luke sky", 47028922, "Bradesco", 1500, 19, 9 ,1998);
        System.out.println(c1.recuperaDadosParaImpressao());
        

        if(x == z){
            System.out.println("Igua\n");
        }else{
            System.out.println("Diferente\n");
        }
    }
}