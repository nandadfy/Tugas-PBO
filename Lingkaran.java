/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nandadwif_123210187;

/**
 *
 * @author asus
 */
public class Lingkaran implements MenghitungBidang{
    public double jari;

    public Lingkaran(double jari) {
        this.jari = jari;
    }

    public double getJari() {
        return jari;
    }

    public void setJari(double jari) {
        this.jari = jari;
    }
    
    @Override
    public double luas(){
        return Math.PI*jari*jari;
    }
    
    @Override
    public double keliling (){
        return 2*Math.PI*jari;
    }
}
