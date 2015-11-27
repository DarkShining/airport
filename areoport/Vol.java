/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areoport;

import java.time.LocalDate;

/**
 *
 * @author elliotthebert
 */
public class Vol {
    private int numeroVol;
    private LocalDate heureArrive;
    private LocalDate heureDepart;
    private LocalDate heurePourPlient;
    private avion avion;
    private Vol type;

    public Vol() {
        numeroVol = 0;
        heureArrive = null;
        heureDepart = null;
        heurePourPlient = null;
        avion = null;
        type = null;
    }

    public Vol(int numeroVol, LocalDate heureArrive, LocalDate heureDepart, avion avion,LocalDate heurePourPlient, Vol type) {
        this.numeroVol = numeroVol;
        this.heureArrive = heureArrive;
        this.heureDepart = heureDepart;
        this.heurePourPlient = heurePourPlient;
        this.avion = avion;
        this.type = type;
    }

    public void setType(Vol type) {
        this.type = type;
    }

    public Vol getType() {
        return type;
    }

    public int getNumeroVol() {
        return numeroVol;
    }

    public LocalDate getHeureArrive() {
        return heureArrive;
    }

    public LocalDate getHeureDepart() {
        return heureDepart;
    }

    public avion getAvion() {
        return avion;
    }
    
    public LocalDate getHeurePourPlient(){
        return heurePourPlient;
    }

    public void setHeurePourPlient(LocalDate heurePourPlient) {
        this.heurePourPlient = heurePourPlient;
    }

    public void setNumeroVol(int numeroVol) {
        this.numeroVol = numeroVol;
    }

    public void setHeureArrive(LocalDate heureArrive) {
        this.heureArrive = heureArrive;
    }

    public void setHeureDepart(LocalDate heureDepart) {
        this.heureDepart = heureDepart;
    }

    public void setAvion(avion avion) {
        this.avion = avion;
    }
    
    public String toString(){
        return "Numero de vol: "+numeroVol+"\n"+"Type de vol: "+type.toString()+"\n"+avion.toString()+"\n"+"Heure d'arrivé: "+heureArrive.toString()+"\n"+"Heure de départ: "+heureDepart.toString()+"\n"+"heure pour faire le plient: "+heurePourPlient.toString()+"\n";
    }
    
    
}
