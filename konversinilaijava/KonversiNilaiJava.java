/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package konversinilaijava;
import java.util.Scanner;
/**
 *
 * @author Nitro 5
 */
public class KonversiNilaiJava {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        int nilai;
        String nim, nama, matkul, prodi, jurusan, predikat;
        
        System.out.println("Masukkan Data");
        System.out.println("=============");
    
        System.out.print("Masukkan NIM : ");
        nim = keyboard.nextLine();
        
        System.out.print("Masukkan Nama : ");
        nama = keyboard.nextLine();
        
        System.out.print("Masukan Mata Kuliah : ");
        matkul = keyboard.nextLine();
        
        System.out.print("Masukkan Nilai Mahasiswa : ");
        nilai = keyboard.nextInt();

        //mengambil jurusan dari nim
        
        prodi = nim.substring(3, 5);
        
        // JIKA MENGGUNAKAN IF ELSE
        
//        if (prodi.equals("52")){
//            System.out.println("S1 - Teknologi Informasi");
//        } else if (prodi.equals("51")) {
//            System.out.println("S1 -Sistem Informasi");
//        } else if (prodi.equals("31")) {
//            System.out.println("D3 - Sistem Informasi");
//        } else {
//            System.out.println("Mohon maaf, prodi tersebut tidak ada.");
//        }

        switch (prodi) {
            case "52":
                jurusan = "S1 - Teknologi Informasi";
                break;
            case "51":
                jurusan = "S1 - Sistem Informasi";
                break;
            case "31":
                jurusan = "D3 - Sistem Informasi";
                break;
            default:
                jurusan = "Mohon maaf, prodi yang anda tuju tidak ada.";
                break;
        }
        
        //proses nilai
        
        if (nilai >= 90) {
            predikat = "A";
        } else if (nilai >= 85 && nilai <= 89) {
            predikat = "A-";
        } else if (nilai >= 75 && nilai <= 84 ) {
            predikat = "B+";
        } else if (nilai >= 70 && nilai <= 74) {
            predikat = "B";
        } else if (nilai >= 65 && nilai <= 69) {
            predikat = "B-";
        } else if (nilai >= 60 && nilai <= 64) {
            predikat = "C+";
        } else if (nilai >= 55 && nilai <= 59) {
            predikat = "C";
        } else if (nilai >= 50 && nilai <= 54) {
            predikat = "C-";
        } else if (nilai >= 45 && nilai <= 49) {
            predikat = "D";
        } else {
            predikat = "E";
        }
        
        //output
        System.out.println("====Hasil Pengelolahan Data====");
        System.out.println("NIM : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jurusan : " + jurusan);
        System.out.println("Mata Kuliah : " + matkul);
        System.out.println("Nilai : " + nilai);
        System.out.println("Predikat Nilai : " + predikat);
           
            
    }
    
}
