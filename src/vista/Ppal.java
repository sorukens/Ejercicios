/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.Scanner;

/**
 *
 * @author UNICESAR-302
 */
public class Ppal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int opc;
        System.out.println("1 para crear un cuadrado, 2 para un rectangulo,3 para un triangulo , 4 para un circulo");
        opc=sc.nextInt();
      Figura f=crearFigura(opc);
      verFigura(f);
        
    }
    
    public static void verFigura(Figura f){
        System.out.println("nombre: "+f.getNombre());
        System.out.println("Area: "+f.calcularArea());
    
    }
    
    public static Figura crearFigura(int t){
    switch(t){
    
        case 1: return new Cuadrado();
        case 2 : return new Rectangulo();
        case 3: return new Triangulo();
        case 4: return new Circulo();
        default: return null;
    }
    
    }
    
    
}
