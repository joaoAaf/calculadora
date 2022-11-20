import java.util.Scanner;

public class Calculadora {

//Função para pedir numeros
    Scanner leia = new Scanner(System.in);

    public double recebeNumero() {
        double numeroDouble;
        while (true) {
            String numero = leia.nextLine();
            try {
                numeroDouble = Double.parseDouble(numero);
                break;
            }
            catch (Exception e) {
                System.out.println("Número Inválido!");
                System.out.println("Digite um número:");
            }
        }
        return numeroDouble;
    }

//Operações calculadora
    public double soma() {
        return 0;
    }
    public double subtracao() {
        return 0;
    }
    public double divisao(double numeroA, double numeroB) {
        while (numeroB==0) {
            System.out.println("Não existe divisão por zero!");
            System.out.println("Digite um novo divisor:");
            numeroB = recebeNumero();
        }
        double resultado = numeroA/numeroB;
        return resultado;
    }
    public double multiplicacao(double numeroA, double numeroB) {
        double resultado = numeroA*numeroB;
        return resultado;
    }
    public double exponencial() {
        return 0;
    }
    public double raizQuadrada() {
        return 0;
    }
    public double piso() {
        return 0;
    }
    public double teto(double numero) {
        double resultado = Math.ceil(numero);
        return resultado;
    }
}
