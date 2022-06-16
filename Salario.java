/*
Crie um algoritmo que leia o valor do salário mínimo e o valor do salário de um usuário,
calcule a quantidade de salários mínimos esse usuário ganha e imprima o resultado.
(1SM=R$788,00)
*/

import java.util.Scanner;

public class Salario {

    public static void main(String[] args) {
        double sMinimo = 788;
        double sUsuario;
        double sMinimoTotal;
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor do salário do usuário: ");
        sUsuario = input.nextDouble();
        sMinimoTotal = sUsuario / sMinimo;
        System.out.println("O usuário recebe " + sMinimoTotal + " salários.");
    }
}