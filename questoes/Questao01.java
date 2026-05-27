package questoes;

import java.util.Scanner;

public class Questao01 {
    //Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua área.
    private int altura;
    private int base;

    public int getAltura() {
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
        int area = altura * base;
        System.out.println("A área do retângulo é: " + area);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
    
}
