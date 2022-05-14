// Exercício 05
// Gustavo Silva Malvestiti

public class Biblioteca {
    
    public static void main(String[] args) {
        LivroGratuito lg = new LivroGratuito();
        lg.setTitulo("Free");
        
        LivroPago lp = new LivroPago();
        lp.setTitulo("Paid");
        lp.setValor(75);
        
        System.out.printf("\nLivro Gratuito:\n  Nome = %s\n\nLivro Pago: \n  Nome = %s\n  Valor = R$%.2f", lg.getTitulo(), lp.getTitulo(), lp.getValor());
    }
}