package questoes;

import java.util.Scanner;

public class Questao04 {
    //A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
    private float altura;
    private float base;

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do retângulo: ");
        altura = scanner.nextInt();
        System.out.println("Digite a base do retângulo: ");
        base = scanner.nextInt();
    }

    public void calcularArea(){
        float area = (altura * base) / 2;
        System.out.println("A área do retângulo é: " + area);
    }

    public float getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
