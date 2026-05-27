package questoes;

import java.util.Scanner;

public class Questao09 {
    //Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e
    //corrente elétrica que serão digitados. Utilize a lei de Ohm.

    private float resistencia;
    private float corrente;
    private float tensao;

    public float getResistencia() {
        return resistencia;
    }
    public void setResistencia(float resistencia) {
        this.resistencia = resistencia;
    }
    public float getCorrente() {
        return corrente;
    }
    public void setCorrente(float corrente) {
        this.corrente = corrente;
    }
    public float getTensao() {
        return tensao;
    }
    public void setTensao(float tensao) {
        this.tensao = tensao;
    }
    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Bem-Vindo á calculadora de tensão ---\n");
        System.out.println("Digite o valor da resistência: ");
        resistencia = scanner.nextFloat();
        System.out.println("Digite o valor da corrente: ");
        corrente = scanner.nextFloat();
    }
    public void calcularTensao(){
        tensao = resistencia * corrente;
        System.out.println("A tensão é: " + tensao);
    }
}
