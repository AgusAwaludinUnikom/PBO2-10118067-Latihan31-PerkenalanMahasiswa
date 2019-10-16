/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan31.perkenalanmahasiswa;

/**
 *
 * Agus Awaludin
 * 10118067
 * PBO2
 * Latihan ini berisi tentang bagaimana menampilkan nim dan nama mahasiswa
 */
public class PBO210118067Latihan31PerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.nim = "10118067";
        mhs.nama = "Agus Awaludin";
        mhs.perkenalanDiri();
        
        mhs.nim = "10110270";
        mhs.nama = "Indra Tiola";
        mhs.perkenalanDiri();
        
        mhs.nim = "10110271";
        mhs.nama = "Robi Tanzil Ganefi";
        mhs.perkenalanDiri();
        
        mhs.nim = "10110269";
        mhs.nama = "Muhammad Nur Awaludin";
        mhs.perkenalanDiri();
        
        
        
    }
    
}
