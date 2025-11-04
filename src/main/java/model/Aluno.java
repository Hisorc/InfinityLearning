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

    public Aluno() {
        super();
        this.IdAluno = 0;
        this.metodoPagamento = "";
    }

    public Aluno(String nome, String email, String cpf, String telefone, String endereco, String login, String senha, int IdAluno, String metodoPagamento) {
        super(nome, email, cpf, telefone, endereco, login, senha);
        this.IdAluno = IdAluno;
        this.metodoPagamento = metodoPagamento;
    }

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
