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
public class Cubo {
    int ancho;
    int alto;
    int profundo;
    
    public Cubo(int ancho, int alto, int profundo){
       this.ancho = ancho;
       this.alto = alto;
       this.profundo = profundo;
    }

    public Cubo(){
  
    }
    public int volumen(){
        int V;
        V = this.alto * this.ancho * this.profundo;
        return V;
    }
}

