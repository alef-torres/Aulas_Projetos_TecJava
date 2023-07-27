package Entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Professor extends Pessoa {
    
    private float salario;
    
    private List<String> materias = new ArrayList<>();

    public Professor() {
    }

    public Professor(String nome, int cpf, LocalDate dataNasc, char genero, String nacionalidade, String email, float salario) {
        super(nome, cpf, dataNasc, genero, nacionalidade, email);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void addMateriais(String materia){
        materias.add(materia);
    }
    
    public void remoMaterias(String materia){
        materias.remove(materia);
    }
    
    
 
}
