package exercicio01;

import java.util.Scanner;

public class App {
    

    public static void main(String[] args) {
 
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um valor para verificar se esta entre 0 ate 200");
        int n = sc.nextInt();
        
        
        if (n>0 && n<200){
            System.out.print("O numero digitado esta entre 0 ate 200");
        } else {
            System.out.print("Nao esta entre 0 ate 200");
        }
        
        
        
    }
}
            