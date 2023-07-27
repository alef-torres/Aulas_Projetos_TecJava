package Entidades.Entidades;


public class Materia {
    
    private String nome;    
    private double nota;
    
    public Materia(){
    
    }
    
    public Materia(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public double getNota(){
        return nota;
    }
    
    
    
}
