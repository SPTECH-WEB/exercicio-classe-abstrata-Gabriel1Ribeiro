package school.sptech;

public class Retangulo extends Figura{
    Double base;
    Double altura;

    public Retangulo() {}

    public Retangulo(String cor, Integer espessura, Double base, Double altura) {
        super(cor, espessura);
        this.base = base;
        this.altura = altura;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    @Override
    public Double calcularArea(){
        return base * altura;
    }

    @Override public String toString() {
        return("Este retângulo tem a altura " + altura + " e a base " + base + ", dando a área de: " + (base * altura));
    }
}
