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
public class Keramik {
    int jenis,harga,panjang,lebar,pcs;

    void hitung(){
        int luasKeramik = 1000000;
        float jumlahKeramik;
        jumlahKeramik=luasKeramik/(this.panjang*this.lebar);
        if (jumlahKeramik - Math.round(jumlahKeramik) !=0){
            jumlahKeramik = (int) Math.round(jumlahKeramik) + 1;
        }
        float totalBox;
        totalBox = jumlahKeramik / this.pcs;
        if (totalBox - Math.round(totalBox) !=0) {
            totalBox = 1 + (int) Math.round(totalBox);
        }
        float hasilAkhir;
        hasilAkhir = totalBox*this.harga;
        System.out.println("Total keramik jenis ke-"+jenis+" adalah "+(int)totalBox+" pcs, dengan harga total adalah Rp. "+(int)hasilAkhir+" Rupiah.");
        
}
    
}