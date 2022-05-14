// Exercício 06
// Gustavo Silva Malvestiti

public class Circulo implements Geometria {
    
    private float area;
    private float perimetro;
    private float raio;
    
    public Circulo(float raio) {
        this.raio = raio;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea() {
        this.area = ((float) Math.PI) * this.raio * this.raio;
    }

    @Override
    public void definePerimetro() {
        this.perimetro = 2 * ((float) Math.PI) * this.raio;
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

    public float getRaio() {
        return this.raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }
}