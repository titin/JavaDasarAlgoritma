package sorting.tk;


import sorting.tk.PrintBeforeSort;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 */
public class InsertionSort {
    private static int[] input = {2,5,8,4,3};
    
    public static void main(String[] args){

        PrintBeforeSort pbs = new PrintBeforeSort();
        pbs.PrintBeforeSort(input);
        insertion_sort(input);
        
    }
    
    private static void insertion_sort(int data[]){
        for (int j =1; j<data.length; j++){
            int i = j-1;
            int key = data[j];
            System.out.print(" " + j);
            while(( i > -1) && (data[i] > key)){
                data[i+1] = data[i];
                i--;
            }
            data[i+1] = key;
            PrintAfterSort pas = new PrintAfterSort();
            pas.PrintAfterSort(data);
        }
    }
    
}
