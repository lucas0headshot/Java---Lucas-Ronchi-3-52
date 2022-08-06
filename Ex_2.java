/*Lucas Teixeira Ronchi 3-52
Exercício 2 da página 33
Imprimir números primos de 1 a 123*/

import java.util.Scanner; //Importar Scanner

public class Ex_2 { 
    public static void main(String[] args) {    
        int nums[] = new int[29]; //Variáveis
        int i = 0;

        Scanner Ler = new Scanner(System.in); // Criar Scanner

        for (int num = 2; num <= 123; num++){ 
            if (TestarPrimo(num)){
                nums[i] = Ler.nextInt(); //Adiciona o número no vetor
                i += 1;
            }
        }
        System.out.print(nums); //Imprime todos os números primos
        System.out.print("São todos números primos!"); 
        
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