//Lucas Teixeira Ronchi 3-52
//Página 33 da apostila de Java
//Somar os números ímpares entre 0 e 30
//Multiplicar os pares entre 0 e 30

public class Ex_1 {
    public static void main(String[] args){
        int totalImpar = 0;
        long totalPar = 1; //Começa em 1 porquê não é possível multiplicar se começar em 0
        int num;
      
        for(num = 0; num <= 30; num++) { //For para verificar, somar ou multiplicar
          if((num % 2 == 1)) { //Se o número dividido por 2 for 1
            totalImpar += num; //Soma se o número for ímpar
          }else{
            totalPar *= num; //Multiplica se o número for par
          }
       }        
       System.out.println("Multiplicação dos pares: " + totalPar);
       System.out.println("Soma dos ímpares: " + totalImpar); //Exibe os resultados        
    }
}