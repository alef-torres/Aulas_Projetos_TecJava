package exercicio03;

import java.util.Locale;
import java.util.Scanner;
import jdk.jshell.execution.LocalExecutionControlProvider;

public class App {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        char resp;
        double totalApagar = 0;
        
        
        
        do {
        
        System.out.println("-------------------------------------------------");
        System.out.println("Digite o ano do carro: ");
        int anoVeiculo = sc.nextInt();
        System.out.println("Digite o valor do carro");
        double valorCarro = sc.nextDouble();
        
        double desconto = calcularDesconto(anoVeiculo,valorCarro);
        double totalApagarCarro = valorCarro - desconto;
        System.out.printf("O valor do desconto e: %.2f\n", desconto);
        System.out.printf("Total a pagar do carro e: %.2f\n" , totalApagarCarro);
        System.out.println("gostaria de repetir ? sim/nao ");
        resp = sc.next().charAt(0);            
        totalApagar += totalApagarCarro; 
                
        
        
        } while (resp == 's');
        System.out.println("==================================================");
        System.out.printf("Total a pagar e: %.2f" , totalApagar );
        
    }
    
    
    public static double calcularDesconto(int anoVeiculo, double valorCarro){
        double desconto = 0;
        double carro = valorCarro;
        if (anoVeiculo < 2000){
            desconto = carro * 0.12;
            return desconto;
            
        } else {
            desconto = carro * 0.07;
            return desconto;
        }
    }

}
