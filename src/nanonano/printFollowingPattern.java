package nanonano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 * Write a Java program to display the following pattern. Go to the editor
Sample Pattern :

   J    a   v     v  a                                                  
   J   a a   v   v  a a                                                 
J  J  aaaaa   V V  aaaaa                                                
 JJ  a     a   V  a     a
 * 
 * 
 * 
 * 
 *  +"""""+                                                 
[| o o |]                                                
 |  ^  |                                                 
 | '-' |                                                 
 +-----+
 * 
 * 
 * 
 * 
 * * * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
 * * * * *  ==================================                          
* * * * * * ==================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================                          
==============================================
 
 */
public class printFollowingPattern {
       public static void main(String[] args) {
           cetakJava();
           cetakBenderaAmerika();
           cetakFace();
           
    }
       
       public static void cetakJava(){
        System.out.println("   J    a   v     v  a ");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");   
       }
       
       public static void cetakBenderaAmerika(){
           System.out.println("* * * * * * ======================");
           System.out.println(" * * * * *  ======================");
           System.out.println("* * * * * * ======================");
           System.out.println(" * * * * *  ======================");
           System.out.println("* * * * * * ======================");
           System.out.println(" * * * * *  ======================");
           System.out.println("* * * * * * ======================");
           System.out.println(" * * * * *  ======================");
           System.out.println("* * * * * * ======================");
           System.out.println("==================================");
           System.out.println("==================================");
           System.out.println("==================================");
           System.out.println("==================================");
           System.out.println("==================================");
           System.out.println("==================================");
           
       }
       
       public static void cetakFace(){
            System.out.println(" +\"\"\"\"\"+ ");
            System.out.println("[| o o |]");
            System.out.println(" |  ^  | ");
            System.out.println(" | '-' | ");
            System.out.println(" +-----+ ");
       }
}
