// Exercício 06
// Gustavo Silva Malvestiti

public class TestaGeometria {
    
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(3);
        
        Retangulo r1 = new Retangulo(2, 4);
        Retangulo r2 = new Retangulo(3, 5);
        
        Triangulo t1 = new Triangulo(3, 2, 1);
        Triangulo t2 = new Triangulo(12, 8, 4);
        
        Circulo c1 = new Circulo(2);
        Circulo c2 = new Circulo(5);
        
        System.out.printf("\nQuadrado 01: \n  Área = %.2f\n  Perímetro: %.2f\n", q1.getArea(), q1.getPerimetro());
        System.out.printf("\nQuadrado 02: \n  Área = %.2f\n  Perímetro: %.2f\n", q2.getArea(), q2.getPerimetro());
        System.out.printf("\nRetângulo 01: \n  Área = %.2f\n  Perímetro: %.2f\n", r1.getArea(), r1.getPerimetro());
        System.out.printf("\nRetângulo 02: \n  Área = %.2f\n  Perímetro: %.2f\n", r2.getArea(), r2.getPerimetro());
        System.out.printf("\nTriângulo 01: \n  Área = %.2f\n  Perímetro: %.2f\n", t1.getArea(), t1.getPerimetro());
        System.out.printf("\nTriânguloo 02: \n  Área = %.2f\n  Perímetro: %.2f\n", t2.getArea(), t2.getPerimetro());
        System.out.printf("\nCírculo 01: \n  Área = %.2f\n  Perímetro: %.2f\n", c1.getArea(), c1.getPerimetro());
        System.out.printf("\nCírculo 02: \n  Área = %.2f\n  Perímetro: %.2f\n", c2.getArea(), c2.getPerimetro());
    }
}