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

    public Boolean isEscalar() {
        return this.escalar;
    }

    public Boolean getEscalar() {
        return this.escalar;
    }

    public void setEscalar(Boolean escalar) {
        this.escalar = escalar;
    }

    @Override
    public String getEmitirSom() {
        return "grannnnenenenem";
    }
}

class Veterinario{
    public String examinar(Animal x){
        String som = x.getEmitirSom();
        return som;
    }
}

class Zoologico{
    private ArrayList<Jaula> trabalhador = new ArrayList<Jaula>();
    
    public void adicionarJaula(){
        Jaula x = new Jaula();
        trabalhador.add(x);
    }
}
class Jaula{
    Animal animal;
}