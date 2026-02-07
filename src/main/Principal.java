
package main;

import processing.core.PApplet;
import models.Ciudad;


public class Principal extends PApplet {
    
    Ciudad ciudad; 
    
    public static void main (String[] args){
        PApplet.main("main.Principal");
    }
    
    @Override
    public void settings(){
        size(800, 600);
    }
    
    @Override
    public void setup(){
        ciudad = new Ciudad(this);
    }
    
    @Override
    public void draw(){
        background(135, 206, 235);
        ciudad.dibujar();
        ciudad.actualizar();
        
    }
}
