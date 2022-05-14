// Exercício 07
// Gustavo Silva Malvestiti

public class Exercicio07 {
    
    private double valor;
    
    public Exercicio07() {
        this(0, 0, 0, 0);
    }
    
    public Exercicio07(float x) {
        this(x, 0, 0, 0);
    }
    
    public Exercicio07(float x, float y) {
        this(x, y, 0, 0);
    }
    
    public Exercicio07(float x, float y, float z) {
        this(x, y, z, 0);
    }
    
    public Exercicio07(float x, float y, float z, float w) {
        this.valor = Math.pow(x, 1) + Math.pow(y, 2)+ Math.pow(z, 3)+ Math.pow(w, 4);
    }
    
    public static void main(String[] args) {
        Exercicio07 e1 = new Exercicio07();
        Exercicio07 e2 = new Exercicio07(2);
        Exercicio07 e3 = new Exercicio07(2, 3);
        Exercicio07 e4 = new Exercicio07(2, 3 ,4);
        Exercicio07 e5 = new Exercicio07(2, 3, 4, 5);
        
        System.out.printf("\n Equação 01: %.0f", e1.getValor());
        System.out.printf("\n Equação 02: %.0f", e2.getValor());
        System.out.printf("\n Equação 03: %.0f", e3.getValor());
        System.out.printf("\n Equação 04: %.0f", e4.getValor());
        System.out.printf("\n Equação 05: %.0f", e5.getValor());
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}