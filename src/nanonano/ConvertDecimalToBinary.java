package nanonano;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 */
public class ConvertDecimalToBinary {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input number: ");
        
          int bin_num[] = new int[100];
          int i = 1;
        int binary = in.nextInt();
        
        int quot = binary;
        System.out.println("quot = " + quot);
        
        while (quot != 0){
            bin_num[i++] = quot %2;
            System.out.println("bin_num : " + bin_num[i]);
            quot = quot / 2;
            System.out.println("quot : " + quot);
        }
        
        int j;
          System.out.print("Binary number is: ");
        for(j=i-1; j>0; j--)
        {
            System.out.print(bin_num[j]);
        }
        System.out.print("\n");
        
    }
    
}
