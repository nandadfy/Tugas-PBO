/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nandadwif_123210187;

import nandadwif_123210187.MenghitungBidang;

/**
 *
 * @author asus
 */
public class PersegiPanjang implements MenghitungBidang{
    public int panjang;
    public int lebar;

    public PersegiPanjang(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public float getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public float getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    

    @Override
    public double luas() {
    return lebar * panjang; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double keliling() {
    return 2 *(panjang + lebar); //To change body of generated methods, choose Tools | Templates.
    }
}
