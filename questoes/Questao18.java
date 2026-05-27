package questoes;

import java.util.Scanner;

public class Questao18 {
    /* Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um valor referente ao
pagamento da somatória destes valores. Calcular e exibir o troco que deverá ser devolvido. */
    Scanner scanner = new Scanner(System.in);
    private float valor1;
    private float valor2;
    private float valor3;
    private float valor4;
    private float valor5;
    private float valorTotal;
    private float valorPago;
    private float troco;
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
    public float getValor5() {
        return valor5;
    }
    public void setValor5(float valor5) {
        this.valor5 = valor5;
    }
    public float getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
    public float getValorPago() {
        return valorPago;
    }
    public void setValorPago(float valorPago) {
        this.valorPago = valorPago;
    }
    public float getTroco() {
        return troco;
    }
    public void setTroco(float troco) {
        this.troco = troco;
    }
    public void receberValor1() {
        System.out.println("Digite o valor do primeiro produto: ");
        valor1 = scanner.nextFloat();
    }
    public void receberValor2() {
        System.out.println("Digite o valor do segundo produto: ");
        valor2 = scanner.nextFloat();
    }
    public void receberValor3() {
        System.out.println("Digite o valor do terceiro produto: ");
        valor3 = scanner.nextFloat();
    }
    public void receberValor4() {
        System.out.println("Digite o valor do quarto produto: ");
        valor4 = scanner.nextFloat();
    }
    public void receberValor5() {
        System.out.println("Digite o valor do quinto produto: ");
        valor5 = scanner.nextFloat();
    }
    public void calcularValorTotal() {
        valorTotal = valor1 + valor2 + valor3 + valor4 + valor5;
        System.out.println("O valor total é: " + valorTotal);
    }
    public void receberValorPago() {
        System.out.println("Digite o valor pago: ");
        valorPago = scanner.nextFloat();
    }
    public void calcularTroco() {
        troco = valorPago - valorTotal;
        System.out.println("O troco é: " + troco);
    }
}
