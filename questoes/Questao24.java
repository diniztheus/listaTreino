package questoes;
import java.util.Scanner;

public class Questao24 {
    //Entrar via teclado com três valores distintos. Exibir o maior deles.
    Scanner scanner = new Scanner(System.in);
    //valores em vetor
    private float[] valores = new float[3];
    public float[] getValores() {
        return valores;
    }
    public void setValores(float[] valores) {
        this.valores = valores;
    }
    public void receberValores() {
        System.out.println("Digite o primeiro valor: ");
        valores[0] = scanner.nextFloat();
        System.out.println("Digite o segundo valor: ");
        valores[1] = scanner.nextFloat();
        System.out.println("Digite o terceiro valor: ");
        valores[2] = scanner.nextFloat();
    }
    public void calcularMaiorValor() {
        if (valores[0] > valores[1] && valores[0] > valores[2]) {
            System.out.println("O maior valor é: " + valores[0]);
        } else if (valores[1] > valores[0] && valores[1] > valores[2]){
            System.out.println("O maior valor é: " + valores[1]);
        } else {
            System.out.println("O maior valor é: " + valores[2]);
        }
    }
}
