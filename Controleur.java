/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.avizou.s2;



/**
 *
 * @author romainavizou
 */
public class Controleur {
    
    private int etat;
    private Groupe model;
    private Interface vue;

    public Controleur(Groupe model, Interface vue) {
        this.etat = 30;
        this.model = model;
        this.vue = vue;
    }
    
    
}

