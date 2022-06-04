// Exercício 01
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Exercicio01 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.printf("\n Informe o nome: ");
        String s = scan.nextLine();
        
        String[] a = s.toLowerCase().split(" ");
        
        s = "";
        for (int i = 0; i < a.length; i++) {
            if (i != 0) {
                s += " ";
            }
            
            char[] c = a[i].toCharArray();
            
            if ((!a[i].equals("da")) && (!a[i].equals("de")) && (!a[i].equals("do"))) {
                c[0] = Character.toUpperCase(c[0]);
            }
            
            for (char ct : c) {
                s += ct;
            }
        }
        
        System.out.printf("\n Nome: %s", s);
    }
}