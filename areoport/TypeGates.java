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
public enum TypeGates {
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
