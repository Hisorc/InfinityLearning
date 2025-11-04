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
public class Modulo {

    private String titulo;
    private int quantidadeAulas;
    private List<Aula> listaAulas;

    public Modulo(String titulo, int quantidadeAulas, List<Aula> listaAulas) {
        this.titulo = titulo;
        this.quantidadeAulas = quantidadeAulas;
        this.listaAulas = listaAulas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getQuantidadeAulas() {
        return quantidadeAulas;
    }

    public void setQuantidadeAulas(int quantidadeAulas) {
        this.quantidadeAulas = quantidadeAulas;
    }

    public Modulo(List<Aula> listaAulas) {
        this.listaAulas = listaAulas;
    }

    public List<Aula> getListaAulas() {
        return listaAulas;
    }

    public void setListaAulas(List<Aula> listaAulas) {
        this.listaAulas = listaAulas;
    }

}
