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
public class Rectangulo extends Figura{
    private double base,altura;
    
    public Rectangulo(double b, double a){
    super("Rectangulo");
        this.base=b;this.altura=a;
    }
    public Rectangulo(){
    this(20,15);
    }
   /* public Rectangulo(){
    this("");
    }*/
   
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    @Override
    public double area(){
    return this.altura*this.base;
    }
}
