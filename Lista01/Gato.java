// Exercício 04
// Gustavo Silva Malvestiti

public class Gato extends Animal {
    
    @Override
    public String som() {
        return "\nSom: Miau";
    }
    
    @Override
    public String acao() {
        return "\nAção: corre e pula";
    }
}