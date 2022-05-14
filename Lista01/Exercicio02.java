// Exercício 02
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Exercicio02 {
    
    public void soma(int[] n) {
        int valor = 0;
        for (int i = 0; i < n.length; i++) {
            valor += n[i];
        }
        
        System.out.printf("\nSoma: %d", valor);
    }
    
    public void produto(int[] n) {
        int valor = n[0];
        for (int i = 1; i < n.length; i++) {
            valor *= n[i];
        }
        
        System.out.printf("\nProduto: %d", valor);
    }
    
    public void media(int[] n) {
        if (n.length != 0) {
            int valor = 0;
            for (int i = 0; i < n.length; i++) {
                valor += n[i];
            }
            valor /= n.length;
            
            System.out.printf("\nMédia: %d", valor);
        } else {
            System.out.printf("\nMédia: Inválida");
        }
    }
    
    public void ordenacao(int[] n) {
        if ((n[0] >= n[1]) && (n[1] >= n[2])) {
            System.out.printf("\nOrdenação: %d %d %d", n[0], n[1], n[2]);
        } else if (((n[0] >= n[2]) && (n[2] >= n[1]))) {
            System.out.printf("\nOrdenação: %d %d %d", n[0], n[2], n[1]);
        } else if ((n[1] >= n[0]) && (n[0] >= n[2])) {
            System.out.printf("\nOrdenação: %d %d %d", n[1], n[0], n[2]);
        } else if ((n[1] >= n[2]) && (n[2] >= n[0])) {
            System.out.printf("\nOrdenação: %d %d %d", n[1], n[2], n[0]);
        } else if ((n[2] >= n[0]) && (n[0] >= n[1])) {
            System.out.printf("\nOrdenação: %d %d %d", n[2], n[0], n[1]);
        } else {
            System.out.printf("\nOrdenação: %d %d %d", n[2], n[1], n[0]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] n = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.printf("\nInforme %d° número: ", i + 1);
            n[i] = scan.nextInt();
        }
        
        Exercicio02 obj = new Exercicio02();
        obj.soma(n);
        obj.produto(n);
        obj.media(n);
        obj.ordenacao(n);
    }
}