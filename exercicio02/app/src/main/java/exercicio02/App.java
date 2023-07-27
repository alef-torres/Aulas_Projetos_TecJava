package exercicio02;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int j =  sc.nextInt();
        int[] vetor01 = new int[j];
        
        
        for (int i=0;i<j;i++){
            
            int n = sc.nextInt();
            
                if(n>0){                   
                    vetor01[i] = n;
                    System.out.println(n+ " = Positivo");
                } else {
                    System.out.println(n+ " = Negativo");
                }
               
        }
        
        System.out.println();
        System.out.println();
        System.out.print("Todos os positivos");
        for (int i=0;i<j;i++){
            
            if (vetor01[i]>0)
                System.out.print(", " + vetor01[i]);
        } 
      
        /*
            exercicio de pratica de vetor com estruta de repeticao for, onde o
            codigo le o tamanho do vetor na variavel j, faz o loop para verificar
            se os numeros sao positivos ou negativos, se positivo eles sao
            guardados dentro do vetor e depois outro loop para mostrar os valores
            do vetor.

        **/
        
    }
}
