package questoes;

import java.util.Scanner;

public class Questao02 {
    //Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será digitado.
    private int aresta;

    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a aresta do quadrado: ");
        aresta = scanner.nextInt();
    }

    public void calcularArea(){
        int area = aresta * aresta;
        System.out.println("A área do quadrado é: " + area);
    }
}
