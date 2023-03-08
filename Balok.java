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
public class Balok extends PersegiPanjang implements MenghitungRuang{
    
    private int tinggi;

    public Balok(int tinggi, int panjang, int lebar) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    
    
    @Override
    public double Volume() {
        return super.luas()*tinggi; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double LuasPerm() {
        return 2*(panjang*lebar+panjang*tinggi+lebar*tinggi); //To change body of generated methods, choose Tools | Templates.
    }
    
}
