/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.asset;

/**
 *
 * @author A-15
 */
public class MobilSports extends Mobil implements KendaraanMotor{
    private double pajakBarangMewah = 500.0;
    private String asalnegara;

    public MobilSports(String asalnegara) {
        this.asalnegara = asalnegara;
    }

    public MobilSports() {
    }
    
    public MobilSports(double harga, String merk){
        super("Hitam", 600, 1500000.0, "Lamborghini");
        this.asalnegara = asalnegara;                 
    }

    @Override
    public void gasPol() {
        System.out.println("Ngegas sampai Kecepatan Max");
    }

    @Override
    public void rem() {
        System.out.println("Kendaraan berhenti");
    }
}
