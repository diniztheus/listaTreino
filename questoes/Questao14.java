package questoes;

import java.util.Scanner;

public class Questao14 {
    //Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio “r” inscrita em um cubo perfeito de aresta “a”. Os valores de “r “ e “a” serão digitados.
    Scanner scanner = new Scanner(System.in);
    private float raio;
    private float aresta;
    private float volumeLivre;
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float getAresta() {
        return aresta;
    }
    public void setAresta(float aresta) {
        this.aresta = aresta;
    }
    public float getVolumeLivre() {
        return volumeLivre;
    }
    public void setVolumeLivre(float volumeLivre) {
        this.volumeLivre = volumeLivre;
    }
    public void receberRaio() {
        System.out.println("Digite o raio da esfera: ");
        raio = scanner.nextFloat();
    }
    public void receberAresta() {
        System.out.println("Digite a aresta do cubo: ");
        aresta = scanner.nextFloat();
    }
    public void calcularVolumeLivre() {
        volumeLivre = (float) (Math.PI * Math.pow(raio, 3) * 4/3 - Math.pow(aresta, 3));
        System.out.println("O volume livre é: " + volumeLivre);
    }
}
