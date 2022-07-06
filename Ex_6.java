//Lucas Teixeira Ronchi 3-52
//Página 33 da apostila de Java
//Converter de quilos para libras e vice-versa

import java.util.Scanner; //Importar Scanner

public class Ex_6 {
    public static void main(String[] args){
        float peso; //Variáveis
        String tipo;
        Scanner Ler = new Scanner(System.in);

        System.out.println("Digite um peso(Libras ou Quilos): "); //Entrada
        peso = Ler.nextFloat();
        System.out.println("Digite o tipo de peso('l' = Libras / 'q' = quilos): ");
        tipo = Ler.next();

        if (tipo == "l"){
            System.out.println("Quilos: " + (peso - (peso * 2.2046)));
            System.out.println("Libras: " + peso * 2.2046); 
        }else{
            System.out.println("Libras: " + peso * 2.2046);
            System.out.println("Quilos: " + (peso - (peso * 2.2046)));
        }
        Ler.close();
    }
}