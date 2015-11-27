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
}
public class gates {
    private int number;
    private boolean libre;
    private TypeGates type;
    
    public gates(){
        number = 0;
        libre = true;
        type = SMALL;
    }
    
    public gates(int number, TypeGates type){
        this.number = number;
        this.libre = true;
        this.type = type;
    }
}
