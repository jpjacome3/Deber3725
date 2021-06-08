/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author JEAN_PIERRE
 */
public class PruebaC {
    public static void main(String[] args){
        Cubo cubo1 = new Cubo(3,2,6);
        cubo1.volumen();
        System.out.println("El volumen del cubo es= "+cubo1.volumen());
        
        Cuadrilatero ob1 = new Cuadrilatero();
        ob1.altura = 3;
        ob1.base = 5;
        
        System.out.println("El area del cuadrilatero es= "+ob1.Area());
        System.out.println("El perimetro del cuadrialtero es= "+ob1.Perimetro());
    }
}
