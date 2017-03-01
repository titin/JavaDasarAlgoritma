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
public class InputNumber {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input number pertama: ");
        int numb_one = scanner.nextInt();
        System.out.print("Input Number Kedua: ");
        int numb_two = scanner.nextInt();
        int numb = numb_one * numb_two;
        System.out.println(" " + numb_one + " x " + numb_two + " = " + numb);
    }
}
