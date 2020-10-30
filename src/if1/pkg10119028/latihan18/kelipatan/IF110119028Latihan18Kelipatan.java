/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan18.kelipatan;

/**
 *
 * @author
 * NAMA     : Rizal Sihombing
 * KELAS    : IF1
 * NIM      : 10119028
 * Deskripsi Program : Program ini berisi program untuk menampilkan kelipatan
 */
public class IF110119028Latihan18Kelipatan {

    /**
     * @param args the command line arguments
     */
    public static Double angka;
    public static void perulangan() {
        angka = 3.5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i * angka);
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        perulangan();
    }
    
}
