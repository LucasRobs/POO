import java.util.ArrayList;

class Animal {
    String nome;
    int idade;
    String emitirSom;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEmitirSom() {
        return this.emitirSom;
    }

    public void setEmitirSom(String emitirSom) {
        this.emitirSom = emitirSom;
    }

    public Boolean isCorrer() {
        return isCorrer();
    }

    @Override
    public String toString() {
        return "{" +
            " nome='" + getNome() + "'" +
            ", idade='" + getIdade() + "'" +
            ", emitirSom='" + getEmitirSom() + "'" +
            "}";
    }

}

class Cachorro extends Animal{
    Boolean correr = false;

    public Boolean isCorrer() {
        return this.correr;
    }

    public Boolean getCorrer() {
        return this.correr;
    }

    public void setCorrer(Boolean correr) {
        this.correr = correr;
    }
    @Override
    public String getEmitirSom() {
        return "Au au";
    }
}

class Cavalo extends Animal{
    Boolean correr = false;

    public Boolean isCorrer() {
        return this.correr;
    }

    public Boolean getCorrer() {
        return this.correr;
    }

    public void setCorrer(Boolean correr) {
        this.correr = correr;
    }
    @Override
    public String getEmitirSom() {
        return "himmmmmmhihihihi";
    }
}

class Preguica extends Animal{
    Boolean escalar = false;
    Boolean correr = false;
    public Boolean isEscalar() {
        return this.escalar;
    }

    public Boolean getEscalar() {
        return this.escalar;
    }

    public void setEscalar(Boolean escalar) {
        this.escalar = escalar;
    }

    public Boolean isCorrer() {
        return this.correr;
    }

    @Override
    public String getEmitirSom() {
        return "ammmmmm";
    }
}

class Veterinario{
    public String examinar(Animal x){
        String som = x.getEmitirSom();
        return som;
    }
}

class Zoologico{
    private ArrayList<Animal> jaula = new ArrayList<Animal>();

    public void adicionarJaula(String animal){
          if(animal == "cachorro"){
              Cachorro x = new Cachorro();
              x.setCorrer(true);
              x.setNome(animal);
              this.jaula.add(x);
          }else if(animal == "cavalo"){
              Cavalo x = new Cavalo();
              x.setNome(animal);
              x.setCorrer(true);
              this.jaula.add(x);
          }else if(animal == "preguica"){
              Preguica x = new Preguica();
              x.setNome(animal);
              this.jaula.add(x);
          }
    }
    public void listarBaderna(){
        for(Animal x: jaula){
            System.out.println(x.getNome()+" grito : "+ x.getEmitirSom());
            if(x.isCorrer() == true){
                System.out.println(" (começo correr)");
            }else{
                System.out.println(" (ficou vegetando)");
            }
        }
    }
}
