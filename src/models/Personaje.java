/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import processing.core.PApplet;

/**
 *
 * @author PC
 */
public class Personaje {
    PApplet app;
    Posicion pos;
    float velocidad = 2;
    
    public Personaje(PApplet app, float x, float y){
        this.app = app;
        this.pos = new Posicion(x, y);
    }
    
    public void actualizar() {
        pos.x += velocidad;
        if (pos.x > app.width) pos.x = -20;
    }
    
    public void dibujar(){
        app.fill(0, 200, 0);
        app.rect(pos.x, pos.y, 20, 30 );
        app.fill(0);
        app.rect(pos.x +4, pos.y, + 8,4,4);
        app.rect(pos.x +12, pos.y, + 8,4,4);
        
    }
}
