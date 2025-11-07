package school.sptech;

public class Circulo extends Figura{
    Double raio;

    public Circulo() {}

    public Circulo(String cor, Integer espessura, Double raio) {
        super(cor, espessura);
        this.raio = raio;
    }
    public Double getRaio() {
        return raio;
    }

    public void setRaio(Double raio) {
        this.raio = raio;
    }

    @Override
    public Double calcularArea(){
        return (raio * Math.PI);
    }

    @Override public String toString() {
        return("Este Circulo tem o raio " + raio + " e multiplicando pelo valor de PI, dá o total de " + calcularArea());
    }

}
