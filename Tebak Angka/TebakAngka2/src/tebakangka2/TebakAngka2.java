/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tebakangka2;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class TebakAngka2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = (int) (Math.random() * 100);
        int skor = 100;
        int bonus = 10;
        System.out.println("Hai.. nama saya Mr. Chestrum, saya telah memilih sebuah bilangan bulat secara acak antara 0-100");
        System.out.println("Silahkan tebak berapa angka tersebut!!");
        do {
            System.out.println("Angka Tebakan anda : ");
            Scanner angka = new Scanner(System.in);
            int b = angka.nextInt();
                if (b == a) {
                    System.out.println("Selamat, bilangan tebakan anda Benar!!");
                    System.out.println("Score anda adalah " + skor +" poin");
                    if (0 >= skor) {
                        System.out.println("========== GAME OVER ==========");
                    }
                    if (bonus > 0) {
                        skor += 50;
                        System.out.println("Anda mendapat tambahan 50 poin karena dapat menjawab tidak lebih dari 5 tebakan");
                        System.out.println("Score akhir anda adalah " + skor +" poin");
                    }
                    break;
                    
                } else if (b < a) {
                    System.out.println("---------------------------------------");
                    System.out.println("Hehehe.. Bilangan yang anda pilih terlalu kecil");
                    skor -= 2;
                    bonus -= 1;
                } else if (b > a) {
                    System.out.println("---------------------------------------");
                    System.out.println("Hehehe.. Bilangan yang anda pilih terlalu besar");
                    skor -= 2;
                    bonus -= 1;
                }
                System.out.println("========== Silahkan ulangi lagi ==========");
        } while (skor > 0);
    }
    
}
