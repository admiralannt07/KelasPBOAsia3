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
public class Mobil {
    private String warna;
    private int kecepatan = 300;    
    private double harga = 600000;   
    private String merk;
    
    public Mobil(){
        System.out.println("Ini adalah konstruktor");
        this.harga = 900000.00;
        this.merk = "Toyota Supra";
        this.kecepatan = 300;
        this.warna = "Orange";
    }

    public Mobil(String warna, int kecepatan, double harga, String merk) {
        this.warna = warna;
        this.kecepatan = kecepatan;
        this.harga = harga;
        this.merk = merk;
    }

    public Mobil(String warna, String merk) {
        this.warna = warna;
        this.merk = merk;
    }
    
    public String getMerk() {
        return merk;
    }


    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    public void getInfo() {
        System.out.println("Merk : " + this.merk);
        System.out.println("Harga : " + getHarga());
        System.out.println("Kecepatan maksimal (km/jam) = " + this.kecepatan);
        System.out.println("Warna : " + this.warna);
    }
}
