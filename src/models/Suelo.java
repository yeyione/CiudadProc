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
public class Suelo {
    PApplet app;
    float y;
    float alto;
    
    public Suelo(PApplet app, float y, float alto){
        this.app = app;
        this.y = y;
        this.alto = alto;   
    }
    
    public void dibujar(){
        app.noStroke();
        app.fill(80, 120, 80);
        app.rect(0, y, app.width, alto);
    }
    
}
