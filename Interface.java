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
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.VBox;
import javafx.scene.layout.HBox;

public class Interface extends BorderPane {

    private static void launch(String[] args) {

    }

    private ToggleButton tbBarre;
    private ToggleButton tbNoeuds;
    private VBox vbObj;
    private VBox VbCopCol;
    private HBox hbentete;
    private Button bCop;
    private Button bCol;
    private Button bSave;
    private Button bCouleur;
    private Button bSelect;
    private Button bsupp;
    private Groupe model;
    private DessinCanvasResizable zoneDessin;
    private Controleur control;

    public Interface() {
        this(new Groupe());
    }

    public Interface(Groupe model) {
        this.model = model;
        this.tbBarre = new ToggleButton("Barre");
        this.tbNoeuds = new ToggleButton("Noeud");
        this.vbObj = new VBox(this.tbBarre, this.tbNoeuds);
        this.setLeft(this.vbObj);
        this.bCop = new Button("Copier");
        this.bCol = new Button("Coller");
        this.VbCopCol = new VBox(this.bCop, this.bCol);
        this.bSave = new Button("Enregistrer");
        this.bCouleur = new Button("Couleur");
        this.bSelect = new Button("Selection");
        this.bsupp = new Button("Supprimer");
        this.hbentete = new HBox(this.bSave, this.bSelect, this.VbCopCol, this.bsupp);
        this.zoneDessin = new DessinCanvasResizable(this, this.model, 300, 200);

        this.setCenter(this.zoneDessin);

    }

    public Groupe getModel() {
        return model;
    }

    public Controleur getControl() {
        return control;
    }

    void redraw() {
        this.zoneDessin.redraw();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
