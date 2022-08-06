/*Lucas Teixeira Ronchi 3-52
Exercício 3 da página 26
Calcular o valor das equações*/

public class Ex_3 {

    private static int a, b, c, d; // Variáveis

    public static void main(String[] args) {

        a = (3 - 2 - 1 + 2 + 1 + 3); // Processamento
        b = ((2 * 3) - (4 * 5));
        c = (2 + 6 - (3 / (7 * 9)));
        d = (3 % (4 - 8));

        System.out.println("A = " + a); // Saída
        System.out.println("B = " + b);
        System.out.println("C = " + c);
        System.out.println("D = " + d);

    }
}