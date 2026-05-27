package questoes;

import java.util.Scanner;

public class Questao15 {
    //Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de dólares. Calcular e exibir o valor correspondente em Reais (R$).
    Scanner scanner = new Scanner(System.in);
    private float cotacaoDolar;
    private float quantidadeDolares;
    private float valorEmReais;
    public float getCotacaoDolar() {
        return cotacaoDolar;
    }
    public void setCotacaoDolar(float cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }
    public float getQuantidadeDolares() {
        return quantidadeDolares;
    }
    public void setQuantidadeDolares(float quantidadeDolares) {
        this.quantidadeDolares = quantidadeDolares;
    }
    public float getValorEmReais() {
        return valorEmReais;
    }
    public void setValorEmReais(float valorEmReais) {
        this.valorEmReais = valorEmReais;
    }
    
    public void receberCotacaoDolar() {
        System.out.println("Digite a cotação do dólar: ");
        cotacaoDolar = scanner.nextFloat();
    }
    public void receberQuantidadeDolares() {
        System.out.println("Digite a quantidade de dólares: ");
        quantidadeDolares = scanner.nextFloat();
    }
    public void calcularValorEmReais() {
        valorEmReais = cotacaoDolar * quantidadeDolares;
        System.out.println("O valor em reais é: " + valorEmReais);
    }
}
