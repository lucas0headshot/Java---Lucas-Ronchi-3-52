/*Lucas Teixeira Ronchi
Exercício 3 da página 33
Ler um número e informar se ele é par ou ímpar e ou primo*/

import java.util.Scanner; //Importar Scanner

public class Ex_3_Pag_33 {
    public static void main(String[] args) {
        int num; // Variáveis
        Scanner Ler = new Scanner(System.in); // Criar Scanner

        System.out.print("Digite um número: ");

        // Desvio Condicional
        if (Primo(num)) {
            System.out.println(num + " é primo");
        } else {
            System.out.println(num + " não é primo");
        }

        if (num % 2 == 0) { // Desvio para informar se é par ou impar
            System.out.println(num + " é par");
        } else {
            System.out.println(num + " é impar");

            Ler.close();
        }
    }

    public static boolean Primo(int numero) { // Faz retornar um valor verdadeiro ou falso
        for (int num = 2; num < numero; num++) { // Contar apartir do numero 2 (0 e 1 ta contando como se fosse primo)
            if (numero % num == 0)
                return false;
        }
        return true;

    }
}