/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Filas;

import Util.Fila;
import javax.swing.JOptionPane;

public class App {

    public static void main(String[] args) {
        Fila fila = new Fila(10);

        int i, entrada = 0;

        for (i = 1; i <= 10; i++) {

            entrada = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro"));
            
            

         if (entrada % 2 == 0) {

                fila.Enfileirar(entrada);

            }

        }

        fila.MostrarFila();

        System.exit(0);

    }
}