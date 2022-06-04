// Exercício 07
// Gustavo Silva Malvestiti

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Exercicio07 {
    
    private String curso;
    private String nome;
    private int idade;
    private int RA;
    
    public Exercicio07(String curso, String nome, int idade, int RA) {
        this.curso = curso;
        this.nome = nome;
        this.idade = idade;
        this.RA = RA;
    }
    
    public Exercicio07() {
        this.curso = "";
        this.nome = "";
        this.idade = 0;
        this.RA = 0;
    }
    
    public static ArrayList<Exercicio07> adiciona(ArrayList<Exercicio07> a) {
        Scanner scan = new Scanner(System.in);
        
        Exercicio07 e = new Exercicio07();
        
        System.out.printf("\n Informe o curso: ");
        e.setCurso(scan.nextLine());
        
        System.out.printf("\n Informe o nome: ");
        e.setNome(scan.nextLine());
        
        System.out.printf("\n Informe a idade: ");
        e.setIdade(scan.nextInt());
        
        boolean cond = true;
        while (cond) {
            System.out.printf("\n Informe o RA: ");
            e.setRA(scan.nextInt());
            
            ListIterator it = a.listIterator();
            
            cond = false;
            while(it.hasNext()) {
                Exercicio07 aux = (Exercicio07) it.next();
                
                if (e.getRA() == aux.getRA()) {
                    System.out.printf("\n Erro: RA já existe!\n");
                    cond = true;
                }
            }
        }
        
        a.add(e);
        
        return a;
    }
    
    public static ArrayList<Exercicio07> remove(ArrayList<Exercicio07> a) {
        Scanner scan = new Scanner(System.in);
        
        int ra;
        boolean cond = true;
        Exercicio07 re = null;
        while (cond) {
            System.out.printf("\n Informe o RA: ");
            ra = scan.nextInt();
            
            ListIterator it = a.listIterator();
            
            while(it.hasNext()) {
                Exercicio07 aux = (Exercicio07) it.next();
                
                if (ra == aux.getRA()) {
                    re = aux;
                    cond = false;
                }
            }
            
            if (cond) {
                System.out.printf("\n Erro: RA não encontrado!\n");
            }
        }
        
        a.remove(re);
        
        return a;
    }
    
    public static void exibe(ArrayList<Exercicio07> a) {
        ListIterator it = a.listIterator();
        
        System.out.printf("\n Lista:");
        while (it.hasNext()) {
            System.out.printf(it.next().toString());
        }
    }
    
    @Override
    public String toString() {
        return "\n    Curso: " + this.curso + "\n    Nome: " + this.nome + "\n    Idade: " + this.idade + "\n    RA: " + this.RA + "\n";
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        ArrayList<Exercicio07> a = new ArrayList<Exercicio07>();
        
        a.add(new Exercicio07("Computação", "Gustavo", 22, 111));
        a.add(new Exercicio07("Biologia", "Diego", 21, 122));
        a.add(new Exercicio07("Computação", "Gabriela", 21, 133));
        a.add(new Exercicio07("Matemática", "Pedro", 25, 144));
        a.add(new Exercicio07("Física", "Amanda", 23, 155));
        
        int op = 0;
        while (op != 4) {
            System.out.printf("\n Informe a operação:\n 1 - Para Adicionar\n 2 - Para Remover\n 3 - Para Exibir\n 4 - Para Sair\n Operação: ");
            op = scan.nextInt();
            
            switch(op) {
                case 1: {
                    a = adiciona(a);
                } break;
                case 2: {
                    a = remove(a);
                } break;
                case 3: {
                    exibe(a);
                } break;
                case 4: {
                    System.out.printf("\n Finalizando...");
                } break;
                default: {
                    System.out.printf("\n Erro: Operação Inválida!");
                }
            }
        }
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getRA() {
        return this.RA;
    }

    public void setRA(int RA) {
        this.RA = RA;
    }
}