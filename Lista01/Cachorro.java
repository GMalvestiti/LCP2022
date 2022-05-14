// Exercício 04
// Gustavo Silva Malvestiti

public class Cachorro extends Animal {
    
    @Override
    public String som() {
        return "\nSom: Au au";
    }
    
    @Override
    public String acao() {
        return "\nAção: corre";
    }
}