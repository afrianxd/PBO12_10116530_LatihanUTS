/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116530_latihanuts5;

/**
 *
 * @author XD
 */
public class PBO12_10116530_LATIHANUTS5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JajarGenjang jjgj = new JajarGenjang(50,60,70,80,100,120);
        Segitiga sgtg = new Segitiga(50,60,70,100,120);
        
        jjgj.hitungKeliling();
        jjgj.hitungLuas();
        sgtg.hitungKeliling();
        sgtg.hitungLuas();
                
    }
    
}
