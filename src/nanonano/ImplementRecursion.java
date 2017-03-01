/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nanonano;

/**
 *
 * @author Titin Kurniati
 */
public class ImplementRecursion {
    public static void main(String[] args){
        rec("");
    }
    
    public static void rec(String text){
        if (text != ""){
            System.out.println(text);
        } else {
             rec("command");
            System.out.println( "isi dari : ");
        }
    }
}
