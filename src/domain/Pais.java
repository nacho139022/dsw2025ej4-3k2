/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author nacho
 */
public class Pais {
    
    private String nombre;
    private String ISO;

    public Pais(String nombre, String String) {
        this.nombre = nombre;
        this.ISO = ISO;
    }

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public String getISO() {
        return ISO;
    }
    
    // Se sobrescribe para que en el JComboBox se muestre solo el nombre
    @Override
    public String toString() {
        return nombre;
    }
    
}
