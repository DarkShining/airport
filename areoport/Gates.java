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
public class Gates {
    private int number;
    private boolean libre;
    private TypeGates type;
    private Vol vol;
    
    public Gates(){
        number = 0;
        libre = true;
        type = null;
        vol = null;
    }
    
    public Gates(int number, TypeGates type, Vol vol){
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
        if(vol != null){
            result += vol.toString();
        }else{
            result += "Status de la porte: LIBRE\n";
        }
        return  result;
    }
}
