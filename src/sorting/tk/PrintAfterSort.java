package sorting.tk;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 */
public class PrintAfterSort {
    public void PrintAfterSort(int data[]){
        System.out.println("Data setelah Sorting : ");
        for(int i = 0; i<data.length; i++){
            System.out.print(" " + data[i] + " ");
        }
        System.out.println(" ");
    }
    
}
