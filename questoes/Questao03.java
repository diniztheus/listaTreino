package questoes;

import java.util.Scanner;

public class Questao03 {
    private float diagonal;

    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a diagonal do quadrado: ");
        diagonal = scanner.nextFloat();
    }

    public float calcularArea(){
        float area;
        area = (diagonal * diagonal)/2;
        System.out.println("A área do quadrado é: " + area);
        return area;
    }
}
