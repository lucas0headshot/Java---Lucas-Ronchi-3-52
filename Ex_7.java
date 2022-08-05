/*Lucas Teixeira Ronchi 3-52
Exercício 7 proposto em sala
Ler um número e exibir o seu antecessor*/

import java.util.Scanner; //Importar Scanner

public class Ex_7 {
    public static void main(String[] args) {
        int num;
        Scanner Ler = new Scanner(System.in); // Criar Scanner
        System.out.print("Digite um número: "); // Usuário digita um número
        num = Ler.nextInt();
        System.out.print("Antecessor: " + (num - 1)); // Informa o antecessor do número

        Ler.close(); // Fecha Scanner
    }
}
