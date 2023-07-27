package Entidades;

import java.time.LocalDate;


public class Pessoa {
    
    private String nome;
    private int cpf;
    private LocalDate dataNasc;
    private char genero;
    private String nacionalidade;
    private String email;
    
    public Pessoa(){

    }

    public Pessoa(String nome, int cpf, LocalDate dataNasc, char genero, String nacionalidade, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.genero = genero;
        this.nacionalidade = nacionalidade;
        this.email = email;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    


    
}
