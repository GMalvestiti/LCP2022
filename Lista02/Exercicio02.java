// Exercício 02
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.printf("\n Informe a string 1: ");
        String s1 = scan.nextLine();
        
        System.out.printf("\n Informe a string 2: ");
        String s2 = scan.nextLine();
        
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        
        String s = "";
        
        int i;
        if (c1.length == c2.length) {
            for (i = 0; i < c1.length; i++) {
                s += Character.toString(c1[i]);
                s += Character.toString(c2[i]);
            }
        } else if (c1.length > c2.length) {
            for (i = 0; i < c2.length; i++) {
                s += Character.toString(c1[i]);
                s += Character.toString(c2[i]);
            }
            for (; i < c1.length; i++) {
                s += Character.toString(c1[i]);
            }
        } else {
            for (i = 0; i < c1.length; i++) {
                s += Character.toString(c1[i]);
                s += Character.toString(c2[i]);
            }
            for (; i < c2.length; i++) {
                s += Character.toString(c2[i]);
            }
        }
        
        System.out.printf("\n String final: \"%s\"", s);
    }
}