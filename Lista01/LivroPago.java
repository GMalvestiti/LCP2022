// Exercício 05
// Gustavo Silva Malvestiti

public class LivroPago extends Livro {
    
    private float valor;
    
    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public float getValor() {
        return this.valor;
    }
    
    public void setValor(float valor) {
        this.valor = valor;
    }
}