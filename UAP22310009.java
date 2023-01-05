/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uap22310009;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class UAP22310009 {

    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        
        String prodi = " ";
        String nim;
        String nama;
        String tanya;
        
        do {
            
            System.out.print("Masukkan NIM : ");
            nim = keyboard.nextLine();
            System.out.print("Masukkan Nama : ");
            nama = keyboard.nextLine();
            
            
            String id = nim.substring(3, 5);
            
            switch (id) {
                case "31" :
                    prodi = "D3 - Sistem Informasi";
                    break;
                case "51" :
                    prodi = "S1 - Sistem informasi";
                    break;
                case "52" :
                    prodi = "S1 - Teknologi Informasi";
                    break;
                default :
                    prodi = "tidak ditemukan";
                    break;
            }
            
            char urut = nim.charAt(nim.length() - 1);
            
            
            System.out.println("NIM = " + nim);
            System.out.println("NAMA = " + nama);
            System.out.println("Prodi = " + prodi);
            System.out.println("No Urut Masuk = " + urut);
            
            
            System.out.println("Apakah Anda ingin memasukkan data lagi [y/n]");
            tanya = keyboard.nextLine();
            
        } while(tanya.equalsIgnoreCase("y"));
        
        System.out.println("Thank You!");
    }
}
