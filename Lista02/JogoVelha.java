// Exercício 04
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class JogoVelha {
    
    public static boolean verifica(String[][] m, int p) {
        
        String[] aux = {"X", "O"};
        
        boolean cond = false;
        
        int i;
        for (i = 0; i < 3; i++) {
            if ((m[i][0].equals(aux[p])) && (m[i][1].equals(aux[p])) && (m[i][2].equals(aux[p]))) {
                cond = true;
            }
            if ((m[0][i].equals(aux[p])) && (m[1][i].equals(aux[p])) && (m[2][i].equals(aux[p]))) {
                cond = true;
            }
        }
        
        if ((m[0][0].equals(aux[p])) && (m[1][1].equals(aux[p])) && (m[2][2].equals(aux[p]))) {
            cond = true;
        }
        
        if ((m[0][2].equals(aux[p])) && (m[1][1].equals(aux[p])) && (m[2][0].equals(aux[p]))) {
            cond = true;
        }
        
        return cond;
    }
    
    public static String[][] preenche(String[][] m, int p, int i, int j) {
        
        String[] aux = {"X", "O"};
        
        m[i][j] = aux[p];
        
        return m;
    }
    
    public static String[][] inicia(String[][] m) {
        
        int i, j;
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                m[i][j] = "_";
            }
        }
        
        return m;
    }
    
    public static void exibe(String[][] m) {
        
        System.out.printf("\n\n Matrix: ");
        for (int i = 0; i < 3; i++) {
            System.out.printf("\n   %s %s %s", m[i][0], m[i][1], m[i][2]);
        }
        System.out.printf("\n");
    }
    
    public static int read(String s) {
        Scanner scan = new Scanner(System.in);
        
        int n = -1;
        while ((n < 0) || (n > 2)) {
            System.out.printf("\n Informe a %s: ", s);
            n = scan.nextInt();

            if ((n < 0) || (n > 2)) {
                System.out.printf("\n\n Erro: %s inválida!\n", s);
            }
        }
        
        return n;
    }
    
    public static void main(String[] args) {
        
        String[][] m = new String[3][3];
        
        m = inicia(m);
        
        int cond = 3;
        int p = 0;
        int count = 1;
        while (cond == 3) {
            System.out.printf("\n --< Jogador %d >-- \n", p + 1);
            
            int i = 0;
            int j = 0;
            
            int loop = 0;
            while (loop == 0) {
                i = read("linha");
                j = read("coluna");
                
                if (m[i][j].equals("_")) {
                    loop = 1;
                } else {
                    System.out.printf("\n\n Erro: Posição inválida!\n");
                }
            }
            
            preenche(m, p, i, j);
            
            exibe(m);
            
            if (verifica(m, p)) {
                cond = p;
            }
            
            if (p == 0) {
                p = 1;
            } else {
                p = 0;
            }
            
            if (count == 9) {
                cond = 2;
            } else {
                count++;
            }
        }
        
        switch (cond) {
            case 0: {
                System.out.printf("\n Vitória do jogador 1!");
            } break;
            case 1: {
                System.out.printf("\n Vitória do jogador 2!");
            } break;
            case 2: {
                System.out.printf("\n Empate!");
            } break;
            default: {
                System.out.printf("\n Erro!");
            }
        }
    }
}