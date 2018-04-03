/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

import java.util.Arrays;

/**
 *
 * @author 5002104
 */
public class MultiplicationTable {

    public static void main(String[] args) {
        
        int mtable [][] = new int[12][12];
        /*
        for (int row=0; row<mtable.length; row++) {
            for (int col=0; col<mtable[row].length; col++) {
                mtable[row][col] = (row+1) * (col+1);
                //System.out.print(mtable[row][col] + " ");
                System.out.print(String.format("%6s",mtable[row][col]));
            }
            System.out.println();
        }     */
        
        for (int row=0; row<mtable.length; row++) {
            Arrays.fill(mtable[row], 5);
            for (int col=0; col<mtable[row].length; col++) {
                System.out.print(mtable[row][col] + " ");
            }
            System.out.println();
        }
    }
    
}
