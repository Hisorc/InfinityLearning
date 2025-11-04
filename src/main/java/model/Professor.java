/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.List;

/**
 *
 * @author Henri
 */
public class Professor extends Usuario {
    private int IdProfessor;
    private List<Curso> listaCursosCadastrados;

    
    public Professor(){
        super();               
        this.IdProfessor = 0;
    }

    public Professor(String nome, String email, String cpf, String telefone, String endereco, String login, String senha, int IdProfessor, List<Curso> listaCursosCadastrados) {
        super(nome, email, cpf, telefone, endereco, login, senha);
        this.IdProfessor = IdProfessor;
        this.listaCursosCadastrados = listaCursosCadastrados;
    }
    
    /*
    @Override
    public String toString(){        
        String txt =  
        "---------- Professor -----------\n";
        txt += super.toString();
        txt += "CPF: "+ this.cpf+"\n"
        +"-------------------------------------\n";    
        return txt;               
    }

    
    @Override
    public boolean equals(Object obj) {
        Professor outro = (Professor) obj;
        if(!super.equals(obj))
            return false;
        else if(this.cpf.equals(outro.getCpf()))
            return false;
        
        return true;
    }        
        
    public void copiar(Professor outro){
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.cpf = outro.getCpf();    
    }
    
    public String cabecalho(){
        return "Nome;sexo;idade;cpf\n";
    }
    
    public String atributoToCSV(){
        String aux = this.nome + ";" + this.sexo +";"+this.idade+";"+this.cpf+ "\n";
        return aux;    
    }
    
    public void CSVToAtributo(String csv){
        String vetor[] = csv.split(";");
        
        this.nome = vetor[0];
        this.sexo = vetor[1].charAt(0);
        this.idade = Integer.parseInt(vetor[2]);
        this.cpf = vetor[3];
    }
    */        

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
