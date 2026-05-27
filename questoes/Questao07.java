package questoes;

import java.util.Scanner;

public class Questao07 {
    //Calcular e exibir a média geométrica de dois valores quaisquer que serão digitados.
    private float valor1;
    private float valor2;
    private float mediaGeometrica;

    public float getValor1() {
        return valor1;
    }
    public void setValor1(float valor1) {
        this.valor1 = valor1;
    }
    public float getValor2() {
        return valor2;
    }
    public void setValor2(float valor2) {
        this.valor2 = valor2;
    }
    public float getMediaGeometrica() {
        return mediaGeometrica;
    }
    public void setMediaGeometrica(float mediaGeometrica) {
        this.mediaGeometrica = mediaGeometrica;
    }
    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextFloat();
        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextFloat();
    }

    public void calcularMediaGeometrica(){
        mediaGeometrica = (float) Math.sqrt(valor1 * valor2);
        System.out.println("A média geométrica é: " + mediaGeometrica);
    }
}
