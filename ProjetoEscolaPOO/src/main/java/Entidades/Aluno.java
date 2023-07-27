package Entidades;

import Entidades.Entidades.Materia;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Aluno extends Pessoa {
    
   private List<Materia> ListaMaterias = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(String nome, int cpf, LocalDate dataNasc, char genero, String nacionalidade, String email) {
        super(nome, cpf, dataNasc, genero, nacionalidade, email);
    }
   
   
   
    
   public void addMateria(String nome, double nota){
       Materia Materias = new Materia(nome,nota);
       ListaMaterias.add(Materias);
   } 
   
   public void mostrarNomeMateria(){
    for (Materia materia : ListaMaterias){
        System.out.println(materia.getNome());
    }
}
   
   public void mostraNotaMateria(){
    for (Materia materia : ListaMaterias){
        System.out.println(materia.getNota());
    }
}
   
   public void mostrarNotaeNomeMateria(){
       for (Materia materia : ListaMaterias){
           System.out.println(materia.getNome() + materia.getNota());
       }
   }
   
   
}