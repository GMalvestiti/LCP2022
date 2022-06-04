// Exercício 03
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("\n Informe a palavra: ");
        String s = scan.nextLine();
        
        char[] c = s.toLowerCase().toCharArray();
        
        int cond = 0;
        for (int i = 0; i < c.length; i++) {
            if (c[i] != c[c.length - 1 - i]) {
                cond = 1;
            }
        }
        
        if (cond == 0) {
            System.out.printf("\n \"%s\" = Verdadeiro", s);
        } else {
            System.out.printf("\n \"%s\" = Falso", s);
        }
    }
}