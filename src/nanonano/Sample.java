package nanonano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 */
public class Sample {
    
    
    public static void main(String[] args){
        double panjang = 10;
        double lebar = 5;
        double jumlah = 0;
        double kurang;
        double kali;
        double bagi;
        double modulus;
        
        int pnjg1 = 10;
        int lebar1 = 5;
        int hasil1;
        int hasil2;
        int hasil3;
        hasil1 = pnjg1 + lebar1;
        hasil2 = pnjg1-- + lebar1;
        hasil3 = pnjg1-- + lebar1;       
    
        
        System.out.println("hasil 1 = " + hasil1);
        System.out.println("hasil 2 = " + hasil2);
        System.out.println("hasil 3 = " + hasil3);
        
    
        jumlah = panjang + lebar;
                System.out.println("jumlah = " + jumlah);

        jumlah = panjang - lebar;
                System.out.println("jumlah = " + jumlah);

        kurang = panjang - lebar;
        kali = panjang * lebar;
        bagi = panjang / lebar;
        modulus = panjang % lebar;
        
        System.out.println("kurang = " + kurang);
        System.out.println("kali = " + kali);
        System.out.println("bagi = " + bagi);
        System.out.println("modulus = " + modulus);
        
        
        
        int number = 10;
        char letter = 'a';
        boolean result = true;
        String str = "";
        
        System.out.println(number);
        System.out.println(letter);
        System.out.println(result);
        System.out.println(str);
        
        //deklarasi variabel
		double a = 10;
		double b = 20;
		double c = 45;
		double rata;
		
		rata = (a + b + c)/3;
	
		//mencetak isi hasil variabel ke layar
		System.out.println("nilai 1=" + a);
		System.out.println("nilai 2=" + b);
		System.out.println("nilai 3=" + c);
		System.out.println("nilai rata-rata=" + rata);
                
                
                //deklarasi variabel
		int x = 23;
		int y = 7;
		int z = 15;
		
		int hasil;
		int hasil4;

		hasil= x > z? x:z;
		hasil4= hasil > z?hasil:z;

		
		//mencetak isi hasil variabel ke layar
		System.out.println("angka 1 : " + x);
		System.out.println("angka 2 : " + y);
		System.out.println("angka 3 : " + z);
		System.out.println("angka terbesar adalah " + hasil4);

                
    }
    
    
    
}
