package questoes;

import java.util.Scanner;
import java.lang.Math;
public class Questao05 {
    //Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que será digitado.
    private float diametro;

    public float getDiametro() {
        return diametro;
    }

    public void setDiametro(float diametro) {
        this.diametro = diametro;
    }

    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o diâmetro da esfera: ");
        diametro = scanner.nextFloat();
    }

    public void calcularVolume(){
        double volume = (4/3) * Math.PI * Math.pow(diametro/2, 3);
        System.out.println("O volume da esfera é: " + volume);
    }
}
