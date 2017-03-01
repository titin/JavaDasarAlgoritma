package nanonano;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Titin Kurniati
 */
public class PrintNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        print1to100(1, 100);

    }

    private static void print1to100(int from, int to) {
        for (from = 1; from <= to; from++) {
            int x = from + to;
            System.out.println("value x = " + x);
            if ((from % 5 == 0) & (from % 6 == 0)) {
                System.out.println("FiverBuzzer");
            } else {
                if (from % 5 == 0) {
                    System.out.println("Fiver");
                } else if (from % 6 == 0) {
                    System.out.println("Buzzer");

                } else {
                    System.out.println(from);
                }
            }

        }
    }
}
