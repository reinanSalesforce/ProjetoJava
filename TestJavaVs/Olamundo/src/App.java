import java.util.Scanner;

public class App {
    private String nome;
    private int idade;


    public App() {
    }

    public App(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

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

    public App nome(String nome) {
        this.nome = nome;
        return this;
    }

    public App idade(int idade) {
        this.idade = idade;
        return this;
    }



public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    entrada.close();
    App nome1 = new App();
    String nomeO = entrada.next();
    nome1.setNome(nomeO);

    System.out.println("seu nome é " );
    

}


}
