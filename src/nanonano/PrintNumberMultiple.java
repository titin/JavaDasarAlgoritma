package nanonano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 * cetak angka 1 sampai 100 dan di setiap kelipatan angka 3 cetak "kelipatan tiga"
 * untuk setiap kelipatan angka 5 cetak "kelipatan lima"
 * untuk setiap kelipatan angka 3 dan lima cetak "kelipatan 3 dan 5"
 */
public class PrintNumberMultiple {
    
    public static void main(String[] args){
        for (int i = 1; i <= 100; i++){
            if ((i%3 == 0) && (i % 5 == 0)){
                System.out.println("kelipatan 3 dan 5");
            } else
             if ((i % 3) == 0 ){
                System.out.println("kelipatan 3" );
            } else if (i % 5 == 0){
                System.out.println("kelipatan 5");
            } else {
                System.out.println(i);
            }
        }    
    }
    
}
