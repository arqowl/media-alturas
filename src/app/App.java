package app;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPessoas = 5;
        CalculadoraMediaAltura calculadora = new CalculadoraMediaAltura(numPessoas);

        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            double altura = scanner.nextDouble();
            calculadora.adicionarPessoa(i, altura);
        }

        double mediaAltura = calculadora.calcularMediaAltura();
        System.out.printf("A média de altura das %d pessoas é: %.2f metros%n", numPessoas, mediaAltura);

        scanner.close();
	}

}
