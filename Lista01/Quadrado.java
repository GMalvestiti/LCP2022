// Exercício 06
// Gustavo Silva Malvestiti

public class Quadrado implements Geometria {
    
    private float area;
    private float perimetro;
    private float lado;
    
    public Quadrado(float lado) {
        this.lado = lado;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea() {
        this.area = this.lado * this.lado;
    }

    @Override
    public void definePerimetro() {
        this.perimetro = 4 * this.lado;
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

    public float getLado() {
        return this.lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
}