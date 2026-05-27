package questoes;
import java.util.Scanner;

public class Questao06 {
    //Calcular e exibir a média aritmética de quatro valores quaisquer que serão digitados.
    private float valor1;
    private float valor2;
    private float valor3;
    private float valor4;
    private float media;
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
    public float getValor3() {
        return valor3;
    }
    public void setValor3(float valor3) {
        this.valor3 = valor3;
    }
    public float getValor4() {
        return valor4;
    }
    public void setValor4(float valor4) {
        this.valor4 = valor4;
    }
    public float getMedia() {
        return media;
    }
    public void setMedia(float media) {
        this.media = media;
    }

    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = scanner.nextFloat();
        System.out.println("Digite o segundo valor: ");
        valor2 = scanner.nextFloat();
        System.out.println("Digite o terceiro valor: ");
        valor3 = scanner.nextFloat();
        System.out.println("Digite o quarto valor: ");
        valor4 = scanner.nextFloat();
    }
    public void calcularMedia(){
        media = (valor1 + valor2 + valor3 + valor4) / 4;
        System.out.println("A média aritmética é: " + media);
    }
    
}
