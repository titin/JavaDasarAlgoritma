/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaArray.tk;

import java.util.Arrays;

/**
 *
 * @author Titin Kurniati
 * write program to sort a numeric array and a string array
 */
public class SortNumericStringArray {
    public static void main(String[] args){
        int[] numericArray = {1234, 5678, 9876, 7653, 3674};
        String[] stringArray = {"aku", "tidak", "andi", "malarang"};
        
        System.out.println("number before sort : " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("number after sort : " + Arrays.toString(numericArray));
        
        System.out.println("string before sort : " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("string after sort : " + Arrays.toString(stringArray));
        
    }
}
