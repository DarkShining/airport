/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areoport;

import static areoport.TypeGates.*;

/**
 *
 * @author elliotthebert
 */
 enum TypeGates{
     SMALL("porte national"),
     REGULAR("petite porte international"),
     BIG("grande porte international")
     ;
     
     private String info;
     TypeGates(String info){
         this.info = info;
     }
     @Override
     public String toString(){
         return info;
     }
}
public class gates {
    private int number;
    private boolean libre;
    private TypeGates type;
    private Vol vol;
    
    public gates(){
        number = 0;
        libre = true;
        type = SMALL;
        vol = null;
    }
    
    public gates(int number, TypeGates type, Vol vol){
        this.number = number;
        this.type = type;
        this.libre = true;
        this.vol = vol;
    }

    public int getNumber() {
        return number;
    }

    public boolean isLibre() {
        return libre;
    }

    public TypeGates getType() {
        return type;
    }

    public Vol getVol(){
        return vol;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public void setType(TypeGates type) {
        this.type = type;
    }
    
    public void setVol(Vol vol){
        this.vol = vol;
    }
    
    public String gatesInfo(){
        String result = "Numero de porte: "+number+"\n"+"Type de porte: "+type.toString();
        return  result;
    }
}
