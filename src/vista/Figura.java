/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author UNICESAR-302
 */
public abstract class Figura {
    private String nombre;
    public Figura (String n){this.nombre=n;}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public abstract double area();
    public double calcularArea(){
    return this.area();
    }
    
}
