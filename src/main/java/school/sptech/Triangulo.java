package school.sptech;

public class Triangulo extends Figura{
    Double base;
    Double altura;

    public Triangulo() {}

    public Triangulo(String cor, Integer espessura, Double base, Double altura) {
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
        return (base * altura) / 2;
    }

    @Override public String toString() {
        return("Este triângulo tem a altura " + altura + " e a base " + base + ", dando a área de: " + (base * altura)
        + ". E dividindo por 2, dá o resultado de: " + (base * altura) / 2);
    }

}
