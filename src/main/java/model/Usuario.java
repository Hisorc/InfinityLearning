/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Henri
 */
public class Usuario {
    protected String nome;
    protected String email;
    protected String cpf;
    protected String telefone;
    protected String endereco;
    protected String login;
    protected String senha;
    

    public Usuario() {
        this.nome = "";
        this.email = "";
        this.cpf = "";
        this.telefone = "";
        this.login = "";
        this.senha = "";
    }

    public Usuario(String nome, String email, String cpf, String telefone, String endereco, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
        this.login = login;
        this.senha = senha;
    } 

    /*@Override
    public String toString() {
        String txt = "Nome: " + this.nome +"\n"
        +"Sexo: "+ this.sexo + "\n"
        +"Idade: "+ this.idade+"\n";
        return txt;
    }   
    
    @Override
    public boolean equals(Object obj) {
        Usuario outro = (Usuario) obj;
        if(!this.nome.equals(outro.getNome()))
            return false;
        else if(this.idade != outro.getIdade())
            return false;
        else if(this.sexo != outro.getSexo())
            return false;
        
        return true;
    }
    */
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

   
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}

