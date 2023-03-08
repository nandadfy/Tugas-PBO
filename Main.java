/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nandadwif_123210187;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        char kembali;
        int menu, panjang,lebar,tinggiB,tinggiT;
        float jari;
        
        System.out.println("Hitung Keliling, Luas Permukaan, dan Volume Balok dan Tabung");
        System.out.println("==========");
        System.out.println("MENU UTAMA");
        System.out.println("==========");
        
        do{
        System.out.println("1. Hitung Balok");
        System.out.println("2. Hitung Tabung");
        System.out.println("0. Exit");
        System.out.print("Pilih: ");
        menu = userInput.nextInt();

        switch(menu){
            case 1: 
                System.out.print("Input panjang: ");
                panjang = userInput.nextInt();
                System.out.print("Input Lebar: ");
                lebar = userInput.nextInt();
                System.out.print("Input Tinggi: ");
                tinggiB = userInput.nextInt();
                
                Balok balok = new Balok( panjang, lebar, tinggiB);
                
                System.out.println("Luas Persegi Panjang : " + balok.luas());
                System.out.println("Keliling Persegi Panjang : " + balok.keliling());
                System.out.println("Luas Permukaan Balok : " + balok.LuasPerm());
                System.out.println("Volume Balok : " + balok.Volume());
                
            break;
            
            case 2:
                System.out.print("Input tinggi: ");
                tinggiT = userInput.nextInt();
                System.out.print("Input jari: ");
                jari = userInput.nextInt();
                
                Tabung tabung = new Tabung (jari, (int) tinggiT);
                
                System.out.println("Luas Lingkaran : " + tabung.luas());
                System.out.println("Keliling Lingkaran : " + tabung.keliling());
                System.out.println("Luas Permukaan Tabung : " + tabung.LuasPerm()); 
                System.out.println("Volume Tabung : " + tabung.Volume());
                
                
            break;
            default:
                System.out.println("Anda Telah Keluar");
            break;
			}
            
            System.out.println("Kembali ke Menu Utama? (y/n)");
            kembali = userInput.next().charAt(0);
                }
            while (kembali=='y'||kembali=='Y');

        // TODO code application logic here
    }
    
}
