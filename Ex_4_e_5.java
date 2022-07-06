//Lucas Teixeira Ronchi 3-52
//Calcular o salário usando como base o valor da hora de trabalho e mutiltiplicando pela quantidade de horas trabalhadas
import java.util.Scanner; //Importar Scanner

public class Ex_4_e_5 {
    public static void main(String[] args) {
        float vHora, hTrabalhadas, sal; //Variáveis
        Scanner Ler = new Scanner(System.in); //Criar Scanner

        System.out.print("Digite o valor da hora de trabalho: ");
        vHora = Ler.nextFloat();
        System.out.print("Digite o número de horas trabalhadas: ");
        hTrabalhadas = Ler.nextFloat();
        
        sal = (hTrabalhadas * vHora); //Calcular salário
        
        if (sal < 50){ //Verifica se o sal é menor que 50
            System.out.println("Salário é infeiror à R$50!");
            System.out.println("Atenção, dirija-se em direção ao Hotel!");
        }else{
            System.out.println("Salário: " + sal); //Imprimir salário
        }
        Ler.close(); //Fecha Scanner
    }
}
