package Tugas02;

import java.util.Scanner;

public class Karyawan {
	/*
     * Tugas 2
     * 1. Menambahkan kode pegawai dengan tipe data string
     * 2. Menambahkan kehadiran dengan tipe data integer/number
     * 3. Menerima input kode pegawai
     * 4. Menerima input kehadiran
     * 5. Menambahkan gaji total dengan uang makan per kehadiran,
     * 	  dengan uang makan senilai 50,000.
     */
	
    int gol;
    double gapok, tunjangan, bonus, gatot;
    
    // 1. Menambahkan kode pegawai
    String kodeP;
    
    // 2. Menambahkan kehadiran
    int hadir;
    
    void BacaKaryawan() {
        Scanner sc = new Scanner(System.in);
        
        // Input golongan
        System.out.print("Gol: "); 
        gol = sc.nextInt();
        // Input golongan
        
        // 3. Input kode pegawai
        System.out.print("Kode Pegawai: "); 
        kodeP = sc.next();
        
        // 4. Input hadir
        System.out.print("Hadir: ");
        hadir = sc.nextInt();
        
        SetGapokBonus();
        
        //tunjangan = HitungTunjangan();
        gatot = HitungGatot();
    }
    
    void SetGapokBonus() {
        switch (gol) {
            case 1:
                gapok = 2000000;
                bonus = 0;
                tunjangan = gapok * 0.02;
                break;
            case 2:
                gapok = 2500000;
                bonus = 100000;
                tunjangan = gapok * 0.02;
                break;
            case 3:
                gapok = 3000000;
                bonus = 200000;
                tunjangan = gapok * 0.03;
                break;
            case 4:
                gapok = 4000000;
                bonus = 300000;
                tunjangan = gapok * 0.04;
                break;
            default:
                System.out.println("Tidak Valid");
                break;
        }
    }
    
    double HitungTunjangan() {
        return gapok * 0.02;
    }
    
    double HitungGatot() {
    	// 5. Menambahkan gaji total dengan uang makan = 50000
    	double gajiTotal;
    	
    	// gaji total = gaji pokok + bonus + tunjangan + uang makan (50000)
    	// gaji total = gaji pokok + bonus + tunjangan + (uang makan * hadir)
    	gajiTotal = gapok + bonus + tunjangan + (50000 * hadir);
    	
    	return gajiTotal;
    }
    
    void TulisKaryawan() {
    	System.out.println("Gol: " + gol + ", " + 
    			"Gapok: " + gapok + ", " + 
    			"Bonus: " + bonus + ", " + 
    			"Tunjangan: " + tunjangan + ", " +
    			"Gatot: " + gatot + ", " +
    			"Kode Pegawai: " + kodeP + ", " +
    			"Hadir: " + hadir);
    	/*Locale LocaleID = new Locale("id", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(LocaleID);
        System.out.println(formatRupiah.format(gapok));*/
    }
    
    public static void main(String[] args) {
		Karyawan K = new Karyawan();
		
		K.BacaKaryawan();
		//K.SetGapokBonus();
		//K.HitungTunjangan();
		//System.out.println(K.HitungGatot());
		K.TulisKaryawan();
	}
}