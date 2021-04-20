/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.avizou.s2;


import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 *
 * @author romainavizou
 */
public class  Point extends FigureSimple {
    
    public static double RAYON_IN_DRAW = 5;

    private double px;
    private double py;

    public Point(double px, double py, Color couleur) {
        super(couleur);
        this.px = px;
        this.py = py;
    }

    public Point(double px, double py) {
        this(px, py, Color.BLACK);
    }

    public Point() {
        this(0, 0);
    }

    /**
     * @return the px
     */
    public double getPx() {
        return px;
    }

    /**
     * @param px the px to set
     */
    public void setPx(double px) {
        this.px = px;
    }

    /**
     * @return the py
     */
    public double getPy() {
        return py;
    }

    /**
     * @param py the py to set
     */
    public void setPy(double py) {
        this.py = py;
    }


    public String toString() {
        return "(" + px + "," + py + ')';
    }

    @Override
    public double maxX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double minX() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double maxY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double minY() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double distancePoint(Point p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void draw(GraphicsContext gc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}