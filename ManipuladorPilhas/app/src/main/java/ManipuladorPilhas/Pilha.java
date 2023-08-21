/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManipuladorPilhas;
/**
 *
 * @author alef_
 */
public class Pilha {

    int tamanho;
    int topo;
    int vetor[];

    Pilha(int tam) {
        topo = -1;
        tamanho = tam;
        vetor = new int[tam];

    }

    public boolean PilhaVazia() {
        if (topo == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean PilhaCheia() {
        if (topo >= tamanho - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void Empilhar(int elemento) {
        if (!PilhaCheia()) {
            topo++;
            vetor[topo] = elemento;
        } else {
            System.out.println("Pilha cheia");
        }
    }

    public int Desempilhar() {
        int desempilhado = 0;

        if (PilhaVazia()) {
            System.out.println("Pilha Vazia");
        } else {
            desempilhado = vetor[topo];
            topo--;
        }
        return desempilhado;
    }

    public void ElementoTopo() {
        if (topo >= 0) {
            System.out.println("O elemento do topo é " + vetor[topo]);
        } else {
            System.out.println("Pilha Vazia");
        }
    }

    public String mostrarPilha() {
        StringBuilder resultado = new StringBuilder();
        for (int i = topo; i >= 0; i--) {
            resultado.append("Elemento ").append(vetor[i]).append(" posicao ").append(i+1).append(" pilha\n");
        }
        return resultado.toString();
    }
}
