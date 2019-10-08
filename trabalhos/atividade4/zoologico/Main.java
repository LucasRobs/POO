public class Main{
    public static void main(String[] args){
        Cachorro a1 = new Cachorro();
        Cavalo a2 = new Cavalo();
        Preguica a3 = new Preguica();

        System.out.println("2)");
        System.out.println(a1.getEmitirSom());
        System.out.println(a2.getEmitirSom());
        System.out.println(a3.getEmitirSom());

        System.out.println("3)");
        Veterinario x1 =  new Veterinario();
        System.out.println(x1.examinar(a1));
        System.out.println(x1.examinar(a2));
        System.out.println(x1.examinar(a3));

        System.out.println("4)");
        Zoologico z1 = new Zoologico();
        String[] animais = {"cachorro","cavalo","preguica"};
        for(int i = 0; i < 10; i++){
            z1.adicionarJaula(animais[i % 3]);
        }
        z1.listarBaderna();

    }
}
