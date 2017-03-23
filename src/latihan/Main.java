/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;
import java.util.Scanner;
/**
 *
 * @author ridho
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Pilihan ");
        System.out.println("1. Konversi angka ke kalimat");
        System.out.println("2. konversi kalimat ke angka");
        System.out.print("Masukkan pilihan : ");
        int pil = in.nextInt();
        switch(pil){
            case 1:System.out.print("Masukkan angka : ");
                    int x = in.nextInt();
                    ubah a = new ubah(x);
                    System.out.println(a.getAngkaHuruf());break;
            case 2:in.nextLine();
                    System.out.println("Masukkan huruf : ");
                    String b = in.nextLine();
                    String c[]= b.split(" ");
                    ubah d = new ubah(c);
                    System.out.println(d.getHurufAngka(c,c.length));break;
            default: System.out.println("menu tidak tersedia");
        }
    }
}
