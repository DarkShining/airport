/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areoport;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elliotthebert
 */
public class areoport {
    private List<gates> portes = new ArrayList();
    public areoport(){
        
    }
    public void addGates(gates g){
        portes.add(g);
    }
}
