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
public class TreillisProjet2 {
    

    public class Treillis {

    /**
     * Default constructor
     */
    public Treillis() {
    }
    }
    
    public class CatalogueBarre {

    /**
     * Default constructor
     */
    public CatalogueBarre() {
    }

    }
    public class TypeBarre {

    /**
     * Default constructor
     */
    public TypeBarre() {
    }

    /**
     * 
     */
    public int id;

    /**
     * 
     */
    public double coût;

    /**
     * 
     */
    public double lmax;

    /**
     * 
     */
    public double lmin;

    /**
     * 
     */
    public double Rtract;

    /**
     * 
     */
    public double Rcompress;


}


    public class Barre {

    /**
     * Default constructor
     */
    public Barre() {
    }

    /**
     * 
     */
    public int id;




}

public class Noeud {

    /**
     * Default constructor
     */
    public Noeud() {
    }

    /**
     * 
     */
    public int id;



}

    public class Terrain {

    /**
     * Default constructor
     */
    public Terrain() {
    }

    
    public double Xmin;

  
    public double Xmax;

   
    public double Ymin;

    
    public double Ymax;


}
    public class TriangleTerrain {

   
    public TriangleTerrain() {
    }

   
    public int id;

    
    public Segment segment1;

    
    public Segment segment2;

  
    public Segment segment3;

    
    public Terrain Triangle;

}
    public class Segment {

    
    public Segment() {
    }

    public Point debut;

    public Point fin;
    
    public Point getDebut(){
        return this.debut;
    }
    public Point getFin(){
        return this.fin;
    }
    public String toString() {
        return "[" + this.debut + "," + this.fin + ']';
    }
    public double maxX() {
        return Math.max(this.debut.maxX(), this.fin.maxX());
    }

 
    public double minX() {
        return Math.min(this.debut.minX(), this.fin.minX());
    }


    public double maxY() {
        return Math.max(this.debut.maxY(), this.fin.maxY());
    }

 
    public double minY() {
        return Math.min(this.debut.minY(), this.fin.minY());
    }

  
   

}
    public class Point {

    
    public Point() {
    }


    public double Px;

    public double Py;
    
    public double maxX() {
        return this.Px;
    }

    public double minX() {
        return this.Px;
    }
 
    public double maxY() {
        return this.Py;
    }
   
    public double minY() {
        return this.Py;
    }
   
    public double getPx (){
        return this.Px; 
    }
    public double getPy (){
        return this.Py;
    }
    public void setPx (double Px){
        this.Px=Px;
    }
    public void setPy (double Py){
        this.Py=Py;
    }
    public String toString() {
        return "(" + Px + "," + Py + ')';
    }
    
}
    
    public class NoeudSimple {

    
    public NoeudSimple() {
    }
    
    public double x;

   
    public double y;


    public Point position;

}
    public class Appuis {

   
    public Appuis() {
    }

    public double alpha;


    public TriangleTerrain TT;


    public int num;

    public boolean hypothese;


}
    public class AppuisSimple {

    public AppuisSimple() {
    }


}
    public class AppuiDouble {


    public AppuiDouble() {
    }


}
    public class AppuisEncastré {


    public AppuisEncastré() {
    }


} 
}