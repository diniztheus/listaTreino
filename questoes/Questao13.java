package questoes;

import java.util.Scanner;

public class Questao13 {
    //Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos valores da velocidade inicial(em m/s), da aceleração (m/s2) e do tempo de percurso (em s) que serão digitados.
    Scanner scanner = new Scanner(System.in);
    private float velocidadeInicial;
    private float aceleracao;
    private float tempo;
    private float velocidadeFinal;
    public float getVelocidadeInicial() {
        return velocidadeInicial;
    }
    public void setVelocidadeInicial(float velocidadeInicial) {
        this.velocidadeInicial = velocidadeInicial;
    }
    public float getAceleracao() {
        return aceleracao;
    }
    public void setAceleracao(float aceleracao) {
        this.aceleracao = aceleracao;
    }
    public float getTempo() {
        return tempo;
    }
    public void setTempo(float tempo) {
        this.tempo = tempo;
    }
    public float getVelocidadeFinal() {
        return velocidadeFinal;
    }
    public void setVelocidadeFinal(float velocidadeFinal) {
        this.velocidadeFinal = velocidadeFinal;
    }
    public void receberVelocidadeInicial() {
        System.out.println("Digite a velocidade inicial: ");
        velocidadeInicial = scanner.nextFloat();
    }
    public void receberAceleracao() {
        System.out.println("Digite a aceleração: ");
        aceleracao = scanner.nextFloat();
    }
    public void receberTempo() {
        System.out.println("Digite o tempo: ");
        tempo = scanner.nextFloat();
    }
    public void calcularVelocidadeFinal() {
        velocidadeFinal = velocidadeInicial + aceleracao * tempo;
        System.out.println("A velocidade final é: " + velocidadeFinal);
    }
}