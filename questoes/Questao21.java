package questoes;
import java.util.Scanner;

public class Questao21 {
    //Entrar com dois valores quaisquer. Exibir o maior deles, se existir, caso contrário, enviar mensagem avisando que os números são idênticos.
    Scanner scanner = new Scanner(System.in);
    //valores em vetor
    private float[] valores = new float[2];
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
    }
    public void calcularMaiorValor() {
        if (valores[0] > valores[1]) {
            System.out.println("O maior valor é: " + valores[0]);
        } else if(valores[1] > valores[0]) {
            System.out.println("O maior valor é: " + valores[1]);
        }else {
            System.out.println("Os valores são iguais");
        }
    }
}
