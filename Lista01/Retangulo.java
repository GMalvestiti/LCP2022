// Exercício 06
// Gustavo Silva Malvestiti

public class Retangulo implements Geometria {
    
    private float area;
    private float perimetro;
    private float lado1;
    private float lado2;
    
    public Retangulo(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea() {
        this.area = this.lado1 * this.lado2;
    }

    @Override
    public void definePerimetro() {
        this.perimetro = (2 * this.lado1) + (2 * this.lado2);
    }

    public float getArea() {
        return this.area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public float getPerimetro() {
        return this.perimetro;
    }

    public void setPerimetro(float perimetro) {
        this.perimetro = perimetro;
    }

    public float getLado1() {
        return this.lado1;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public float getLado2() {
        return this.lado2;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }
}