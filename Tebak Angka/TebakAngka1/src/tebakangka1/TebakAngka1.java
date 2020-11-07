/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka1;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class TebakAngka1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = (int) (Math.random() * 100);
        int skor = 100;
        System.out.println("Hai.. nama saya Mr. Chestrum, saya telah memilih sebuah bilangan bulat secara acak antara 0-100");
        System.out.println("Silahkan tebak berapa angka tersebut!!");
        do {
            System.out.println("Angka Tebakan anda : ");
            Scanner angka = new Scanner(System.in);
            int b = angka.nextInt();
                if (b == a) {
                    System.out.println("Selamat, bilangan tebakan anda Benar!!");
                    skor -= 100;
                    break;
                } else if (b < a) {
                    System.out.println("---------------------------------------");
                    System.out.println("Hehehe.. Bilangan yang anda pilih terlalu kecil");
                } else if (b > a) {
                    System.out.println("---------------------------------------");
                    System.out.println("Hehehe.. Bilangan yang anda pilih terlalu besar");
                }
                System.out.println("========== Silahkan ulangi lagi ==========");
        } while (skor > 0);
        
}
}
