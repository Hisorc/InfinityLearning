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
public class Aluno extends Usuario {
    private int IdAluno;
    private String metodoPagamento;
    private List<Curso> listaCursosComprados;
    
    
    public Aluno(){
        super();
        this.IdAluno = 0;
        this.metodoPagamento = "";    
    }

    public Aluno(String nome, String email, String cpf, String telefone, String endereco, String login, String senha, int IdAluno, String metodoPagamento) {
        super(nome, email, cpf, telefone, endereco, login, senha);
        this.IdAluno = IdAluno;
        this.metodoPagamento = metodoPagamento;
    }       
    
    /*
    public void copiar(Aluno outro){
        this.nome = outro.getNome();
        this.sexo = outro.getSexo();
        this.idade = outro.getIdade();
        this.matricula = outro.getMatricula();
        this.anoIngresso = outro.getAnoIngresso();                           
    }

    
    @Override
    public String toString() {
        String txt = "---- Dados do aluno ------\n"
        + super.toString()
        +" Matricula: "+ this.matricula+ "\n"
        +" Ano de ingresso: "+ this.anoIngresso + "\n"
        +"-------------------------------------\n";    
        
        return txt;
    }     
    
    public String cabecalho(){
        return "Nome;sexo;idade;matricula;ano\n";
    }
    
    public String atributoToCSV(){
        String aux = this.nome + ";" + 
                this.sexo +";"+
                this.idade+";"+
                this.matricula+ ";"+
                this.anoIngresso+ "\n";
        return aux;    
    }
    
        public void CSVToAtributo(String csv){
        String vetor[] = csv.split(";");
        
        this.nome = vetor[0];
        this.sexo = vetor[1].charAt(0);
        this.idade = Integer.parseInt(vetor[2]);
        this.matricula = vetor[3];
        this.anoIngresso = Integer.parseInt(vetor[4]);
    }
    */

    
    public int getIdAluno() {
        return IdAluno;
    }

    public void setIdAluno(int IdAluno) {
        this.IdAluno = IdAluno;
    }

    public String metodoPagamento() {
        return metodoPagamento;
    }

    public void metodoPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }
    
    public List<Curso> getCursosComprados() {
        return listaCursosComprados;
}

    public void setCursosComprados(List<Curso> listaCursosComprados) {
        this.listaCursosComprados = listaCursosComprados;
}
}
