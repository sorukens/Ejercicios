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
public class Cuadrado extends Figura {
    private double lado;
    public Cuadrado(double l){
        super("cuadrado");
        this.lado=l;
    }
    public Cuadrado(){
    this(30);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    
    @Override
    public double area(){
    return this.lado*this.lado;
    }
}
