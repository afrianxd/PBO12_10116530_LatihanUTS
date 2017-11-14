/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116530_latihanuts4;

/**
 *
 * @author XD
 */
public class PBO12_10116530_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Designer dsgr = new Designer();
        SystemAnalyst sa = new SystemAnalyst();
        Programmer prg = new Programmer();
        
        dsgr.bonusDesigner();
        sa.bonusSystemAnalyst();
        prg.bonusProgrammer();
    }
    
}
