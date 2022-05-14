// Exercício 04
// Gustavo Silva Malvestiti

public class Animal {
    
    private int idade;
    private String nome;
    
    public String som() {
        return "\nSom: Animal";
    }
    
    public String acao() {
        return "\nAção: Animal";
    }
    
    public int getIdade() {
        return this.idade;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome + "\nIdade: " + this.idade + this.som() + this.acao() + "\n";
    }
}