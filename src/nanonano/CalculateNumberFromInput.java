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
public class CalculateNumberFromInput {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("input number one: ");
        int num_one = in.nextInt();
        System.out.println("input Number two: ");
        int num_two = in.nextInt();
        System.out.println("input number three: ");
        int num_three = in.nextInt();
        int average = (num_one + num_two + num_three) / 3;
        System.out.println("average = " + average);
    }
    
}
