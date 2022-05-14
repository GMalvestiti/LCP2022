// Exercício 08
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Exercicio08 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("\n Informe o número: ");
        int x = scan.nextInt();
        
        String n = String.valueOf(x);
        int i = n.length();
        
        int soma = 0;
        for (int aux = 0; aux < i; aux++) {
            soma += Math.pow(Character.getNumericValue(n.charAt(aux)), i);
        }
        
        if (soma == x) {
            System.out.printf("\n O número é válido!");
        } else {
            System.out.printf("\n O número é inválido!");
        }
    }
}