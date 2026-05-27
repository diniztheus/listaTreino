package questoes;

import java.util.Scanner;
import java.lang.Math;

public class Questao12 {
    //Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da base que serão digitados.
    Scanner scanner = new Scanner(System.in);
    private float altura;
    private float raio;
    private float volume;
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public float getRaio() {
        return raio;
    }
    public void setRaio(float raio) {
        this.raio = raio;
    }
    public float getVolume() {
        return volume;
    }
    public void setVolume(float volume) {
        this.volume = volume;
    }
    public void receberAltura() {
        System.out.println("Digite a altura do cone: ");
        altura = scanner.nextFloat();
    }
    public void receberRaio() {
        System.out.println("Digite o raio da base do cone: ");
        raio = scanner.nextFloat();
    }
    public void calcularVolume() {
        volume = (float) (Math.PI * Math.pow(raio, 2) * altura / 3);
        System.out.println("O volume do cone é: " + volume);
    }
}
