/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.insa.avizou.s2;


import java.util.ArrayList;
import java.util.List;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * @author romainavizou
 */

    public class Groupe extends Figure {

    private List<Figure> contient;

    public Groupe() {
        this.contient = new ArrayList<Figure>();
    }
  
    public void add(Figure f) {
        if (f.getGroupe() != this) {
            if (f.getGroupe() != null) {
                throw new Error("figure déja dans un autre groupe");
            }
            this.contient.add(f);
            f.setGroupe(this);
        }
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
     public static Groupe groupeTest() {
        Point p1 = new Point(10,10);
        Point p2 = new Point(100, 10);
        Point p3 = new Point(100, 100);
        Point p4 = new Point(10, 100);
        Point p5 = new Point(50, 50);
        Groupe res = new Groupe();
        return res;
     }
}
