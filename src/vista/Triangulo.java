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
public class Triangulo extends Rectangulo{
   

    public Triangulo(){
        super(10,20);
        super.setNombre("Triangulo");
    }

   

    @Override
    public double area(){
    return (super.getBase()*super.getAltura())/2;
    
    }
   
    
}
