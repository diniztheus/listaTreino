package questoes;

import java.util.Scanner;

public class Questao16 {
    /*  Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as seguintes funções
trigonométricas: seno, coseno, tangente e secante deste ângulo. Lembre-se que uma função
trigonométrica trabalha em radianos. */
    Scanner scanner = new Scanner(System.in);
    private float angulo;
    private float seno;
    private float coseno;
    private float tangente;
    private float secante;
    public float getAngulo() {
        return angulo;
    }
    public void setAngulo(float angulo) {
        this.angulo = angulo;
    }
    public float getSeno() {
        return seno;
    }
    public void setSeno(float seno) {
        this.seno = seno;
    }
    public float getCoseno() {
        return coseno;
    }
    public void setCoseno(float coseno) {
        this.coseno = coseno;
    }
    public float getTangente() {
        return tangente;
    }
    public void setTangente(float tangente) {
        this.tangente = tangente;
    }
    public float getSecante() {
        return secante;
    }
    public void setSecante(float secante) {
        this.secante = secante;
    }
    
    public void receberAngulo() {
        System.out.println("Digite o ângulo em graus: ");
        angulo = scanner.nextFloat();
    }
    public void calcularSeno() {
        seno = (float) Math.sin(angulo);
        System.out.println("O seno do ângulo é: " + seno);
    }
    public void calcularCoseno() {
        coseno = (float) Math.cos(angulo);
        System.out.println("O coseno do ângulo é: " + coseno);
    }
    public void calcularTangente() {
        tangente = (float) Math.tan(angulo);
        System.out.println("A tangente do ângulo é: " + tangente);
    }
    public void calcularSecante() {
        secante = 1 / (float) Math.cos(angulo);
        System.out.println("A secante do ângulo é: " + secante);
    }
}
