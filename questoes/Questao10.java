package questoes;

import java.util.Scanner;

public class Questao10 {
    //Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e exibir sua temperatura equivalente em Fahrenheit.
    Scanner scanner = new Scanner(System.in);
    private float tempCelsius;
    private float fahrenheit;
    public float getTempCelsius() {
        return tempCelsius;
    }
    public void setTempCelsius(float tempCelsius) {
        this.tempCelsius = tempCelsius;
    }
    public float getFahrenheit() {
        return fahrenheit;
    }
    public void setFahrenheit(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public void receberTempCelsius() {
        System.out.println("Digite a temperatura em Celsius: ");
        tempCelsius = scanner.nextFloat();
    }


    public void calcularFahrenheit() {
        fahrenheit = (tempCelsius * 9/5) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }

}
