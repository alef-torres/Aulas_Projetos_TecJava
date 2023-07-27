package EuTrabalhoEsseDiaAi;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        
        System.out.println("Ola, vc gostaria de saber qual dia do mes vc trabalha ? sim/nao");
        char resp01 = sc.next().charAt(0);
        sc.nextLine();
        
        
        do {
            
            System.out.println("---------------------------------------------");
            System.out.println("Vc trabalha hj ? sim/nao");
            char resp02 = sc.next().charAt(0);
            System.out.println("Informe o numero da data de hoje:");
            int resp03 = sc.nextInt();
            System.out.println("Agora informe o dia da pesquisa:");
            int resp04 = sc.nextInt();
            
               if (resp03 >= 1 && resp03 <= 31 && resp04 >= 1 && resp04 <= 31) {
                if (resp02 == 's') {
                    if (resp03 % 2 == 0 && resp04 % 2 == 0) {
                        System.out.println("Vc trabalha dia: " + resp04);
                    } else {
                        System.out.println("Vc nao trabalha dia: " + resp04);
                    }
                } else {
                    if (resp03 % 2 > 0 && resp04 % 2 > 0) {
                        System.out.println("Vc trabalha dia " + resp04);
                    } else {
                        System.out.println("Vc nao trabalha dia: " + resp04);
                    }
                }
            } else {
                System.out.println("Esse dia n existe");
            }
            
  
            System.out.println("Deseja saber para outro dia? sim/nao");
            resp01 = sc.next().charAt(0);
            sc.nextLine();
        } while (resp01 == 's' || resp01 == 'S'); //fim while
  }  
}

