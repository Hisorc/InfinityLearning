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
public class Biblioteca {

    private List<Material> listaMateriais;

    public Biblioteca(List<Material> listaMateriais) {
        this.listaMateriais = listaMateriais;
    }

    public List<Material> getListaMateriais() {
        return listaMateriais;
    }

    public void setListaMateriais(List<Material> listaMateriais) {
        this.listaMateriais = listaMateriais;
    }

}
