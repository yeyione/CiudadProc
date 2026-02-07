/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

import processing.core.PApplet;
import java.util.ArrayList;

public class Ciudad {

    PApplet app;
    ArrayList<Edificio> edificios;
    Personaje creeper;
    Suelo suelo;

    public Ciudad(PApplet app) {
        this.app = app;
        edificios = new ArrayList<>();
        
        suelo = new Suelo(app, 499, 200);

        edificios.add(new Edificio(app, 100, 300, 80, 200));
        edificios.add(new Edificio(app, 220, 250, 100, 250));
        edificios.add(new Edificio(app, 360, 320, 90, 180));
        edificios.add(new Edificio(app,500, 270, 100, 230));

        creeper = new Personaje(app, 0, 499);
    }

    public void actualizar() {
        creeper.actualizar();
    }

    public void dibujar() {
        suelo.dibujar();
        for (Edificio e : edificios) {
            e.dibujar();
        }
        creeper.dibujar();
    }
}