// Exercício 05
// Gustavo Silva Malvestiti

import java.util.Scanner;

public class Telefones {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String s = "";
        
        while ((s.length() < 10) || (s.length() > 11)) {
            System.out.printf("\n Informe o número de telefone: ");
            s = scan.nextLine();
            
            if ((s.length() < 10) || (s.length() > 11)) {
                System.out.printf("\n Erro: Número Inválido!\n");
            }
        }
        
        String f, tipo;
        if (s.length() == 10) { 
            f = String.format("(%c%c) %c%c%c%c-%c%c%c%c", s.charAt(0), s.charAt(1),
                    s.charAt(2), s.charAt(3), s.charAt(4), s.charAt(5), s.charAt(6), s.charAt(7), s.charAt(8), s.charAt(9));
            tipo = "residencial";
        } else {
            f = String.format("(%c%c) %c%c%c%c%c-%c%c%c%c", s.charAt(0), s.charAt(1),
                    s.charAt(2), s.charAt(3), s.charAt(4), s.charAt(5), s.charAt(6), s.charAt(7), s.charAt(8), s.charAt(9), s.charAt(10));
            tipo = "celular";
        }
        
        String ddd;
        String[] aux = f.split(" ");
        ddd = String.valueOf(aux[0].charAt(1)) + String.valueOf(aux[0].charAt(2));
        aux = aux[1].split("-");
        
        System.out.printf("\n Tipo = Número de telefone %s.\n Número = %s.\n O DDD é %s e o número de telefone é %s%s.", tipo, f, ddd, aux[0], aux[1]);
    }
}