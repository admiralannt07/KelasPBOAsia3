/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maincode;
import com.asset.Mobil;
import com.asset.MobilSports;
/**
 *
 * @author A-15
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        System.out.println("Merk mobil1 = " + mobil1.getMerk());
        Mobil mobil2 = new Mobil("Hitam",150000,230,"Mclaren");
        System.out.println("Merk mobil2 = " + mobil2.getMerk());
        Mobil mobil3 = new Mobil("Putih", "Bugatti");
        System.out.println("Merk mobil3 = " + mobil3.getMerk());
        Mobil mobil4 = new MobilSports("Italy");
        System.out.println("Merk mobil4 = " + mobil4.getMerk());
        mobil4.getInfo();
        mobil4.setHarga(1200000);
        mobil4.getInfo();
        
        System.out.println("--- Dibawah ini adalah mobil sports ---");
        Mobil mobilSports2 = new MobilSports(14000000.0, "Lamborghini");
        mobilSports2.getInfo();
    } 
}
