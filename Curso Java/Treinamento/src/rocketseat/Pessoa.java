package rocketseat;

public class Pessoa extends Ser {
    String sobrenome;
    public Pessoa(String nome, int idade, String sobrenome){
        super(nome, idade);
        this.sobrenome = sobrenome;
    }
    void criaMain(){
        Main meuMain = new Main();
        System.out.println(meuMain.nome);

    }

    @Override
    public String saudacao(){
        return "Olá, meu nome é " + this.nome;
    }
}
