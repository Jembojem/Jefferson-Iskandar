/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik;

/**
 *
 * @author ROG
 */
public class ProjectKeramik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
     Keramik k1 = new Keramik();
        k1.jenis = 1;
        k1.panjang = 30;
        k1.lebar = 30;
        k1.harga = 54000;
        k1.pcs = 10;
        k1.hitung();
       
        
        Keramik k2 = new Keramik();
        k2.jenis = 2;
        k2.panjang = 40;
        k2.lebar = 40;
        k2.harga = 65000;
        k2.pcs = 5;
        k2.hitung();
        
        Keramik k3 = new Keramik();
        k3.jenis = 3;
        k3.panjang = 30;
        k3.lebar = 40;
        k3.harga = 60000;
        k3.pcs = 8;
        k3.hitung();
        
        System.out.println("Jadi keramik yang harus dibeli pak Bejo adalah keramik yang ke-1 dengan harga total yang paling murah.");

    }
}