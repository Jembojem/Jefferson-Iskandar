/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkeramik2;

/**
 *
 * @author ROG
 */
public class ProjectKeramik2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Keramik2 k1 = new Keramik2(30,30,10,54000);
        System.out.println("Total keramik A yang diperlukan adalah " + k1.totalKeramik() + " keramik");
        System.out.println("Total box dari keramik A yang diperlukan adalah " + k1.totalBox() + " box");
        System.out.println("Total harga untuk keramik A adalah Rp " + k1.totalHarga() + " rupiah");
        System.out.println("--------------------------------------------------------------");
                
        Keramik2 k2 = new Keramik2(40,40,5,65000);
        System.out.println("Total keramik B yang diperlukan adalah " + k2.totalKeramik() + " keramik");
        System.out.println("Total box dari keramik B yang diperlukan adalah " + k2.totalBox() + " box");
        System.out.println("Total harga untuk keramik B adalah Rp " + k2.totalHarga() + " rupiah");
        System.out.println("--------------------------------------------------------------");
                
        Keramik2 k3 = new Keramik2(30,40,8,60000);
        System.out.println("Total keramik C yang diperlukan adalah " + k3.totalKeramik() + " keramik");
        System.out.println("Total box dari keramik C yang diperlukan adalah " + k3.totalBox() + " box");
        System.out.println("Total harga untuk keramik C adalah Rp " + k3.totalHarga() + " rupiah");
        System.out.println("--------------------------------------------------------------");
    }
    
}
