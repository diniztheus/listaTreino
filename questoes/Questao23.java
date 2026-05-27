package questoes;
import java.util.Scanner;

public class Questao23 {
    //Calcular e exibir a área de um retângulo, a partir dos valores da base e altura que serão digitados. Se a área for maior que 100, exibir a mensagem “Terreno grande”, caso contrário, exibir a mensagem “Terreno pequeno”.
    private int altura;
    private int base;

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public void receberDados(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a altura do retângulo: ");
        altura = scanner.nextInt();
        System.out.println("Digite a base do retângulo: ");
        base = scanner.nextInt();
    }

    public void calcularArea(){
        int area = altura * base;
        if(area > 100){
        System.out.println("Terreno Grande");
        System.out.println("A área do retângulo é: " + area);
        }else if(area <= 100){
            System.out.println("Terreno Pequeno");
            System.out.println("A área do retângulo é: " + area);
        }
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
