/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main3;

import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class Kendaraan {
    static void Kendaraan(){
        System.out.println("========================================================");
        String namamobil, tipemobil, plat, brand;
        Double cc;
        
        //scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Nama mobil = ");
        namamobil = input.nextLine();
        System.out.println("Masukkan tipe mobil = ");
        tipemobil = input.nextLine();
        System.out.println("Masukkan Brand mobil = ");
        brand = input.nextLine();
        System.out.println("Masukkan Plat mobil = ");
        plat = input.nextLine();
        System.out.println("Masukkan CC mobil = ");
        cc = input.nextDouble();
        System.out.println("========================================================");
        
        //pemanggilan 
        System.out.println("Nama mobil = "+namamobil);
        System.out.println("Tipe Mobil = "+tipemobil);
        System.out.println("CC mobil = "+cc);
        System.out.println("Brand mobil = "+brand);
        System.out.println("Plat mobil = "+plat);
        System.out.println("========================================================");
    }
}
