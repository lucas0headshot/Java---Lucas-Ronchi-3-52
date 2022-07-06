//Lucas Teixeira Ronchi 3-52
//Página 26 da apostila de Java
//Calcular a área de um trapézio
//Arrendodar o valor para inteiro

import java.util.Scanner; //Importar Scanner

public class Ex_1_e_2 { // Classe Ex_1

    private static float h, b, B, area; // Variáveis

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in); // Criar método ler

        System.out.println("Digite a altura: "); // Entrada
        h = ler.nextFloat();
        System.out.println("Digite a base menor: ");
        b = ler.nextFloat();
        System.out.println("Digite a base maior: ");
        B = ler.nextFloat();

        area = ((h * (b + B)) / 2); // Processamento

        System.out.println("Área do trapézio (exata): " + area); // Saída
        System.out.println("Área do trapézio (arredondada): " + Math.round(area));

        ler.close();

    }
}
