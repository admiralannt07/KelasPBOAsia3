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
public class Motor implements KendaraanMotor{

    @Override
    public void gasPol() {
        System.out.println("Gas sampai 80 km/jam");
    }

    @Override
    public void rem() {
        System.out.println("Motor Berhenti");
    }
    
}
