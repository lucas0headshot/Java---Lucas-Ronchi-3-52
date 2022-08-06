/*Lucas Teixeira Ronchi
Exercício 3 da página 33
Ler um número e informar se ele é par ou ímpar e ou primo*/

import java.util.Scanner; //Importar Scanner
public class Ex_3_Pag_33 {
    public static void main(String[] args) {
        int num; // Variável

        Scanner Ler = new Scanner(System.in); // Criar Scanner

        System.out.print("Digite um número: "); //Lê um número
        num = Ler.nextInt();

        if (TestarPrimo(num)){ //If utilizando método para testar se é primo
            if (num % 2 == 0){ //If para testar se é par ou impar
                System.out.println(num + " é par e primo");
            }else{
                System.out.println(num + " é impar e primo");
            }
        }else{
            if (num % 2 == 0){
                System.out.println(num + " é par mas não é primo");
            }else{
                System.out.println(num + " é impar mas não é primo");
            }
        }

        Ler.close(); //Fecha Scanner
    }

    public static boolean TestarPrimo(int num2) { //Método que testa se é um número primo
        for (int primo = 2; primo < num2; primo++){
            if (num2 % primo == 0) //If que testa se o número é primo
                return false;
            }
                return true;
    }
}