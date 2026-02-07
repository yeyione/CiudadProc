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
public class Edificio {
    
    PApplet app;
    Posicion pos;
    float ancho,  alto;
    
    public Edificio(PApplet app, float x, float y, float ancho, float alto) {
        this.app = app;
        this.pos = new Posicion(x, y);
        this.ancho = ancho;
        this.alto = alto;
}
    public void dibujar(){
        app.fill(170);
        app.rect(pos.x, pos.y, ancho, alto);
        
        app.fill(255, 230,120);
        app.stroke(100);
        
        float margenX = 10;
        float margenY = 15;
        float ventanaAncho = 15;
        float ventanaAlto = 20;
        float espacioX = 10;
        float espacioY = 15;
        
        for (float y = pos.y + margenY;
                y + ventanaAlto < pos.y + alto;
                y += ventanaAlto + espacioY){
                
            for (float x = pos.x + margenX;
                    x + ventanaAncho < pos.x + ancho;
                    x += ventanaAncho + espacioX) {
                    app.rect(x, y, ventanaAncho, ventanaAlto);
            }
        }
     
    }
}



    
   
