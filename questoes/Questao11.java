package questoes;

import java.util.Scanner;
import java.lang.Math;

public class Questao11 {
    //A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
    Scanner scanner = new Scanner(System.in);
    private float diametro;
    private float area;
    public float getDiametro() {
        return diametro;
    }
    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }
    public float getArea() {
        return area;
    }
    public void setArea(float area) {
        this.area = area;
    }
    public void receberDiametro() {
        System.out.println("Digite o diâmetro do círculo: ");
        diametro = scanner.nextFloat();
    }
    public void calcularArea() {
        area = (float) (Math.PI * Math.pow(diametro / 2, 2));
        System.out.println("A área do círculo é: " + area);
    }
}
