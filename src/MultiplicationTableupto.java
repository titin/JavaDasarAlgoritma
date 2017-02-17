
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 * question :  Write a Java program that 
 *              takes a number as input and prints its multiplication table upto 10
 */
public class MultiplicationTableupto {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int numb = in.nextInt();
        for (int x = 1; x<=10; x++){
            int y = numb * x;
            System.out.println(numb + " x " + x + " = " + y);
        }
    }
    
}
