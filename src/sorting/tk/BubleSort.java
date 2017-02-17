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
public class BubleSort {
    
    private static int[] number = {2,5,1,0,8,29};
    
    public static void main(String[] args){
        PrintBeforeSort pbs = new PrintBeforeSort();
        pbs.PrintBeforeSort(number);
        
        printAfterSorting(number);
    }
    
    private static void printBeforeSorting(int[] data){
        System.out.println("Number before sorting");
        for (int i = 0; i < data.length; i++){
            System.out.print(" " + data[i] + " ");
        }
    }
    
    private static void printAfterSorting(int[] data){
        System.out.println("Number After Sorting");
        int length_data = data.length;
        int temp = 0;
        for(int i = 0; i<length_data; i++){
            for(int j = 1; j<length_data - i; j++ ){
                if (data[j-1] > data[j]){
                    temp = data[j-1];
                    data[j-1] = data[j];
                    data[j] = temp;
                }
            }
        }
       PrintAfterSort pas = new PrintAfterSort();
       pas.PrintAfterSort(data);
    }
     
    
}
