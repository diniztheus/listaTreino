import java.util.Scanner;
import questoes.Questao01;
import questoes.Questao02;
import questoes.Questao03;
import questoes.Questao04;
import questoes.Questao05;
import questoes.Questao06;
import questoes.Questao07;
import questoes.Questao08;
import questoes.Questao09;
import questoes.Questao10;
import questoes.Questao11;
import questoes.Questao12;
public class Menu {

    public void exibirMenu(){
        System.out.println("1. Questao01");
        System.out.println("2. Questao02");
        System.out.println("3. Questao03");
        System.out.println("4. Questao04");
        System.out.println("5. Questao05");
        System.out.println("6. Questao06");
        System.out.println("7. Questao07");
        System.out.println("8. Questao08");
        System.out.println("9. Questao09");
        System.out.println("10. Questao10");
        System.out.println("11. Questao11");
    }

    public void selecionarOpcao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma opção: ");
        int opcao = scanner.nextInt();
        switch(opcao){
            case 1:
                Questao01 questao01 = new Questao01();
                questao01.receberDados();
                questao01.calcularArea();
                break;
            case 2:
                Questao02 questao02 = new Questao02();
                questao02.receberDados();
                questao02.calcularArea();
                break;
            case 3:
                Questao03 questao03 = new Questao03();
                questao03.receberDados();
                questao03.calcularArea();
                break;
            case 4:
                Questao04 questao04 = new Questao04();
                questao04.receberDados();
                questao04.calcularArea();
                break;
            case 5:
                Questao05 q5 = new Questao05();
                q5.receberDados();
                q5.calcularVolume();
                break;
            case 6:
                Questao06 q6 = new Questao06();
                q6.receberDados();
                q6.calcularMedia();
                break;
            case 7:
                Questao07 q7 = new Questao07();
                q7.receberDados();
                q7.calcularMediaGeometrica();
                break;
            case 8:
                Questao08 q8 = new Questao08();
                q8.receberDados();
                q8.converterMilhasMaritimasParaQuilometros();
                break;
            case 9:
                Questao09 q9 = new Questao09();
                q9.receberDados();
                q9.calcularTensao();
                break;
            case 10:
                Questao10 q10 = new Questao10();
                q10.receberTempCelsius();
                q10.calcularFahrenheit();
                break;
            case 11:
                Questao11 q11 = new Questao11();
                q11.receberDiametro();
                q11.calcularArea();
                break;
            case 12:
                Questao12 q12 = new Questao12();
                q12.receberAltura();
                q12.receberRaio();
                q12.calcularVolume();
                break;
        }
        exibirMenu();
        selecionarOpcao();
    }
}
