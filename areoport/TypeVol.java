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
public enum TypeVol {
    NATIONAL("National"),
    INTERNATIONAL("International");
    private String description;
    TypeVol(String description){
        this.description = description;
    }
    @Override
    public String toString(){
        return description;
    }
}
