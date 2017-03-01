/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanonano;

import java.util.Scanner;

/**
 *
 * @author Titin Kurniati
 * cek bilangan ganjil dan genap
 */
public class CekBilanganGanjilGenap {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int next_in = in.nextInt();
        String s = cekBil(next_in);
        System.out.println(s);
    }
    
    
    public static String cekBil(int bilangan){
        String result = "";
        if (bilangan%2 == 0){
            result = "bilangan genap";
        } else if (bilangan%2 == 1){
            result = "bilangan ganjil";
        }
        return result;
    }
    
}
