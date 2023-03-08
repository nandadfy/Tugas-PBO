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
public class Tabung extends Lingkaran implements MenghitungRuang{

    private double tinggi;

    public Tabung(double tinggi, int jari) {
        super(jari);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    @Override
    public void setJari(double jari) {
        super.setJari(jari); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getJari() {
        return super.getJari(); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public double Volume() {
        return super.luas()*this.tinggi; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double LuasPerm() {
        return 2* super.luas() + super.keliling()*this.tinggi; //To change body of generated methods, choose Tools | Templates.
    }
}
   