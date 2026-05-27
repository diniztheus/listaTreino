package questoes;

import java.util.Scanner;

public class Questao08 {
    /*Sabendo que uma milha marítima equivale a um mil, oitocentos e cinqüenta e dois metros e que um
quilômetro possui mil metros, fazer um programa para converter milhas marítimas em quilômetros.*/

    private float milhaMaritima;
    private float quilometro;

    public float getMilhaMaritima() {
        return milhaMaritima;
    }
    public void setMilhaMaritima(float milhaMaritima) {
        this.milhaMaritima = milhaMaritima;
    }
    public float getQuilometro() {
        return quilometro;
    }
    public void setQuilometro(float quilometro) {
        this.quilometro = quilometro;
    }
    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de milhas marítimas: ");
        milhaMaritima = scanner.nextFloat();
        System.out.println("Digite a quantidade de quilômetros: ");
        quilometro = scanner.nextFloat();
    }
    public void converterMilhasMaritimasParaQuilometros(){
        quilometro = (float) (milhaMaritima * 1.852);
        System.out.println("A quantidade de quilômetros é: " + quilometro);
    }
}
