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
public class Keramik2 {
    /* Atribute*/
    int panjang,lebar,isi,harga;
    
    /*Constructor*/
    Keramik2 (int p, int l, int i, int h) {
        this.panjang = p;
        this.lebar = l;
        this.isi = i;
        this.harga = h;
    }

    /* non-Void Methods*/
    int totalKeramik(){
        int total;
        int luas = 1000000;
        total = luas / (panjang * lebar);
        return total;
    }
    
    int totalBox() {
        int total;
        int luas = 1000000;
        total = luas / (panjang*lebar);
        total = total/isi;
        return total;
    }
    
    int totalHarga() {
        int total;
        int luas = 1000000;
        total = luas / (panjang * lebar);
        total = total/isi;
        total = total*harga;
        return total;
    }
}
