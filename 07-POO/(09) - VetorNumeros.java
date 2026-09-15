/*Exercício 1: Vetor de Números Inteiros
Objetivo: Guardar 10 números inteiros, calcular a soma e exibir os valores na tela.
● Crie um vetor para armazenar 10 números inteiros.
● Utilize um laço for para solicitar que o usuário digite os 10 números (usando a classe Scanner).
● Ao final, exiba todos os números digitados e a soma total deles.*/

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner tc = new Scanner(System.in);

        int[] numero = new int[10];
        int soma = 0;

        for(int i = 0; i < numero.length; i++){
            System.out.println("Digite o "+(i+1)+"° número: ");
            numero[i] = tc.nextInt();
            soma += numero[i];
    }
        for(int i = 0; i < numero.length; i++){
            System.out.println("O " +(i+1)+"° número digitado foi: "+numero[i]);
    }
        System.out.println("A soma dos números é: "+soma);
}
}

   
