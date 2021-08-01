/*
 * greedy, math
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Difficulty1000;

import java.util.Scanner;

/**
 *
 * @author hozhi
 */
public class NumbersBox1447B {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for (int i = 0; i < t; i++) {
            
            int row = s.nextInt();
            int column = s.nextInt();
            int[][] box = new int[row][column];
            int sum = 0, negative = 0, min = Integer.MAX_VALUE;
            
            for (int j = 0; j < row; j++) {
                
                for (int k = 0; k < column; k++) {
                    
                    box[j][k] = s.nextInt();
                    sum += Math.abs(box[j][k]);
                    
                    if (Math.abs(box[j][k]) < min) {
                        min = Math.abs(box[j][k]);
                    }
                    if (box[j][k] < 0) {
                        negative++;
                    }
                }
            }
            if (negative % 2 != 0) {
                sum -= 2 * (Math.abs(min));
            }
            System.out.println(sum);
        }
    }

}
