package rocketseat;

public class Main {
    public String nome;
    private int idade;

    static String nome2 = "Sofia";
    public static void main(String[] args){
        Ser meuSerAnimal = new Cachorro("Amora", 5, "Heloisa");
        Ser meuSerHumano = new Pessoa("Heloisa", 18, "Salgado");

        System.out.println(meuSerHumano.saudacao());
        System.out.println(meuSerAnimal.saudacao());
    }

//    public Main(String nome, int idade){ // construtor
//        this.nome = nome;
//        this.idade = idade;
//    }

    private void atualizaIdade(){
        this.idade = 4000;
    }

    public int getIdade(){
        this.atualizaIdade();
        return this.idade;
    }
}

