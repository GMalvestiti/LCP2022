// Exercício 04
// Gustavo Silva Malvestiti

public class ChamaAnimal {
    
    public static void main(String[] args) {
        Cachorro dog = new Cachorro();
        dog.setIdade(5);
        dog.setNome("Dog");
        
        Passaro cat = new Passaro();
        cat.setIdade(3);
        cat.setNome("Cat");
        
        Passaro bird = new Passaro();
        bird.setIdade(1);
        bird.setNome("Bird");
        
        System.out.print(dog.toString());
        System.out.print(cat.toString());
        System.out.print(bird.toString());
    }
}