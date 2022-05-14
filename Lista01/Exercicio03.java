// Exercício 03
// Gustavo Silva Malvestiti

public class Exercicio03 {
    
    private String nome;
    private int idade;
    private float salario;
    
    public Exercicio03(String nome, int idade, float salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }
    
    public float contribuicaoF() {
        float sobra = 0;
        float salario = this.salario;
        if (salario > 5000) {
            sobra = salario - 5000;
            salario = 5000;
        }
        
        if (this.idade <= 30) {
            salario *= 0.8;
        } else if (this.idade <= 40) {
            salario *= 0.82;
        } else if (this.idade <= 50) {
            salario *= 0.88;
        } else if (this.idade <= 60) {
            salario *= 0.93;
        } else {
            salario *= 0.97;
        }
        
        salario += sobra;
        
        return salario;
    }
    
    public float contribuicaoE() {
        float salario = this.salario;
        if (salario > 5000) {
            salario = 5000;
        }
        
        if (this.idade <= 30) {
            salario *= 0.18;
        } else if (this.idade <= 40) {
            salario *= 0.15;
        } else if (this.idade <= 50) {
            salario *= 0.15;
        } else if (this.idade <= 60) {
            salario *= 0.10;
        } else {
            salario *= 0.04;
        }
        
        return salario;
    }
    
    @Override
    public String toString() {
        return "\nNome: " + this.nome + "\nIdade: " + this.idade + "\nSalário: " + this.contribuicaoF() + "\nContribuição empresa: " + this.contribuicaoE() + "\n";
    }
    
    public static void main(String[] args) {
        Exercicio03 func1 = new Exercicio03("Funcionário 01", 30, 1000);
        Exercicio03 func2 = new Exercicio03("Funcionário 02", 40, 1000);
        Exercicio03 func3 = new Exercicio03("Funcionário 03", 50, 1000);
        Exercicio03 func4 = new Exercicio03("Funcionário 04", 60, 1000);
        Exercicio03 func5 = new Exercicio03("Funcionário 05", 70, 1000);
        Exercicio03 func6 = new Exercicio03("Funcionário 06", 30, 10000);
        
        System.out.printf(func1.toString());
        System.out.printf(func2.toString());
        System.out.printf(func3.toString());
        System.out.printf(func4.toString());
        System.out.printf(func5.toString());
        System.out.printf(func6.toString());
    }
}