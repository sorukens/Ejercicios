/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Windows 10
 */
public class Circulo extends Figura{
    private double radio;
    public Circulo(double r){
        super("Circulo");
    this.radio=r;
    
    }
    public Circulo(){
    this(20);
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double area(){
    return Math.PI*(this.radio*2);
    }
}
