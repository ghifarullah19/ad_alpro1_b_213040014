package Tugas01;

import java.util.Scanner;

public class Jam {

    int jam, menit, detik;

    Scanner sc = new Scanner(System.in);

    void bacaJam() {
        do {
            System.out.print("Jam : ");
            jam = sc.nextInt();
        } while (jam < 0 || jam > 23);
        do  {
            System.out.print("Menit : ");
            menit = sc.nextInt();
        } while (menit < 0 || menit > 59);
        do {
            System.out.print("Detik : ");
            detik = sc.nextInt();
        } while (detik < 0 || detik > 59);
    }

    void tulisJam() {
        System.out.println(jam + ":" + menit + ":" + detik);
    }
    
    void ucapan() {
        if (jam >= 0 && jam <= 5) {
            System.out.println("Selamat Subuh");
        } else if (jam >= 6 && jam <= 10) {
            System.out.println("Selamat Pagi");
        } else if (jam >= 11 && jam <= 14) {
            System.out.println("Selamat Siang");
        } else if (jam >= 15 && jam <= 18) {
            System.out.println("Selamat Sore");
        } else if (jam >= 19 && jam <= 24) {
            System.out.println("Selamat Malam");
        }
    }

    String fungsiTulisJam() {
        return jam + ":" + menit + ":" + detik;
    }

    String fungsiUcapan() {
        String ucapan = "Jam:Menit:Detik";
        if (jam >= 0 && jam <= 5) {
            ucapan = "Selamat Subuh";
        } else if (jam >= 6 && jam <= 10) {
            ucapan = "Selamat Pagi";
        } else if (jam >= 11 && jam <= 14) {
            ucapan = "Selamat Siang";
        } else if (jam >= 15 && jam <= 18) {
            ucapan = "Selamat Sore";
        } else if (jam >= 19 && jam <= 24) {
            ucapan = "Selamat Malam";
        }
        return ucapan;
    }
}