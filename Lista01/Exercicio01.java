// Exercício 01
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int i = 0;
        do {
            System.out.printf("\nInforme o número entre 1 e 20: ");
            i = scan.nextInt();
            
            if ((i < 1) || (i > 20)) {
                System.out.printf("\nErro Número inválido!\n");
            }
        } while((i < 1) || (i > 20));
        
        System.out.printf("\n");
        for (int aux = 0; aux < i; aux++) {
            System.out.printf("*");
        }
    }
}