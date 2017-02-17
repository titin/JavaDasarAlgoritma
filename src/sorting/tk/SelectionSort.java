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
public class SelectionSort {
    static int[] input = {4,3,6,8,2};
    
    public static void main(String[] args){
        PrintBeforeSort pbs = new PrintBeforeSort();
        pbs.PrintBeforeSort(input);
        selection_sort(input);
    }
    
    public static void selection_sort(int data[]){
        for (int i = 0; i< data.length - 1; i++){
            // index untuk tampung
            int index = i;
            System.out.print(" " + i);
            // pengulangan sebanyak data
            for (int j = i+1; j < data.length; j++){             
                if (data[j] < data[index])
                    index = j;
                       
                int smallerNumber = data[index];
                data[index] = data[i];
                data[i] = smallerNumber;
            }
            
        }
        
        PrintAfterSort pas = new PrintAfterSort();
        pas.PrintAfterSort(data);
        
    }
    
}
