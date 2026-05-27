package questoes;

import java.util.Scanner;

public class Questao17 {
    /* Entrar via teclado com dois valores quaisquer “X” e “X”. Calcular e exibir o cálculo XY

(“X” elevado a

“Y”). Pesquisar as funções Exp e Ln. */
    Scanner scanner = new Scanner(System.in);
    private float x;
    private float y;
    private float resultado;
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public float getResultado() {
        return resultado;
    }
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    public void receberX() {
        System.out.println("Digite o valor de X: ");
        x = scanner.nextFloat();
    }
    public void receberY() {
        System.out.println("Digite o valor de Y: ");
        y = scanner.nextFloat();
    }
    public void calcularResultado() {
        resultado = (float) Math.pow(x, y);
        System.out.println("O resultado é: " + resultado);
    }
}
