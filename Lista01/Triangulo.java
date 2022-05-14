// Exercício 06
// Gustavo Silva Malvestiti

public class Triangulo implements Geometria {
    
    private float area;
    private float perimetro;
    private float hip;
    private float cat1;
    private float cat2;
    
    public Triangulo(float hip, float cat1, float cat2) {
        this.hip = hip;
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.defineArea();
        this.definePerimetro();
    }
    
    @Override
    public void defineArea() {
        this.area = (this.cat1 * this.cat2) / 2;
    }

    @Override
    public void definePerimetro() {
        this.perimetro = this.hip + this.cat1 + this.cat2;
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

    public float getHip() {
        return this.hip;
    }

    public void setHip(float hip) {
        this.hip = hip;
    }

    public float getCat1() {
        return this.cat1;
    }

    public void setCat1(float cat1) {
        this.cat1 = cat1;
    }

    public float getCat2() {
        return this.cat2;
    }

    public void setCat2(float cat2) {
        this.cat2 = cat2;
    }
}