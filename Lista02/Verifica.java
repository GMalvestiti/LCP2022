// Exercício 06
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Verifica {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("\n Informe o RG: ");
        String s = scan.nextLine();
        
        if (s.matches("[0-9]{1,2}.[0-9]{3}.[0-9]{3}-[0|X]")) {
            System.out.printf("\n Resultado: RG Válido!");
        } else {
            System.out.printf("\n Resultado: RG Inválido!");
        }
    }
}