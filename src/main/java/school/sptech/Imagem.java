package school.sptech;
import java.util.ArrayList;
import java.util.List;

public class Imagem{
    private ArrayList<Figura> figuras;

    public Imagem(String number) {}

    public ArrayList<Figura> getFiguras() {
        return figuras;
    }
    Imagem imagem = new Imagem("1");

    public void setFiguras(ArrayList<Figura> figuras) {
        this.figuras = figuras;
    }

    public Imagem(ArrayList<Figura> figuras) {
        this.figuras = new ArrayList<>();
    }

    public void adicionar (Figura figura) {
        figuras.add(figura);
    }

    public Double calcularSomaDasAreas() {
        double somaAreas = 0.0;
        for (int i = 0; i < figuras.size(); i ++) {
            somaAreas = figuras.get(i).calcularArea();
        }
        return somaAreas;
    }


    public List<Figura> buscarPorAreaMaiorQue20() {
        List<Figura> figurasMaiores = new ArrayList<>();

        for (Figura f : figuras) {
            if (f.calcularArea() > 20.0) {
                figurasMaiores.add(f);
            }
        }

        return figurasMaiores;
    }

    public List<Figura> buscarQuadrados() {
        List<Figura> quadrados = new ArrayList<>();

        for (Figura f : figuras) {
            if (f instanceof Quadrado) {
                quadrados.add(f);
            }
        }

        return quadrados;
    }

}
