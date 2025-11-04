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

    public Professor() {
        super();
        this.IdProfessor = 0;
    }

    public Professor(String nome, String email, String cpf, String telefone, String endereco, String login, String senha, int IdProfessor, List<Curso> listaCursosCadastrados) {
        super(nome, email, cpf, telefone, endereco, login, senha);
        this.IdProfessor = IdProfessor;
        this.listaCursosCadastrados = listaCursosCadastrados;
    }

    public int getIdProfessor() {
        return IdProfessor;
    }

    public void setIdProfessor(int IdProfessor) {
        this.IdProfessor = IdProfessor;
    }

    public List<Curso> getListaCursosCadastrados() {
        return listaCursosCadastrados;
    }

    public void setListaCursosCadastrados(List<Curso> listaCursosCadastrados) {
        this.listaCursosCadastrados = listaCursosCadastrados;
    }

}
