/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areoport;

/**
 *
 * @author elliotthebert
 */


public class avion {
    private int nbPassager;
    private TypeAvion type;

    public avion() {
        nbPassager = 0;
        type = null;
    }

    public avion(int nbPassager, TypeAvion type) {
        this.nbPassager = nbPassager;
        this.type = type;
    }

    public int getNbPassager() {
        return nbPassager;
    }

    public TypeAvion getType() {
        return type;
    }

    public void setNbPassager(int nbPassager) {
        this.nbPassager = nbPassager;
    }

    public void setType(TypeAvion type) {
        this.type = type;
    }
    
    @Override
    public String toString(){
        return "nombre de passager: "+nbPassager+"\n"+"type d'avions: "+type.toString()+"\n";
    }
    
}
